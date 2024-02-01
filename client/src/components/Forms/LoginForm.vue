<template>
    <div :class="props.className">
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post">
                <GroupSocialLogin />
                <p class="text-sm mt-5">Please enter your registered account to sign in MSI member center!</p>
                <div
                    class="my-4 flex items-center before:mt-0.5 before:flex-1 before:border-t before:border-neutral-300 after:mt-0.5 after:flex-1 after:border-t after:border-neutral-300">
                    <p class="mx-4 mb-0 text-center dark:text-white text-sm">
                        Or
                    </p>
                </div>
                <!-- Email input -->
                <InputField @form-validate="validateForm" v-model="formData.email" :component-data="emailComponent" />
                <!-- Password input -->
                <InputField @form-validate="validateForm" v-model="formData.password" :component-data="passwordComponent" />

                <div class="mb-6 flex items-center justify-between text-sm">
                    <div class="mb-[0.125rem] min-h-[1.5rem] pl-[0.5rem] items-center flex gap-2">
                        <input class="" type="checkbox" value="" id="exampleCheck2" />
                        <label class="inline-block pl-[0.15rem] hover:cursor-pointer" for="exampleCheck2">
                            Remember me
                        </label>
                    </div>
                    <a href="#!">Forgot password?</a>
                </div>

                <!-- Login action -->
                <div class="text-center lg:text-left">
                    <button :disabled="!checkFormValid" type="submit"
                        class="px-5 flex justify-between items-center py-3 w-60 rounded-sm bg-red-600 text-gray-100">
                        <p>Sign In</p>
                        <svg class="w-5" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg"
                            stroke="#ffffff">
                            <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                            <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                            <g id="SVGRepo_iconCarrier">
                                <path d="M9.71069 18.2929C10.1012 18.6834 10.7344 18.6834 11.1249 18.2929L16.0123 13.4006C16.7927 12.6195 16.7924 
                                    11.3537 16.0117 10.5729L11.1213 5.68254C10.7308 5.29202 10.0976 5.29202 9.70708 5.68254C9.31655 6.07307 9.31655
                                     6.70623 9.70708 7.09676L13.8927 11.2824C14.2833 11.6729 14.2833 12.3061 13.8927 12.6966L9.71069 16.8787C9.32016
                                      17.2692 9.32016 17.9023 9.71069 18.2929Z" fill="#fafafa">
                                </path>
                            </g>
                        </svg>
                    </button>

                    <!-- Register link -->
                    <p class="mb-0 mt-2 pt-1 text-sm font-semibold">
                        Don't have an account?
                        <a href="#!" class="text-red-500 transition duration-150 ease-in-out
                        hover:text-red-600 focus:text-red-600 active:text-red-700">
                            Register
                        </a>
                    </p>
                </div>
            </form>
        </div>
    </div>
</template>

<script setup lang="ts">
import GroupSocialLogin from '@components/Elements/GroupSocialLogin.vue';
import InputField from './InputField.vue';
import { formData, emailComponent, passwordComponent } from '@components/Validate/SignInValid';
import { ref } from 'vue';

// Define props recieved from parent
const props = defineProps({
    className: {
        type: String,
        required: true,
    }
});

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