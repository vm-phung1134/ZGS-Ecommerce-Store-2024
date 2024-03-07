<template>
    <div :class="props.className">
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post">
                <div class="flex gap-5 mb-5 justify-between items-center w-full">
                    <SelectBoxForm class-name="w-full z-10" :array-value="[]" selected-value="Vietnam" />
                    <SelectBoxForm class-name="w-full z-10" :array-value="arrayListCity" :selected-value="selectedValueCity" />
                </div>
                <TextAreaForm @form-validate="validateForm" v-model="formData.address"
                    :component-data="addressComponent" />
                <div class="flex gap-5 w-full">
                    <InputFieldNormal @form-validate="validateForm" v-model="formData.phone"
                        :component-data="phoneComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model="formData.postCode"
                        :component-data="postCodeComponent" />
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
import SelectBoxForm from './SelectBoxForm.vue';
import { ref } from 'vue';
import {
    formData,
    phoneComponent,
    postCodeComponent,
    addressComponent,
} from '@components/Validate/AddressValid';
import TextAreaForm from './TextAreaForm.vue';
import { SelectType } from './SelectBoxForm.vue';

// -----------------DEFINE PROPS------------------
const props = defineProps({
    className: {
        type: String,
        required: true,
    },
    toggleModal: {
        type: Function,
        required: true,
    },
    arrayListCity: {
        type: Array as () => SelectType[],
        required: true
    },
    selectedValueCity: {
        type: String,
        required: true
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