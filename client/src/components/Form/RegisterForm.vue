<template>
    <div>
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post" class="flex flex-col gap-2">
                <div class="w-full text-[13px]" v-show="errors.length > 0">
                    <span class="text-red-700">Ops! {{ errors }}</span>
                </div>
                <div class="flex w-full flex-1 gap-3">
                    <InputFieldIcon @form-validate="validateForm" v-model:valueInput="formData.firstName"
                        :component-data="firstNameComponent" />
                    <InputFieldIcon @form-validate="validateForm" v-model:valueInput="formData.lastName"
                        :component-data="lastNameComponent" />
                </div>
                <InputFieldIcon @form-validate="validateForm" v-model:valueInput="formData.email"
                    :component-data="emailComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model:valueInput="formData.password"
                    :component-data="passwordComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model:valueInput="formData.passwordConfirm"
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
                        <p @click="props.toggleModal" class="px-5 cursor-pointer uppercase font-bold">Back</p>
                        <button type="submit"
                            class="bg-red-600 py-3 px-6 w-40 -skew-x-[30deg] border-none outline-none">
                            <p class="skew-x-[30deg] text-white tracking-widest text-xs font-bold uppercase">
                                Sign up
                            </p>
                        </button>
                    </div>
                </div>
            </form>
        </div>
        <ToastifyMessage v-if="isRegister" message="Register successfully, You can sign in now !" />
    </div>
</template>

<script setup lang="ts">
import { ComputedRef, computed, ref } from 'vue';
import InputFieldIcon from './InputFieldIcon.vue';
import {
    formData,
    passwordComponent,
    passwordConfirmComponent,
    emailComponent,
    lastNameComponent,
    firstNameComponent
} from '@components/Validate/RegisterValid';
import { useStore } from 'vuex';
import ToastifyMessage from '../Element/ToastifyMessage.vue';

// DEFINE PROP
const props = defineProps({
    toggleModal: {
        type: Function,
        required: true,
    }
})

// DEFINE STORE
const store = useStore();

// USE STORE
const isRegister: ComputedRef<boolean> = computed(() => store.state.auth.isRegister);

// DEFINE CONSTANT
const checkFormValid = ref(false);
const errors = ref('');

// METHODS
const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
}

const submitForm = (event: Event) => {
    event.preventDefault();
    const formValue = Object.values(formData);
    const hasEmptyValue = formValue.some((value) => value === "");
    if (checkFormValid && !hasEmptyValue) {
        if (formData.password != formData.passwordConfirm) {
            errors.value = "Password is not match";
        } else {
            errors.value = "";
            store.dispatch("auth/register", formData)
                .then(() => {
                    console.log('Register successfully !');
                    props.toggleModal();
                })
                .catch((error) => {
                    console.log(error);
                });
        }
    } else {
        errors.value = "Fail to create account, please check again";
    }

};

</script>