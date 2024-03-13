<template>
    <div>
        <div class="flex gap-10 mx-20">
            <div class="w-8/12">
                <div class="overflow-x-auto">
                    <table v-if="userCart" class="table">
                        <!-- head -->
                        <thead class="bg-black text-white">
                            <tr class="uppercase">
                                <th>No.</th>
                                <th>Product name</th>
                                <th>Image</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- row 1 -->
                            <tr class="border-b" v-for="(product, index) in userCart?.products" :key="product?.id">
                                <th>{{ index + 1 }}</th>
                                <td class="font-bold">
                                    <div>
                                        <div class="font-bold">{{ product?.name }}</div>
                                        <div class="opacity-50 uppercase text-xs">{{ product?.category?.name }}</div>
                                    </div>
                                </td>
                                <td>
                                    <img class="w-20" :src=product?.image alt="img-product-cart">
                                </td>
                                <td>
                                    <button @click="decreaseItemInCart(product.id)"
                                        class="bg-gray-400 w-8 px-3 py-1 text-white">-</button>
                                    <span class="mx-3">{{ product?.quantity }}</span>
                                    <button @click="increaseItemInCart(product.id)"
                                        class="bg-gray-400 w-8 px-3 py-1 text-white">+</button>
                                </td>
                                <td>${{ product?.price }}.00</td>
                                <td @click="handleUndoItem(product.id)" class="text-red-600 text-sm cursor-pointer">
                                    Undo</td>
                            </tr>
                        </tbody>
                    </table>
                    <div v-else class="p-5">
                        <EmptySpace />
                    </div>
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
                            <p class="font-bold">${{ total * shippingCost }}</p>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="font-bold text-[15px]">Your address</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">{{ defaultAddress?.city }} / {{ defaultAddress?.country }}</p>
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
                        <p class="font-bold text-red-600 text-2xl">${{ total + (total * shippingCost) }}</p>
                    </div>
                    <label class="cursor-pointer" for="my-drawer-4" aria-label="close sidebar"></label>
                    <button @click="handleDirectCheckout()" v-if="isCheckQuantityCart(userCart)"
                        class="py-3 px-5 w-full bg-green-700 text-white uppercase font-bold tracking-wider">
                        <label class="cursor-pointer" for="my-drawer-4" aria-label="close sidebar">Checkout your
                            order</label>
                    </button>
                    <button disabled v-else
                        class="py-3 px-5 w-full bg-gray-500 text-white uppercase font-bold tracking-wider">
                        Not product to checkout
                    </button>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ComputedRef, computed, ref } from 'vue';
import { ShoppingCartRes } from '../interfaces/ShoppingCart';
import { useStore } from 'vuex';
import { useRouter } from 'vue-router';
import { UserAddressRes } from '../interfaces/UserAddress';
import EmptySpace from '@components/Element/EmptySpace.vue';

// DEFINE STORE
const store = useStore();
const router = useRouter();

// USE STORE
const userCart: ComputedRef<ShoppingCartRes> = computed(() => store.state.cart.userCart);
const total = computed(() => store.getters['cart/cartTotalPrice']);
const infoUser = computed(() => store.getters['auth/getInforUser']);
const defaultAddress: ComputedRef<UserAddressRes> = computed(() => store.getters['address/getDefaultAddress']);

// ACTION STORE
store.dispatch("cart/getUserCart", infoUser.value.id);
store.dispatch("address/getAllUserAddress", infoUser.value.id);

// DEFINE CONSTANT
const shippingCost = ref(0.05);

// METHODS
const isCheckQuantityCart = (userCart: ShoppingCartRes) => {
    return userCart?.products?.length > 0 ? true : false;
}

const handleUndoItem = (productId: number | undefined) => {
    if (productId && infoUser.value.id) {
        store.dispatch('cart/undoItemCart', { productId: productId, userId: infoUser.value.id })
            .then(() => {
                store.dispatch("cart/getUserCart", infoUser.value.id);
            }).catch((error) => {
                console.log(error);
            });
    }
}

const increaseItemInCart = (productId: number | undefined) => {
    if (productId && infoUser.value.id) {
        store.dispatch('cart/increaseProductQuantity', { productId: productId, userId: infoUser.value.id })
            .then(() => {
                store.dispatch("cart/getUserCart", infoUser.value.id);
            }).catch((error) => {
                console.log(error);
            });
    }
}

const decreaseItemInCart = (productId: number | undefined) => {
    if (productId && infoUser.value.id) {
        store.dispatch('cart/decreaseProductQuantity', { productId: productId, userId: infoUser.value.id })
            .then(() => {
                store.dispatch("cart/getUserCart", infoUser.value.id);
            }).catch((error) => {
                console.log(error);
            });
    }
}

const handleDirectCheckout = () => {
    router.push(`/checkout-order/${infoUser.value.id}`);
}

</script>

<style scoped></style>