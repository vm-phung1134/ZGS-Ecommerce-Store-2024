<template>
    <div :class="props.className">
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post">
                <InputFieldNormal @form-validate="validateForm" v-model="formData.fullname"
                    :component-data="fullnameComponent" />
                <InputFieldNormal @form-validate="validateForm" v-model="formData.numberCard"
                    :component-data="numberCardComponent" />
                <div class="flex justify-between w-full gap-2">
                    <InputFieldNormal @form-validate="validateForm" v-model="formData.since"
                        :component-data="sinceComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model="formData.valid"
                        :component-data="validComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model="formData.cvv"
                        :component-data="cvvComponent" />
                </div>
                <div class="flex justify-end">
                    <button @click="props.toggleModal" class="px-5">Cancel</button>
                    <button class="bg-green-700 text-white px-10 py-3">Confirm</button>
                </div>
            </form>
        </div>
    </div>
</template>

<script setup lang="ts">
import InputFieldNormal from './InputFieldNormal.vue';
import { ref } from 'vue';
import {
    formData,
    fullnameComponent,
    cvvComponent,
    sinceComponent,
    numberCardComponent,
    validComponent
} from '@components/Validate/PaymentMethodValid';

// -----------------DEFINE PROPS------------------
const props = defineProps({
    className: {
        type: String,
        required: true,
    },
    toggleModal: {
        type: Function,
        required: true,
    }
});

// -----------------DEFINE CONSTANTS------------------

const checkFormValid = ref(false);

// -----------------DEFINE METHODS------------------
const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
};

const submitForm = (event: Event) => {
    event.preventDefault();
    // const formValue = Object.values(formData);
    // console.log(formValue)

};

</script>