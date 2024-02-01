import { ref } from 'vue';

export let formData = ref({
    email: '',
    password: ''
})

export const emailComponent = ref({
    type: 'text',
    id: 'email',
    placeholder: 'Email address',
    label: 'Email address',
    errMsg: "Email is invalid!",
    pattern: "^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$",
    minLength: 5,
    maxLength: 100,
});

export const passwordComponent = ref({
    type: 'password',
    id: 'current-password',
    placeholder: 'Password',
    label: 'Password',
    errMsg: "Password is invalid!",
    pattern: "",
    minLength: 3,
    maxLength: 50,
});