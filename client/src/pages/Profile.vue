<template>
    <div class="h-[110vh]">
        <div class="flex h-full">
            <div
                class="w-5/12 bg-[url('https://storage-asset.msi.com/global/picture/image/feature/nb/GE/Raider-GE78-HX-13V/display-bg.jpg')] h-full text-white relative">
                <div class="absolute text-black top-10 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
                    <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                        <ul class="uppercase">
                            <li><a>Home</a></li>
                            <li><a class="font-bold" href="">Profile page</a></li>
                        </ul>
                    </div>
                </div>
                <div class="absolute right-5 top-32 p-3 flex flex-col gap-5">
                    <button>
                        <svg class="w-7 h-7 text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                            fill="none" viewBox="0 0 24 24">
                            <path stroke="currentColor" stroke-linecap="square" stroke-linejoin="round" stroke-width="2"
                                d="M7 19H5a1 1 0 0 1-1-1v-1a3 3 0 0 1 3-3h1m4-6a3 3 0 1 1-6 0 3 3 0 0 1 6 0Zm7.4 1.6a2 2 0 0 1 0 2.7l-6 6-3.4.7.7-3.4 6-6a2 2 0 0 1 2.7 0Z" />
                        </svg>
                    </button>
                    <button>
                        <svg class="w-7 h-7 text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
                            fill="none" viewBox="0 0 24 24">
                            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="m15.1 6 5.6 5a1 1 0 0 1 0 1.5l-5.7 5m-6-3V16a1 1 0 0 0 1.5.8l5.1-4.2a1.1 1.1 0 0 0 0-1.7l-5-4.2a1 1 0 0 0-1.6.8v1.7c-3.3 0-6 3-6 6.7v1.3a.7.7 0 0 0 1.3.4A5.2 5.2 0 0 1 9 14.4h0Z" />
                        </svg>
                    </button>
                </div>
                <div class="flex flex-col gap-3 justify-center items-center h-full">
                    <div className="avatar placeholder">
                        <div className="bg-neutral text-neutral-content rounded-full w-24">
                            <img src="https://cdn-icons-gif.flaticon.com/6172/6172532.gif" alt="">
                        </div>
                    </div>
                    <h3 class="uppercase font-bold text-2xl tracking-wide text-orange-500">VO MINH PHUNG</h3>
                    <span class="text-gray-300 italic font-thin text-sm">Email: vmphung1134@gmail.com</span>
                    <span class="text-gray-300 italic font-thin text-sm">Phone: ( 84+ ) 042582697</span>
                    <div class="flex gap-5 uppercase text-sm">
                        <p class="text-gray-500">Level customer:</p>
                        <p>Silver</p>
                    </div>
                    <div class="flex w-full justify-start p-10">
                        <div class="justify-between flex w-full uppercase">
                            <h4 class="font-bold text-sm">My orders</h4>
                            <button class="text-xs uppercase">View all my orders</button>
                        </div>

                    </div>
                    <div class="flex w-full px-10">
                        <button
                            class="flex flex-col group hover:bg-white hover:text-black hover:transform hover:ease-in-out hover:duration-500 -skew-x-[30deg] w-40 gap-2 items-center border p-3 justify-center">
                            <svg class="w-10 h-10 group-hover:text-black text-white skew-x-[30deg]" aria-hidden="true"
                                xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24">
                                <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                    stroke-width="1.3"
                                    d="M17 8H5m12 0c.6 0 1 .4 1 1v2.6M17 8l-4-4M5 8a1 1 0 0 0-1 1v10c0 .6.4 1 1 1h12c.6 0 1-.4 1-1v-2.6M5 8l4-4 4 4m6 4h-4a2 2 0 1 0 0 4h4c.6 0 1-.4 1-1v-2c0-.6-.4-1-1-1Z" />
                            </svg>
                            <p class="text-sm skew-x-[30deg]">Discount</p>
                        </button>
                        <button
                            class="flex flex-col  w-40 group hover:bg-white hover:text-black hover:transform hover:ease-in-out hover:duration-500 -skew-x-[30deg] gap-2 items-center border p-3 justify-center">
                            <svg class="w-10 h-10 group-hover:text-black text-white skew-x-[30deg]" aria-hidden="true"
                                xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24">
                                <path
                                    d="M12 6.2 7 9.4l5 3.2-5 3.2-5-3.3 5-3.1-5-3.2L7 3l5 3.2ZM7 17.8l5-3.2 5 3.2-5 3.2-5-3.2Z" />
                                <path d="m12 12.5 5-3.1-5-3.2L17 3l5 3.2-5 3.2 5 3.2-5 3.2-5-3.3Z" />
                            </svg>
                            <p class="text-sm skew-x-[30deg]">Payment</p>
                        </button>
                        <button
                            class="flex flex-col w-40 group hover:bg-white hover:text-black hover:transform hover:ease-in-out hover:duration-500 -skew-x-[30deg] gap-2 items-center border p-3 justify-center">
                            <svg class="w-10 h-10 group-hover:text-black text-white skew-x-[30deg]" aria-hidden="true"
                                xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24">
                                <path fill-rule="evenodd"
                                    d="M4.9 3C3.9 3 3 3.8 3 4.9V9c0 1 .8 1.9 1.9 1.9H9c1 0 1.9-.8 1.9-1.9V5c0-1-.8-1.9-1.9-1.9H5Zm10 0c-1 0-1.9.8-1.9 1.9V9c0 1 .8 1.9 1.9 1.9H19c1 0 1.9-.8 1.9-1.9V5c0-1-.8-1.9-1.9-1.9h-4Zm-10 10c-1 0-1.9.8-1.9 1.9V19c0 1 .8 1.9 1.9 1.9H9c1 0 1.9-.8 1.9-1.9v-4c0-1-.8-1.9-1.9-1.9H5Zm10 0c-1 0-1.9.8-1.9 1.9V19c0 1 .8 1.9 1.9 1.9H19c1 0 1.9-.8 1.9-1.9v-4c0-1-.8-1.9-1.9-1.9h-4Z"
                                    clip-rule="evenodd" />
                            </svg>
                            <p class="text-sm skew-x-[30deg]">Delivery</p>
                        </button>
                        <button
                            class="flex flex-col w-40 group hover:bg-white hover:text-black hover:transform hover:ease-in-out hover:duration-500 -skew-x-[30deg] gap-2 items-center border p-3 justify-center">
                            <svg class="w-10 h-10 group-hover:text-black text-white skew-x-[30deg]" aria-hidden="true"
                                xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 24 24">
                                <path fill-rule="evenodd"
                                    d="M5 3.8A1 1 0 0 1 6 3h12c.5 0 .9.3 1 .8l1.8 8.2h-4.2a2 2 0 0 0-1.9 1.2 3 3 0 0 1-5.4 0A2 2 0 0 0 7.4 12H3.2L5 3.8ZM3 14v5a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-5h-4.4a5 5 0 0 1-9.2 0H3Z"
                                    clip-rule="evenodd" />
                            </svg>
                            <p class="text-sm skew-x-[30deg]">Refund</p>
                        </button>
                    </div>
                    <span class="text-xs mt-10">Please take a see <span class="underline text-red-600">documents and
                            policies</span> for refund product</span>
                </div>
            </div>
            <div class="w-7/12 px-10 mt-10">
                <div class="w-full">
                    <div class="flex justify-between">
                        <h1 class="uppercase text-xl font-bold">Payment methods</h1>
                        <button @click="togglePaymentModal" class="text-green-700 text-sm my-5">Add new your payment
                            method -></button>
                    </div>
                    <div class="flex gap-3 w-full">
                        <div @click="toggleConfirmModal(payment)" v-for="payment in payments" :key="payment?.id"
                            class="border-gray-600 shadow-xl cursor-pointer text-white bg-[url('https://i.imgur.com/Zi6v09P.png')] hover:transform hover:duration-500 hover:ease-in-out p-3 w-full text-sm relative overflow-hidden">
                            <p v-if="payment.active"
                                class="px-3 py-2 text-xs w-fit absolute top-0 right-0 text-black font-bold">Default</p>
                            <img class="w-1/4" src="https://cdn-icons-png.flaticon.com/128/14881/14881313.png"
                                alt="credit-card">
                            <p class="uppercase text-xs">{{ payment?.user?.firstName + ' ' + payment?.user?.lastName }}
                            </p>
                            <p class="py-2">**** **** **** {{ payment?.accountNumber.slice(-4) }}</p>
                            <div class="flex justify-between">
                                <p class="text-xs italic text-gray-100">Since: {{ payment?.since }}</p>
                                <p class="text-xs italic text-gray-100">Valid: {{ payment?.valid }}</p>
                                <p class="text-xs italic text-gray-100">CVV: {{ payment?.cvv }}</p>
                            </div>

                        </div>
                    </div>
                    <PaymentMethodModal :is-open-modal="isOpenPaymentModal" :toggle-modal="togglePaymentModal" />
                </div>

                <div class="my-10">
                    <h1 class="uppercase text-xl font-bold">Management your address</h1>
                    <div class="">
                        <h4 class="text-sm italic my-2">Set default address for delivery product</h4>
                        <div class="flex gap-3">
                            <div @click="toggleConfirmAddressModal(address)" v-for="address in addressList"
                                :key="address.id"
                                class="w-72 border p-3 text-sm relative cursor-pointer hover:bg-gray-200">
                                <input type="checkbox" v-if="address.active" checked
                                    className="checkbox absolute -top-1 -right-1 checkbox-success checkbox-xs" />
                                <ul class="flex flex-col">
                                    <li class="flex gap-5">
                                        <p>Name</p>
                                        <p class="font-bold capitalize text-xs">{{ address?.user?.firstName + ' ' +
                            address?.user?.lastName }}</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Phone:</p>
                                        <p>( 84+ ) {{ address?.phone }}</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <ol class="flex gap-3 capitalize">
                                            <p>Country:</p>
                                            <p>{{ address?.country }}</p>
                                        </ol>
                                        <ol class="flex gap-3 capitalize">
                                            <p>City:</p>
                                            <p>{{ address?.city }}</p>
                                        </ol>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Address: </p>
                                        <p class="truncate">{{ address?.address }}
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <AddressModal :is-open-modal="isOpenAddressUserModal" :toggle-modal="toggleAddressUserModal" />
                        <button @click="toggleAddressUserModal" class="text-green-700 text-sm my-5">Go to your address
                            management -></button>
                    </div>
                </div>
                <div class="flex gap-10">
                    <div class="w-1/2">
                        <h4 class="uppercase text-xl font-bold mb-5">Change password</h4>
                        <ChangePasswordForm />
                    </div>
                    <div className="p-5 bg-slate-50 w-1/2 h-fit text-sm">
                        <h3 className="font-medium">Password Rules</h3>
                        <p>
                            To create a new password, you have to meet all of the
                            following rules:
                        </p>
                        <div className="ml-7">
                            <ul className="list-disc">
                                <li>Minimum of 8 characters</li>
                                <li>At least one speacial character</li>
                                <li>At least one number</li>
                                <li>Cannot be the same as previous password</li>
                                <li>No repeat characters such as 222</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <ConfirmModal :toggle-modal="toggleConfirmModal" :is-open-modal="isOpenConfirmModal">
                <div class="w-full flex flex-col items-center justify-center">
                    <p class="text-sm">What do you want with your payment method!</p>
                    <div class="flex gap-5 my-10 text-white">
                        <button @click="handleDeletePaymentMethod" class="px-5 py-2 outline-none text-red-600">Delete
                            payment</button>
                        <button @click="handleUpdatePaymentMethod"
                            class="px-5 py-2 rounded-sm outline-none bg-green-600 text-white">Set default</button>
                    </div>
                </div>
            </ConfirmModal>
            <ConfirmModal :toggle-modal="toggleConfirmAddressModal" :is-open-modal="isOpenConfirmAddressModal">
                <div class="w-full flex flex-col items-center justify-center">
                    <p class="text-sm">What do you want with your address!</p>
                    <div class="flex gap-5 my-10 text-white">
                        <button @click="handleDeleteAddressMethod" class="px-5 py-2 outline-none text-red-600">Delete
                            address</button>
                        <button @click="handleUpdateAddressMethod"
                            class="px-5 py-2 rounded-sm outline-none bg-green-600 text-white">Set default</button>
                    </div>
                </div>
            </ConfirmModal>
        </div>
    </div>
</template>

<script setup lang="ts">
import AddressModal from '@components/Modal/AddressModal.vue';
import ChangePasswordForm from '@components/Form/ChangePasswordForm.vue';
import PaymentMethodModal from '@components/Modal/PaymentMethodModal.vue';
import ConfirmModal from '@components/Modal/ConfirmModal.vue';
import { ref, provide, ComputedRef, computed, reactive } from 'vue';
import { INITIAL_USER_PAYMENT_REQ, UserPaymentReq, UserPaymentRes } from '../interfaces/UserPayment';
import { useStore } from 'vuex';
import { INITIAL_USER_ADDRESS_REQ, UserAddressReq, UserAddressRes } from '../interfaces/UserAddress';

// DEFINE STORE
const store = useStore();

// ACTION
store.dispatch('payment/getAllUserPayment', 1);
store.dispatch('address/getAllUserAddress', 1);

// STATE STORE
const payments: ComputedRef<UserPaymentRes[]> = computed(() => store.state.payment.payments);
const addressList: ComputedRef<UserAddressRes[]> = computed(() => store.state.address.addressList);

// DEFINE CONSTANT
const authData = localStorage.getItem("auth");
const authRes = authData ? JSON.parse(authData) : null;
provide('authResId', authRes ? authRes.id : null);

let paymentNeedChange = reactive<UserPaymentReq>(INITIAL_USER_PAYMENT_REQ);
let addressNeedChange = reactive<UserAddressReq>(INITIAL_USER_ADDRESS_REQ);



// PAYMENT METHOD
const isOpenPaymentModal = ref(false);
const togglePaymentModal = () => isOpenPaymentModal.value = !isOpenPaymentModal.value;

const isOpenConfirmModal = ref(false);
const toggleConfirmModal = (payment?: UserPaymentRes) => {
    isOpenConfirmModal.value = !isOpenConfirmModal.value;
    if (payment) {
        paymentNeedChange = {
            paymentType: payment.paymentType,
            accountNumber: payment.accountNumber,
            active: true,
            since: payment.since,
            valid: payment.valid,
            cvv: payment.cvv,
            user: {
                id: 1
            },
            id: payment.id
        }
    }

}

const handleUpdatePaymentMethod = () => {
    store.dispatch('payment/setDefaultPayment', paymentNeedChange)
        .then(() => {
            store.dispatch('payment/getAllUserPayment', 1);
        }).catch((error) => {
            console.log(error);
        });
    toggleConfirmModal();
}
const handleDeletePaymentMethod = () => {
    store.dispatch('payment/deletePaymentMethod', paymentNeedChange.id)
        .then(() => {
            store.dispatch('payment/getAllUserPayment', 1);
        }).catch((error) => {
            console.log(error);
        });
    toggleConfirmModal();
}

// ADDRESS USER
const isOpenAddressUserModal = ref(false);
const toggleAddressUserModal = () => isOpenAddressUserModal.value = !isOpenAddressUserModal.value;
const isOpenConfirmAddressModal = ref(false);
const toggleConfirmAddressModal = (address?: UserAddressRes) => {
    isOpenConfirmAddressModal.value = !isOpenConfirmAddressModal.value;
    if (address) {
        addressNeedChange = {
            user: {
                id: 1,
            },
            address: address.address,
            active: true,
            city: address.city,
            country: address.country,
            phone: address.phone,
            postCode: address.postCode,
            id: address.id,
        }
    }

}

const handleUpdateAddressMethod = () => {
    store.dispatch('address/setDefaultAddress', addressNeedChange).then(() => {
        store.dispatch('address/getAllUserAddress', 1);
    }).catch((error) => {
        console.log(error);
    });
    toggleConfirmAddressModal();
}
const handleDeleteAddressMethod = () => {
    store.dispatch('address/deleteAddressMethod', addressNeedChange.id);
    toggleConfirmAddressModal();
}
</script>

<style scoped></style>

<!-- https://cdn-icons-png.flaticon.com/128/196/196565.png -->
<!-- https://cdn-icons-png.flaticon.com/128/14881/14881313.png -->