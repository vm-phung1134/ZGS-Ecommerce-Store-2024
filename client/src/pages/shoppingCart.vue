<template>
    <div>
        <div class="flex gap-10 mx-20">
            <div class="w-8/12">
                <div class="overflow-x-auto">
                    <table class="table">
                        <!-- head -->
                        <thead>
                            <tr class="uppercase">
                                <th></th>
                                <th>Product name</th>
                                <th>Image</th>
                                <th>Quantity</th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- row 1 -->
                            <tr class="bg-base-200" v-for="(product, index) in userCart?.products" :key="product?.id">
                                <th>{{ index }}</th>
                                <td class="font-bold">{{ product?.name }}</td>
                                <td>
                                    <img class="w-20" :src=product?.image alt="img-product-cart">
                                </td>
                                <td>{{ product?.quantity }}</td>
                                <td>{{ product?.price }}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="w-4/12">
                <div class="shadow-xl h-full p-5 flex flex-col gap-5">
                    <h3 class="uppercase font-bold text-lg text-red-600">Your order summary</h3>
                    <p class="italic">Place your order now to get a lot of things from our events in the black friday
                        20/03/2024.</p>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex flex-col gap-5">
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize font-bold">Total bill</p>
                            <p class="font-bold">${{ total }}.00</p>
                        </div>
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize font-bold">Shipping</p>
                            <p class="font-bold">$15.00</p>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="font-bold text-[15px]">Your address</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">Ninh Kieu / Can Tho</p>
                                <button class="text-green-700">Address management</button>
                            </div>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="capitalize font-bold text-[15px]">Duties & Taxes</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">Due Upon Delivery</p>
                            </div>
                        </div>
                    </div>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex justify-between text-lg items-center">
                        <p class="capitalize font-bold">Subtotal</p>
                        <p class="font-bold text-red-600 text-2xl">${{ total + 15 }}.00</p>
                    </div>
                    <button class="py-3 px-5 w-full bg-black text-white uppercase font-bold tracking-wider">
                        Checkout your order
                    </button>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ComputedRef, computed } from 'vue';
import { ShoppingCartRes } from '../interfaces/ShoppingCart';
import { useStore } from 'vuex';

const store = useStore();
const userCart: ComputedRef<ShoppingCartRes> = computed(() => store.state.cart.userCart);
const authData = localStorage.getItem("auth");
const authRes = JSON.parse(authData || "");
if (authRes) {
    store.dispatch('cart/getUserCart', authRes.id);
}

const total = computed(() => store.getters['cart/cartTotalPrice'])


</script>

<style scoped></style>