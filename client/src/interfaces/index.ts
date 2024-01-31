export interface InputComponent {
    type: String,
    placeholder: String,
    id: String,
    label: String,
    errMsg: String,
    pattern?: String,
    minLength?: Number,
    maxLength?: Number
}