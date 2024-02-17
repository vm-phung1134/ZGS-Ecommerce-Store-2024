import { ref } from "vue";

export let formData = ref({
  firstName: "",
  lastName: "",
  email: "",
  password: "",
  passwordConfirm: "",
});

export const emailComponent = ref({
  type: "text",
  id: "email",
  placeholder: "Email address",
  label: "Email address",
  errMsg: "Email is invalid!",
  pattern: "^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$",
  minLength: 5,
  maxLength: 100,
});

export const lastNameComponent = ref({
  type: "text",
  id: "last-name",
  placeholder: "Last Name",
  label: "Last name",
  errMsg: "Last name is invalid!",
  pattern: "",
  minLength: 5,
  maxLength: 100,
});

export const firstNameComponent = ref({
  type: "text",
  id: "first-name",
  placeholder: "First Name",
  label: "First name",
  errMsg: "First name is invalid!",
  pattern: "",
  minLength: 5,
  maxLength: 100,
});

export const passwordConfirmComponent = ref({
  type: "password",
  id: "confirm-password",
  placeholder: "Confirm Password",
  label: "Confirm password",
  errMsg: "Password confirm is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});

export const passwordComponent = ref({
  type: "password",
  id: "current-password",
  placeholder: "Password",
  label: "Password",
  errMsg: "Password is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});
