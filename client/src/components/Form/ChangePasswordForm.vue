<template>
    <div>
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post" class="flex flex-col gap-2">
                <div class="w-full text-[13px]" v-show="errors.length > 0">
                    <span class="text-red-700">Ops! {{ errors }}</span>
                </div>
                <input type="text" id="username" name="username" autocomplete="username" class="hidden"
                    aria-hidden="true" />
                <InputFieldIcon @form-validate="validateForm" v-model:value-input="formData.password"
                    :component-data="passwordComponent" />
                <InputFieldIcon @form-validate="validateForm" v-model:value-input="formData.passwordConfirm"
                    :component-data="passwordConfirmComponent" />
                <button type="submit" class="bg-red-600 py-2 px-6 w-40 -skew-x-[30deg] border-none outline-none">
                    <p class="skew-x-[30deg] text-white tracking-widest text-xs font-bold uppercase">
                        Confirm
                    </p>
                </button>
            </form>
        </div>
    </div>
</template>

<script setup lang="ts">
import { computed, ref } from 'vue';
import InputFieldIcon from './InputFieldIcon.vue';
import {
    formData,
    passwordComponent,
    passwordConfirmComponent
} from '@components/Validate/ChangePasswordValid';
import { useStore } from 'vuex';
import { useRouter } from 'vue-router';

// DEFINE STORE
const store = useStore();
const router = useRouter();

// USE STORE
const infoUser = computed(() => store.getters['auth/getInforUser']);

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
    if (checkFormValid.value && !hasEmptyValue) {
        if (formData.password != formData.passwordConfirm) {
            errors.value = "Password is not match";
        } else {
            errors.value = "";
            store.dispatch("auth/changePasswordUser", { email: infoUser.value.email, ...formData })
                .then(() => {
                    store.dispatch('auth/logout').then(() => {
                        router.push("/sign-in");
                    }).catch((error) => {
                        console.log(error);
                    });
                })
                .catch((error) => {
                    console.log(error);
                    errors.value = "Password is invalid";
                });
        }
    }
    else {
        errors.value = "Fail to change password !";
    }

};

</script>