import { reactive } from "vue";

export let formData = reactive({
  address: "",
  phone: "",
  postCode: "",
});

export const postCodeComponent = reactive({
  type: "text",
  id: "postCode",
  placeholder: "***",
  label: "Post code",
  errMsg: "Post code invalid!",
  pattern: "",
  minLength: 1,
  maxLength: 7,
});

export const phoneComponent = reactive({
  type: "text",
  id: "phone",
  placeholder: "***",
  label: "Phone",
  errMsg: "Phone invalid!",
  pattern: "",
  minLength: 0,
  maxLength: 10,
});

export const addressComponent = reactive({
  type: "text",
  id: "address",
  placeholder: "***",
  label: "Address",
  errMsg: "Address invalid!",
  pattern: "",
  minLength: 3,
  maxLength: 100,
});
