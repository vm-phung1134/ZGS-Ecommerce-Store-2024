import { reactive } from "vue";

export let formData = reactive({
  password: "",
  passwordConfirm: "",
});

export const passwordComponent = reactive({
  type: "password",
  id: "new-password",
  placeholder: "New password",
  label: "New password",
  errMsg: "New password is invalid!",
  pattern: "",
  minLength: 6,
  maxLength: 50,
});

export const passwordConfirmComponent = reactive({
  type: "password",
  id: "confirm-password",
  placeholder: "Confirm Password",
  label: "Confirm password",
  errMsg: "Password confirm is invalid!",
  pattern: "",
  minLength: 6,
  maxLength: 50,
});
