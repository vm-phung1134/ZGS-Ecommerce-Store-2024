<template>
    <TransitionRoot appear :show="props.isOpenSearchBar" as="template">
        <Dialog as="div" class="relative z-10 text-sm">
            <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0" enter-to="opacity-100"
                leave="duration-200 ease-in" leave-from="opacity-100" leave-to="opacity-0">
                <div class="fixed inset-0 bg-black/60"></div>
            </TransitionChild>

            <div class="fixed inset-0 overflow-y-scroll">
                <div class="flex min-h-full">
                    <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0 scale-95"
                        enter-to="opacity-100 scale-100" leave="duration-200 ease-in" leave-from="opacity-100 scale-100"
                        leave-to="opacity-0 scale-95">
                        <div class="bg-white flex flex-col gap-10 min-h-[120vh] max-h-full mt-20 w-full px-40 py-10">
                            <!-- Header -->
                            <div class="flex justify-between">
                                <p class="uppercase text-4xl font-bold">zion gaming store</p>
                                <button @click="props.toggleSearchBar" class="flex gap-3 items-center">
                                    <span class="text-xl uppercase">Close search</span>
                                    <svg class="w-8" xmlns="http://www.w3.org/2000/svg" fill="#000000"
                                        viewBox="0 0 24 24">
                                        <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                                        <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round">
                                        </g>
                                        <g id="SVGRepo_iconCarrier">
                                            <path
                                                d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z">
                                            </path>
                                        </g>
                                    </svg>
                                </button>
                            </div>
                            <div class="min-h-fit w-[70%]">
                                <h1 class="uppercase font-bold text-[6rem] leading-[1.2]">Search in the website</h1>
                            </div>
                            <div class="text-2xl gap-2 flex mt-10 w-1/2 items-center outline-none uppercase">
                                <input v-model="debouncedSearchValue" placeholder="Seach on zionstore.com"
                                    class="py-3 outline-none w-full border-b-2 placeholder:italic placeholder:text-2xl placeholder:font-thin"
                                    type="text">
                                <button class="uppercase">Search</button>
                            </div>
                            <div class="flex justify-between items-center">
                                <h4 class="font-bold text-lg uppercase">Here is your result based on your keywork</h4>
                                <div class="z-10">
                                    <SelectBoxForm class-name="w-52 cursor-pointer" :array-value="sortListType"
                                        :selected-value="selectedFilter" @update:selectedValue="updateFilterSelected" />
                                </div>
                            </div>
                            <div v-if="debouncedSearchValue != ''" class="grid grid-cols-3 gap-5">
                                <div v-for="product in filteredProducts" :key="product?.id">
                                    <ProductCard :product="product" />
                                </div>
                            </div>
                        </div>
                    </TransitionChild>
                </div>
            </div>
        </Dialog>
    </TransitionRoot>
</template>

<script setup lang="ts">

import ProductCard from '@components/Element/ProductCard.vue';
import { Product } from '@/interfaces/Product';
import {
    TransitionRoot,
    TransitionChild,
    Dialog
} from '@headlessui/vue';
import { ComputedRef, computed, ref } from 'vue';
import { useStore } from 'vuex';
import useDebouncedRef from '../hook/useDebouncedRef';
import SelectBoxForm from '@components/Form/SelectBoxForm.vue';
import { FILTER_PRODUCT_ITEM, sortListType } from '../utils/constant';

// DEFINE PROPS
const props = defineProps({
    isOpenSearchBar: {
        type: Boolean,
        required: true,
    },
    toggleSearchBar: {
        type: Function,
        required: true
    },
});

// DEFINE STORE
const store = useStore();

// USE STORE
const products: ComputedRef<Product[]> = computed(() => store.state.product.products);

// ACTION STORE
store.dispatch("product/getAllProducts");

// DEFINE CONSTANT
const searchValue = ref('');
const debouncedSearchValue = useDebouncedRef(searchValue.value, 1000, false);
const selectedFilter = ref(sortListType[0].value);

// METHOD
const updateFilterSelected = (newValue: string) => {
    selectedFilter.value = newValue;
};

const filteredProducts = computed(() => {
    const keyword = debouncedSearchValue.value.toLowerCase();
    let filtered = products.value.filter((product) =>
        product.name.toLowerCase().includes(keyword)
    );

    switch (selectedFilter.value) {
        case FILTER_PRODUCT_ITEM.FILTER_A_Z:
            filtered.sort((a, b) => a.name.localeCompare(b.name));
            break;
        case FILTER_PRODUCT_ITEM.FILTER_Z_A:
            filtered.sort((a, b) => b.name.localeCompare(a.name));
            break;
        case FILTER_PRODUCT_ITEM.FILTER_LOW_PRICE:
            filtered.sort((a, b) => a.price - b.price);
            break;
        case FILTER_PRODUCT_ITEM.FILTER_HIGH_PRICE:
            filtered.sort((a, b) => b.price - a.price);
            break;
        default:
            break;
    }

    return filtered;
});

</script>