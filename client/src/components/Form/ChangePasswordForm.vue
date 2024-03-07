<template>
    <div>
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post" class="flex flex-col gap-2">
                <div class="w-full text-[13px]" v-show="errors.length > 0">
                    <span class="text-red-700">Ops! {{ errors }}</span>
                </div>
                <InputFieldIcon @form-validate="validateForm" v-model="formData.password"
                    :component-data="passwordComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model="formData.passwordConfirm"
                    :component-data="passwordConfirmComponent" />
            </form>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import InputFieldIcon from './InputFieldIcon.vue';
import {
    formData,
    passwordComponent,
    passwordConfirmComponent
} from '@components/Validate/RegisterValid';

// ----------------DEFINE PROPS-----------------

// ----------------DEFINE CONSTANTS-----------------
const checkFormValid = ref(false);
const errors = ref('');

// ----------------DEFINE MOTHODS-----------------
const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
}

const submitForm = (event: Event) => {
    event.preventDefault();
    if (formData.password != formData.passwordConfirm) {
        errors.value = "Password is not match";
    } else {
        errors.value = "";
        console.log(formData);
    }
};

</script>