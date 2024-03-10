<template>
    <div :class="props.className">
        <div class="w-full">
            <form id="login.form" @submit="submitForm" method="post">
                <div class="flex gap-5 mb-5 justify-between items-center w-full">
                    <SelectBoxForm class-name="w-full z-10" :array-value="[]" :selected-value="selectedCountry" />
                    <SelectBoxForm @update:selectedValue="updateSelectedCity" class-name="w-full z-10" :array-value="cities" :selected-value="selectedCity" />
                </div>
                <TextAreaForm @form-validate="validateForm" v-model:value-input="formData.address"
                    :component-data="addressComponent" />
                <div class="flex gap-5 w-full">
                    <InputFieldNormal @form-validate="validateForm" v-model:value-input="formData.phone"
                        :component-data="phoneComponent" />
                    <InputFieldNormal @form-validate="validateForm" v-model:value-input="formData.postCode"
                        :component-data="postCodeComponent" />
                </div>
                <div class="flex justify-end">
                    <button @click="props.toggleModal" class="px-5">Cancel</button>
                    <button class="bg-green-700 text-white px-10 py-3">Confirm</button>
                </div>
            </form>
        </div>
        <ToastifyMessage v-if="isCreateAddress" message="A new address added successfully !" />
    </div>
</template>

<script setup lang="ts">
import InputFieldNormal from './InputFieldNormal.vue';
import SelectBoxForm from './SelectBoxForm.vue';
import { ComputedRef, computed, inject, ref } from 'vue';
import {
    formData,
    phoneComponent,
    postCodeComponent,
    addressComponent,
} from '@components/Validate/AddressValid';
import TextAreaForm from './TextAreaForm.vue';
import { UserAddressReq } from '../../interfaces/UserAddress';
import { useStore } from 'vuex';
import ToastifyMessage from '../Element/ToastifyMessage.vue';

// DEFINE PROPS
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

// DEFINE STORE
const store = useStore();

// USE STORE
const isCreateAddress: ComputedRef<boolean> = computed(() => store.state.payment.isCreateAddress);

// DEFINE CONSTANT
const checkFormValid = ref(false);
const authResId = inject<number>('authResId');

const cities = [
    { value: 'Ho Chi Minh City', key: 'hcm' },
    { value: 'Can Tho City', key: 'ct' },
    { value: 'An Giang Provide', key: 'ag' },
]

const selectedCity = ref(cities[0].value);
const selectedCountry = ref('Vietnam');
const errorApi = ref('');

// METHODS
const validateForm = (isValid: boolean) => {
    return checkFormValid.value = isValid;
};

const updateSelectedCity= (newValue: string) => {
    selectedCity.value = newValue; 
};

const submitForm = (event: Event) => {
    event.preventDefault();
    const formValue = Object.values(formData);
    const hasEmptyValue = formValue.some((value) => value === "");
    const createAddressMethod: UserAddressReq = {
        user: {
            id: authResId || 0
        },
        address: formData.address,
        city: selectedCity.value,
        country: selectedCountry.value,
        phone: formData.phone,
        postCode: formData.postCode
    }
    if (checkFormValid && !hasEmptyValue) {
        console.log(createAddressMethod)
        store.dispatch("address/createAddressMethod", createAddressMethod)
            .then(() => {
                store.dispatch("address/getAllUserAddress", authResId);
                props.toggleModal();
            })
            .catch((error) => {
                console.log(error);
                errorApi.value = "Address is invalid!";
            });
    } else {
        errorApi.value = "Address is invalid!";
    }
};

</script>