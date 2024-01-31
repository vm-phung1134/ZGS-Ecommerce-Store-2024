import { ref } from 'vue';

export let emailModal = ref("");
export let passwordModal = ref("");

export const emailComponent = ref({
    type: 'text',
    id: 'email',
    placeholder: 'Email address',
    label: 'Email address',
    errMsg: null,
    pattern: "",
    minLength: 5,
    maxLength: 100,
});

export const passwordComponent = ref({
    type: 'password',
    id: 'current-password',
    placeholder: 'Password',
    label: 'Password',
    errMsg: null,
    pattern: "",
    minLength: 8,
    maxLength: 50,
});