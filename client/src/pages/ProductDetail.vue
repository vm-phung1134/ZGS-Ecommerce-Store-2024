<template>
    <div>
        <div
            class="h-[130vh] relative bg-cover bg-[url('https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/stealth_16_a13/msi-stealth16-13-kv-bg-white.jpg')] w-full">
            <div class="absolute top-14 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
                <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                    <ul class="uppercase">
                        <li><a>Home</a></li>
                        <li><a class="font-bold" href="">Product detail page</a></li>
                    </ul>
                </div>
            </div>
            <section class="text-gray-300 body-font overflow-hidden">
                <div class="container px-5 py-24 mx-auto">
                    <div class="flex gap-10 mx-20">
                        <div class="w-1/2 flex flex-col justify-center relative">
                            <div class="absolute bottom-0 left-0">
                                <ul class="flex gap-10">
                                    <li>
                                        <p class="text-xl font-bold">24</p>
                                        <p class="text-xs">CORE™ i9-13980HX</p>
                                    </li>
                                    <li>
                                        <p class="text-xl font-bold">5.6GHz</p>
                                        <p class="text-xs">2 P-Core</p>
                                    </li>
                                    <li>
                                        <p class="text-xl font-bold">5.2GHz</p>
                                        <p class="text-xs">All P-Core</p>
                                    </li>
                                    <li>
                                        <p class="text-xl font-bold">Intel® ABT/TVB</p>
                                        <p class="text-xs">Technology</p>
                                    </li>
                                    <li>
                                        <p class="text-xl font-bold">45%</p>
                                        <p class="text-xs">Performance</p>
                                    </li>
                                </ul>
                            </div>
                            <img alt="ecommerce" class="w-full h-auto" :src=product?.image>
                        </div>
                        <div class="w-1/2 flex flex-col gap-5 p-8 bg-black/80 text-white">
                            <div>
                                <h2 class="text-sm title-font text-gray-500 tracking-widest">BRAND NAME</h2>
                                <h1 class="text-3xl title-font font-bold">{{ product?.name }}</h1>
                            </div>
                            <div class="flex gap-2">
                                <h2 class="text-sm title-font text-gray-500 tracking-wider">CATEGORY | </h2>
                                <h1 class="text-sm title-font font-bold uppercase">{{ product?.category?.name }}</h1>
                            </div>
                            <div class="flex mb-4">
                                <span class="flex items-center">
                                    <svg fill="currentColor" stroke="currentColor" stroke-linecap="round"
                                        stroke-linejoin="round" stroke-width="2" class="w-4 h-4 text-orange-500"
                                        viewBox="0 0 24 24">
                                        <path
                                            d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z">
                                        </path>
                                    </svg>
                                    <svg fill="currentColor" stroke="currentColor" stroke-linecap="round"
                                        stroke-linejoin="round" stroke-width="2" class="w-4 h-4 text-orange-500"
                                        viewBox="0 0 24 24">
                                        <path
                                            d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z">
                                        </path>
                                    </svg>
                                    <svg fill="currentColor" stroke="currentColor" stroke-linecap="round"
                                        stroke-linejoin="round" stroke-width="2" class="w-4 h-4 text-orange-500"
                                        viewBox="0 0 24 24">
                                        <path
                                            d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z">
                                        </path>
                                    </svg>
                                    <svg fill="currentColor" stroke="currentColor" stroke-linecap="round"
                                        stroke-linejoin="round" stroke-width="2" class="w-4 h-4 text-orange-500"
                                        viewBox="0 0 24 24">
                                        <path
                                            d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z">
                                        </path>
                                    </svg>
                                    <svg fill="none" stroke="currentColor" stroke-linecap="round"
                                        stroke-linejoin="round" stroke-width="2" class="w-4 h-4 text-orange-500"
                                        viewBox="0 0 24 24">
                                        <path
                                            d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z">
                                        </path>
                                    </svg>
                                    <span class="text-orange-500 ml-3">4 Reviews</span>
                                </span>
                                <span class="flex ml-3 pl-3 border-l-2 border-gray-100">
                                    <a class="text-blue-500">
                                        <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                            stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">
                                            <path d="M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z">
                                            </path>
                                        </svg>
                                    </a>
                                    <a class="ml-2 text-blue-500">
                                        <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                            stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">
                                            <path
                                                d="M23 3a10.9 10.9 0 01-3.14 1.53 4.48 4.48 0 00-7.86 3v1A10.66 10.66 0 013 4s-4 9 5 13a11.64 11.64 0 01-7 2c9 5 20 0 20-11.5a4.5 4.5 0 00-.08-.83A7.72 7.72 0 0023 3z">
                                            </path>
                                        </svg>
                                    </a>
                                    <a class="ml-2 text-blue-500">
                                        <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                            stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">
                                            <path
                                                d="M21 11.5a8.38 8.38 0 01-.9 3.8 8.5 8.5 0 01-7.6 4.7 8.38 8.38 0 01-3.8-.9L3 21l1.9-5.7a8.38 8.38 0 01-.9-3.8 8.5 8.5 0 014.7-7.6 8.38 8.38 0 013.8-.9h.5a8.48 8.48 0 018 8v.5z">
                                            </path>
                                        </svg>
                                    </a>
                                </span>
                            </div>
                            <p class="leading-relaxed">Fam locavore kickstarter distillery. Mixtape chillwave tumeric
                                sriracha
                                taximy chia microdosing tilde DIY. XOXO fam indxgo juiceramps cornhole raw denim forage
                                brooklyn. Everyday carry +1 seitan poutine tumeric. Gastropub blue bottle austin
                                listicle
                                pour-over, neutra jean shorts keytar banjo tattooed umami cardigan.
                            </p>
                            <img class="w-1/2"
                                src="https://storage-asset.msi.com/global/picture/image/feature/monitor/MEG-342C-QD-OLED/kv-icons.png"
                                alt="image-detail-product">
                            <div class="flex h-fit mt-auto items-end justify-between">
                                <div class="flex flex-col justify-between gap-2">
                                    <div>
                                        <span class="title-font font-bold text-2xl text-orange-600">${{ product?.price
                                            }}.00</span>
                                        <span class="px-3 tracking-wide text-gray-500">$200.00</span>
                                    </div>
                                    <p class="text-sm">Online Exclusive</p>
                                </div>
                                <div class="flex flex-col gap-3 text-sm w-72">
                                    <div class="py-2 uppercase text-xs px-3 bg-white">
                                        <div class="w-full flex justify-between items-center gap-x-3">
                                            <div>
                                                <span class="block font-bold text-xs text-gray-800 dark:text-white">
                                                    Product quantity
                                                </span>
                                                <span
                                                    class="block text-[10px] normal-case text-gray-500 dark:text-gray-400">
                                                    Including tax and shipping
                                                </span>
                                            </div>
                                            <div class="flex items-center gap-x-1.5">
                                                <button @click="decreaseQuantity" type="button"
                                                    class="size-6 inline-flex justify-center items-center gap-x-4 text-sm font-medium rounded-md border border-gray-200 bg-white text-gray-800 shadow-sm hover:bg-gray-50 disabled:opacity-50 disabled:pointer-events-none dark:bg-slate-900 dark:border-gray-700 dark:text-white dark:hover:bg-gray-800 dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600">
                                                    <svg class="flex-shrink-0 size-3.5"
                                                        xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                                                        viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                                        stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                        <path d="M5 12h14" />
                                                    </svg>
                                                </button>
                                                <input
                                                    class="p-0 w-6 text-[14px] bg-transparent border-0 font-bold focus:outline-none text-gray-800 text-center"
                                                    type="text" v-model="quantity">
                                                <button @click="increaseQuantity" type="button"
                                                    class="size-6 inline-flex justify-center items-center gap-x-4 text-sm font-medium rounded-md border border-gray-200 bg-white text-gray-800 shadow-sm hover:bg-gray-50 disabled:opacity-50 disabled:pointer-events-none dark:bg-slate-900 dark:border-gray-700 dark:text-white dark:hover:bg-gray-800 dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600">
                                                    <svg class="flex-shrink-0 size-3.5"
                                                        xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                                                        viewBox="0 0 24 24" fill="none" stroke="currentColor"
                                                        stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                        <path d="M5 12h14" />
                                                        <path d="M12 5v14" />
                                                    </svg>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                    <div @click="toggleConfirm" class="w-full">
                                        <ButtonStyle value="add to cart" />
                                    </div>
                                    <ConfirmModel :toggle-modal="toggleConfirm" :is-open-modal="isOpenConfirm">
                                        <div>
                                            <p class="text-xl uppercase my-10 font-bold">Do you want to add this product
                                                into your cart !</p>
                                            <div class="flex uppercase justify-center items-center gap-10">
                                                <p @click="toggleConfirm" class="font-bold cursor-pointer">Back to view
                                                </p>
                                                <div @click="addProductToCart"
                                                    class="bg-green-600 py-3 px-6 w-72 -skew-x-[30deg]">
                                                    <button
                                                        class="skew-x-[30deg] text-white tracking-widest font-bold">CONFIRM</button>
                                                </div>
                                            </div>
                                        </div>
                                    </ConfirmModel>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div
            class="h-[100vh] bg-cover flex w-full bg-no-repeat bg-[url('https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/vector-gp68-13v/msi-gp68-13th-display-bg.jpg')]">
            <div class="w-1/2"></div>
            <div class="w-1/2 h-full flex flex-col justify-center items-center text-white">
                <div class="flex gap-10 mb-10">
                    <img class="w-32"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/vector-gp78-13v/intel-core-i9-badge.png"
                        alt="">
                    <h4 class="text-3xl font-bold">LAPTOP USING GEFORCE RTX 30 SERIES, PLAYING GAME TOP AND
                        ENJOYING THE ULTIMATE POWER</h4>
                </div>
                <p class="tracking-wider">With Intel® Core™ i9-12900HX, Core™ i9-12900HX processor , equipped with 8
                    high-performance cores and
                    8 energy-saving cores, Vector GP68 12V HX delivers unprecedented performance improvements when
                    multitasking and playing games. heavy game.</p>
            </div>
        </div>
        <div class="grid grid-cols-3 gap-5 p-20 bg-black">
            <!-- Item 1 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-14"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/Thin/Thin15-B13V/images/ft-icon-windows11.png"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Windows 11 Home</h3>
            </div>
            <!-- Item 2 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-14"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/2023_RPLS/Cyborg-15-AI-A1V/icon-core-ultra-processor-7.webp"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Intel® Core™ Ultra 7 processor 155H</h3>
            </div>
            <!-- Item 3 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-full"
                        src="https://storage-asset.msi.com/global/picture/image/feature/Handhelds/Claw-A1M/icon-Ergonomic-Design-v1.png"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Long-session Comfort Gaming</h3>
            </div>
            <!-- Item 4 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-full"
                        src="https://storage-asset.msi.com/global/picture/image/feature/Handhelds/Claw-A1M/icon-Cooler-Boost-HyperFlow-v1.png"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Keep Cooler, Game Longer</h3>
            </div>
            <!-- Item 5 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-14"
                        src="https://storage-asset.msi.com/global/picture/image/feature/Handhelds/Claw-A1M/icon-53-WHr-Battery-Capacity-v1.png"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Design dedicated for Handheld</h3>
            </div>
            <!-- Item 6 -->
            <div class="border py-10 flex flex-col gap-5 justify-center items-center">
                <div>
                    <img class="w-14"
                        src="https://storage-asset.msi.com/global/picture/image/feature/Handhelds/Claw-A1M/MSICenterM-icon.png"
                        alt="">
                </div>
                <h3 class="text-xl text-blue-500">Long-session Comfort Gaming</h3>
            </div>
        </div>
        <div class="relative">
            <img src="https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/stealth_16_a13/msi-stealth16-13-intel-bg.jpg"
                alt="">
            <div class="flex absolute top-0 left-0 right-0 bottom-0 bg-black/60">
                <div class="w-1/2">
                    <img class="w-[80%]"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/stealth_14_A13/msi-stealth14-thine-white.png"
                        alt="">
                    <div class="px-20 my-10 text-white">
                        <h4 class="font-bold text-3xl my-4">ATTRACTIVE COLORS ELEGANT DESIGN</h4>
                        <p class="tracking-wider">Stealth 14 Studio A13V is only 1.7kg light and only 19mm thin, with a
                            body made from
                            extremely durable Aluminum - Magnesium alloy and has two color options to express different
                            personalities. Pure White represents the beauty of technology and the future, with its
                            bright colors. Star Blue symbolizes the mysterious starry night sky. The device's ultra-thin
                            and light design is like a spaceship flying through the sky, embarking on a journey to
                            explore new limits.</p>
                    </div>
                </div>
                <div class="w-1/2 flex flex-col justify-center items-center">
                    <img class="w-[80%]"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/stealth_14_A13/stealth-14-kv-title.png"
                        alt="">
                    <img class="w-1/2"
                        src="https://storage-asset.msi.com/global/picture/image/feature/nb/2022_RPL/stealth_14_A13/msi-stealth14-13th-laptop-ultra-white.png"
                        alt="">
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { useStore } from 'vuex';
import { useRoute } from 'vue-router'
import { Product } from '../interfaces/Product';
import { ComputedRef, computed, onMounted, ref } from 'vue';
import { ShoppingCartReq } from '../interfaces/ShoppingCart';
import ButtonStyle from '@components/Element/ButtonStyle.vue';
import ConfirmModel from "@components/Modal/ConfirmModal.vue";

// LIFE CYCLE
onMounted(() => {
  window.scrollTo(0, 0);
});

// DEFINE STORE
const store = useStore();
const route = useRoute();

// USE STORE
const product: ComputedRef<Product> = computed(() => store.state.product.product);
const infoUser = computed(() => store.getters['auth/getInforUser']);

// ACTION STORE
store.dispatch("product/getOneProduct", route.params.id);

// DEFINE CONSTANT
const quantity = ref(1);
const isOpenConfirm = ref(false);

// METHODS
const toggleConfirm = () => isOpenConfirm.value = !isOpenConfirm.value;

const addProductToCart = () => {
    if (product.value.id) {
        const cartBuild: ShoppingCartReq = {
            user: {
                id: infoUser.value.id
            },
            product: {
                id: product.value.id
            },
            quantity: quantity.value
        }
        store.dispatch('cart/addProductToCart', cartBuild).then(() => {
            store.dispatch('cart/getUserCart', infoUser.value.id);
            toggleConfirm();
        }).catch((error) => {
            console.log(error);
        });
    }

}

// HANDLE NUMBER INPUT QUANTITY
const increaseQuantity = () => {
    quantity.value++;
};

const decreaseQuantity = () => {
    if (quantity.value > 0) {
        quantity.value--;
    }
};


</script>

<style scoped></style>