import { reactive } from "vue";

export let formData = reactive({
  fullname: "",
  numberCard: "",
  since: "",
  valid: "",
  cvv: "",
});

export const cvvComponent = reactive({
  type: "text",
  id: "cvv",
  placeholder: "***",
  label: "CVV",
  errMsg: "CVV invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 3,
});

export const validComponent = reactive({
  type: "text",
  id: "valid",
  placeholder: "03/30",
  label: "Valid date",
  errMsg: "Valid invalid!",
  pattern: "",
  minLength: 5,
  maxLength: 5,
});

export const sinceComponent = reactive({
  type: "text",
  id: "since",
  placeholder: "02/24",
  label: "Since date",
  errMsg: "Since invalid!",
  pattern: "",
  minLength: 5,
  maxLength: 5,
});

export const numberCardComponent = reactive({
  type: "text",
  id: "number-card",
  placeholder: "**** **** **** ****",
  label: "Number card",
  errMsg: "Number card invalid!",
  pattern: "",
  minLength: 16,
  maxLength: 16,
});

export const fullnameComponent = reactive({
  type: "text",
  id: "full-name",
  placeholder: "",
  label: "Full name",
  errMsg: "Full name invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 100,
});
