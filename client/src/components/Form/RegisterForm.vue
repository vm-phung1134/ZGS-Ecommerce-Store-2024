<template>
    <div>
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post" class="flex flex-col gap-2">
                <div class="flex w-full flex-1 gap-3">
                    <InputFieldIcon @form-validate="validateForm" v-model="formData.firstName"
                        :component-data="firstNameComponent" />
                    <InputFieldIcon @form-validate="validateForm" v-model="formData.lastName"
                        :component-data="lastNameComponent" />
                </div>
                <InputFieldIcon @form-validate="validateForm" v-model="formData.email" :component-data="emailComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model="formData.password"
                    :component-data="passwordComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model="formData.passwordConfirm"
                    :component-data="passwordConfirmComponent" />
                <div class="flex justify-between">
                    <p class="mb-0 mt-2 pt-1 text-sm font-semibold">
                        Already have an account?
                        <a href="#!" class="text-green-500 transition duration-150 ease-in-out
                        hover:text-green-600 focus:text-green-600 active:text-green-700">
                            Sign in
                        </a>
                    </p>
                    <div class="flex gap-3 text-sm items-center">
                        <p @click="props.toggleModal" class="px-5 cursor-pointer">Back</p>
                        <button type="submit"
                            class="w-full rounded-md bg-red-600 text-gray-100 px-10 py-3">
                            Sign up
                        </button>
                    </div>
                </div>
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
    passwordConfirmComponent,
    emailComponent,
    lastNameComponent,
    firstNameComponent
}
    from '@components/Validate/RegisterValid';

const props = defineProps({
    toggleModal: {
        type: Function,
        required: true,
    }
})

const checkFormValid = ref(false);

const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
}

const submitForm = (event: Event) => {
    event.preventDefault();
    // Submit and print out object
    console.log(formData.value);
};

</script>