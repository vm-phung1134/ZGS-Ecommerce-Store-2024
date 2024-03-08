<template>
    <div :class="props.className">
        <div class="w-full">
            <div class="w-full text-center my-2 text-[13px]" v-show="errorApi.length > 0">
                <span class="text-red-700">Ops! {{ errorApi }}</span>
            </div>
            <form id="login.form" @submit="submitForm" method="post">
                <InputFieldNormal @form-validate="validateForm" v-model:valueInput="formData.fullname"
                    :component-data="fullnameComponent" />
                <InputFieldNormal @form-validate="validateForm" v-model:valueInput="formData.numberCard"
                    :component-data="numberCardComponent" />
                <div class="flex justify-between w-full gap-2">
                    <InputFieldNormal @form-validate="validateForm" v-model:valueInput="formData.since"
                        :component-data="sinceComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model:valueInput="formData.valid"
                        :component-data="validComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model:valueInput="formData.cvv"
                        :component-data="cvvComponent" />
                </div>
                <div class="flex justify-end items-center">
                    <p @click="props.toggleModal" class="px-5 cursor-pointer">Cancel</p>
                    <button type="submit" class="bg-green-700 text-white px-10 py-3">Confirm</button>
                </div>
            </form>
        </div>
    </div>
</template>

<script setup lang="ts">
import InputFieldNormal from './InputFieldNormal.vue';
import { ref, inject, Ref } from 'vue';
import {
    formData,
    fullnameComponent,
    cvvComponent,
    sinceComponent,
    numberCardComponent,
    validComponent
} from '@components/Validate/PaymentMethodValid';
import { UserPaymentReq } from '../../interfaces/UserPayment';
import { useStore } from 'vuex';

// -----------------DEFINE PROPS------------------
const props = defineProps({
    className: {
        type: String,
        required: true,
    },
    toggleModal: {
        type: Function,
        required: true,
    }
});

// -----------------DEFINE CONSTANTS------------------
const checkFormValid = ref(false);
const selectedPayment = inject<Ref<string>>('selectedPayment');
const authResId = inject<number>('authResId');
const errorApi = ref('');
const store = useStore();

// -----------------DEFINE METHODS------------------
const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
};

const submitForm = (event: Event) => {
    event.preventDefault();
    const formValue = Object.values(formData);
    const hasEmptyValue = formValue.some((value) => value === "");
    const createPaymentMethod: UserPaymentReq = {
        user: {
            id: authResId || 1
        },
        accountNumber: formData.numberCard,
        paymentType: selectedPayment?.value || "",
        cvv: formData.cvv,
        since: formData.since,
        valid: formData.valid
    }
    if (checkFormValid && !hasEmptyValue) {
        console.log(createPaymentMethod)
        store.dispatch("payment/createPaymentMethod", createPaymentMethod)
            .then(() => {
                store.dispatch("payment/getAllUserPayment", 1);
                props.toggleModal();
            })
            .catch((error) => {
                console.log(error);
                errorApi.value = "Payment is invalid!";
            });
    } else {
        errorApi.value = "Payment is invalid!";
    }
}
</script>