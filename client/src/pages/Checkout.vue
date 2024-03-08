<template>
    <div class="min-h-[120vh] max-h-full mb-10">
        <div class="mx-32 my-10">
            <button class="text-green-600 py-2"> &lt; Back to shopping</button>
            <h3 class="font-bold text-4xl uppercase">Order payment</h3>
        </div>
        <div class="flex h-full mx-32">
            <div class="w-8/12">
                <!-- ADDRESS -->
                <div class="border-l border-green-800 h-60 relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">1</button>
                        <h4 class="font-bold">Delivery</h4>
                    </div>
                    <div class="absolute top-10 left-10">
                        <h4 class="text-sm italic my-2">Choose one addree you want to delivery</h4>
                        <div class="flex gap-3 w-full flex-wrap">
                            <div v-for="address in addressList" :key="address.id"
                                class="border p-3 text-sm relative cursor-pointer w-96 hover:bg-gray-200">
                                <input type="checkbox" v-if="address.active" checked
                                    className="checkbox absolute -top-1 -right-1 checkbox-success checkbox-xs" />
                                <ul class="flex flex-col">
                                    <li class="flex gap-5 items-center">
                                        <p>Name:</p>
                                        <p class="font-bold capitalize">{{ address?.user?.firstName + ' ' +
                                address?.user?.lastName }}</p>
                                    </li>
                                    <li class="flex gap-5 items-center">
                                        <p>Phone:</p>
                                        <p>( 84+ ) {{ address?.phone }}</p>
                                    </li>
                                    <li class="flex gap-5 items-center ">
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
                        <button class="text-green-700 text-sm my-5">Go to your address management -></button>
                    </div>
                </div>
                <!-- ORDERS -->
                <div class="border-l border-green-800 min-h-60 max-h-full relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">2</button>
                        <h4 class="font-bold">Order summary</h4>
                    </div>
                    <div class="absolute top-10 left-10">
                        <div v-for="product in userCart?.products" :key="product?.id"
                            class="grid grid-cols-12 gap-3 border-b">
                            <div class="col-span-2 p-5">
                                <img class="w-full h-full" :src=product.image alt="img-item-cart">
                            </div>
                            <div class="col-span-10">
                                <h4 class="font-bold text-sm uppercase">{{ product?.name }} <span
                                        class="normal-case font-normal">(Quantity x{{ product?.quantity }})</span></h4>
                                <ul class="text-[12px]">
                                    <li class="flex gap-3 items-center uppercase">
                                        <p class="text-gray-500">Brand name:</p>
                                        <p>{{ product?.category?.name }}</p>
                                    </li>
                                    <li class="flex gap-3 items-center">
                                        <p class="uppercase text-gray-500">Production:</p>
                                        <p>US / UK</p>
                                    </li>
                                    <li class="flex gap-3 items-center">
                                        <p class="uppercase text-gray-500">Price:</p>
                                        <p class="text-red-600">${{ product?.price }}.00</p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        
                    </div><div class="h-72"></div>
                </div>
                <!-- PAYMENT -->
                <div class=" border-green-800 h-60 relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">3</button>
                        <h4 class="font-bold">Payment methods</h4>
                    </div>
                    <div class="absolute top-10 left-10 w-full">
                        <div class="flex gap-10 w-[60%]">
                            <div class="flex gap-3 items-center">
                                <input type="radio" id="cash-on-delivery" value="Cash on delivery"
                                    v-model="paymentPicked" class="radio radio-xs radio-success" />
                                <label for="cash-on-delivery" class="text-sm">Cash on delivery</label>
                            </div>
                            <div class="flex gap-3 items-center">
                                <input type="radio" id="credit-card" value="Credit card" v-model="paymentPicked"
                                    class="radio radio-xs radio-success" />
                                <label for="credit-card" class="text-sm">Credit card</label>
                            </div>

                        </div>
                        <div v-if="paymentPicked === 'Credit card'" class="flex flex-wrap mt-5 gap-5 w-[90%]">
                            <div class="flex gap-3 w-full">
                                <div v-for="payment in payments" :key="payment?.id"
                                    class="border-gray-600 shadow-xl cursor-pointer text-black bg-white p-3 w-full relative text-sm">
                                    <p v-if="payment.active"
                                        class="px-3 py-2 text-xs w-fit absolute top-0 right-0 text-black font-bold">
                                        Default
                                    </p>
                                    <img class="w-1/4" src="https://cdn-icons-png.flaticon.com/128/14881/14881313.png"
                                        alt="credit-card">
                                    <p class="uppercase text-xs">{{ payment?.user?.firstName + ' ' +
                                payment?.user?.lastName
                                        }}
                                    </p>
                                    <p class="py-2">**** **** **** {{ payment?.accountNumber.slice(-4) }}</p>
                                    <div class="flex justify-between text-black">
                                        <p class="text-xs italic ">Since: {{ payment?.since }}</p>
                                        <p class="text-xs italic ">Valid: {{ payment?.valid }}</p>
                                        <p class="text-xs italic ">CVV: {{ payment?.cvv }}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <button class="text-green-700 text-sm my-5">Go to your address management -></button>
                    </div>
                </div>
            </div>
            <div class="w-4/12">
                <div class="shadow-xl h-fit p-5 flex flex-col gap-5">
                    <h3 class="uppercase font-bold text-xl text-red-600">Your order summary</h3>
                    <p class="italic text-sm">Place your order now to get a lot of things from our events in the
                        black
                        friday
                        20/03/2024.</p>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex flex-col gap-5 font-bold">
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize ">Total bill</p>
                            <p>${{ total }}.00</p>
                        </div>
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize ">Shipping</p>
                            <p>$15.00</p>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="capitalize  text-[15px]">Duties & Taxes</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">Due Upon Delivery</p>
                            </div>
                        </div>
                    </div>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex justify-between text-lg items-center">
                        <p class="capitalize font-bold">Subtotal</p>
                        <p class="font-bold text-red-600 text-2xl">${{ subtotal }}.00</p>
                    </div>
                    <button @click="toggleConfirmOrderModal" class="py-3 text-sm px-5 w-full bg-green-600 text-white uppercase font-bold tracking-wider">
                        Payment now
                    </button>
                </div>
            </div>
            <ConfirmModal :isOpenModal="isOpenConfirmOrderModal" :toggleModal="toggleConfirmOrderModal">
                <div class="w-full flex flex-col items-center justify-center">
                    <p class="text-sm">Do you want to check with these product!</p>
                    <div class="flex gap-5 my-10 text-white">
                        <p class="px-5 py-2 outline-none text-red-600">Not now</p>
                        <button @click="handleCheckoutOrder" class="px-5 py-2 rounded-sm outline-none bg-green-600 text-white">Yes, Sure!</button>
                    </div>
                </div>
            </ConfirmModal>
        </div>
    </div>
</template>

<script setup lang="ts">
import ConfirmModal from '@components/Modal/ConfirmModal.vue';
import { OrderReq } from '@/interfaces/Order';
import { ShoppingCartRes } from '@/interfaces/ShoppingCart';
import { UserAddressRes } from '@/interfaces/UserAddress';
import { UserPaymentRes } from '@/interfaces/UserPayment';
import { ComputedRef, computed, ref } from 'vue';
import { useStore } from 'vuex';
import { useRouter } from 'vue-router';

// DEFINE CONTANT
const paymentPicked = ref('Credit card');
const isOpenConfirmOrderModal = ref(false);
const shipping = ref(15);
var today = new Date();

// DEFINE STORE
const store = useStore();
const router = useRouter();

// USE STORE
store.dispatch('payment/getAllUserPayment', 1);
store.dispatch('address/getAllUserAddress', 1);
store.dispatch('cart/getUserCart', 1);

// STATE STORE
const payments: ComputedRef<UserPaymentRes[]> = computed(() => store.state.payment.payments);
const addressList: ComputedRef<UserAddressRes[]> = computed(() => store.state.address.addressList);
const userCart: ComputedRef<ShoppingCartRes> = computed(() => store.state.cart.userCart);
const total = computed(() => store.getters['cart/cartTotalPrice']);
const subtotal = total.value + shipping.value;

// METHODS

const toggleConfirmOrderModal = () => isOpenConfirmOrderModal.value = !isOpenConfirmOrderModal.value;

const findDefaultActive = (array: UserAddressRes[] | UserPaymentRes[]) => {
    return array.find(obj => obj.active != false)?.id;
}
const handleCheckoutOrder = () => {
    const orderObjective: OrderReq = {
        user: {
            id: 1,
        },
        subTotal: subtotal,
        userPayment: {
            id: findDefaultActive(payments.value) || 0
        },
        userAddress: {
            id: findDefaultActive(addressList.value) || 0
        },
        dateOrder: today
    }
    if (orderObjective) {
        store.dispatch('order/createUserOrder', orderObjective)
            .then(() => {
                store.dispatch('order/getAllUserOrder', 1);
                router.push('/payment-success');
            }).catch((error) => {
                console.log(error);
            });
    }
    toggleConfirmOrderModal();
}

</script>

<style scoped></style>