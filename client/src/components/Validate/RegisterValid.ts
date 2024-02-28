import { reactive } from "vue";

export let formData = reactive({
  firstName: "",
  lastName: "",
  email: "",
  password: "",
  passwordConfirm: "",
});

export const emailComponent = reactive({
  type: "text",
  id: "email",
  placeholder: "Email address",
  label: "Email address",
  errMsg: "Email is invalid!",
  pattern: "^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$",
  minLength: 5,
  maxLength: 100,
});

export const firstNameComponent = reactive({
  type: "text",
  id: "first-name",
  placeholder: "First name",
  label: "First name",
  errMsg: "First name is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});

export const lastNameComponent = reactive({
  type: "text",
  id: "last-name",
  placeholder: "Last name",
  label: "Last name",
  errMsg: "Last name is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});

export const passwordConfirmComponent = reactive({
  type: "password",
  id: "confirm-password",
  placeholder: "Confirm Password",
  label: "Confirm password",
  errMsg: "Password confirm is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});

export const passwordComponent = reactive({
  type: "password",
  id: "current-password",
  placeholder: "Password",
  label: "Password",
  errMsg: "Password is invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 50,
});
