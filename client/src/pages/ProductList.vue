<template>
    <div class="h-[250vh] relative bg-black text-white">
        <div class="absolute text-black top-5 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
            <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                <ul class="uppercase">
                    <li><a>Home</a></li>
                    <li><a class="font-bold" href="">Gaming world</a></li>
                </ul>
            </div>
        </div>
        <div class="absolute top-20 left-10 right-10">
            <div class="flex justify-between">
                <h4 class="font-bold text-4xl text-white">Welcome to Gamming World</h4>
                <div>
                    <p class="uppercase text-sm">Sort by popular</p>
                </div>
            </div>
        </div>
        <div class="flex h-full mx-10 gap-10">
            <div class="w-3/12 h-full bg-[#1c1a1a]">
                <div class="relative w-full top-40 px-5">
                    <!-- CATEGORY -->
                    <div tabindex="0" class="collapse collapse-arrow">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            Laptop gamming
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li v-for="category in categories" :key="category?.id" class="flex gap-2 items-center">
                                    <input :id="category?.name" type="radio"
                                        class="checkbox rounded-none checkbox-warning radio-xs"
                                        v-model="selectedCategories" :value="category?.name" />
                                    <label :for="category?.name" class="font-thin tracking-wider">
                                        {{ category?.name }}
                                    </label>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- CPU -->
                    <div tabindex="0" class="collapse collapse-arrow">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            CPU series
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX™ 40
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX 30™
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX™ 20
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">AMD Radeon™ 6000M
                                        Series</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- SIZE SCREEN -->
                    <div tabindex="0" class="collapse collapse-arrow ">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            Size Screen
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">14</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">15.6</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">15.6 4K</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">17 1080P HD</label>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <!-- INTEL PLATFORM -->
                    <div tabindex="0" class="collapse collapse-arrow ">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            Intel platform
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">14 Gen</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">15 Gen</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">16 Gen</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">17 Gen</label>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <!-- AMD -->
                    <div tabindex="0" class="collapse collapse-arrow ">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            ADM Flatform
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">RYzen 7000 Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">RYzen 5000 Series</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
            <div class="w-8/12">
                <div class="relative top-40">
                    <div v-if="products.length > 0" class="grid grid-cols-3 gap-5">
                        <!-- PRODUCT LIST -->
                        <div v-for="(product, index) in filteredProducts" :key="product.id"
                            >
                            <div v-if="index < 9" class="border border-gray-500 h-full">
                                <div class="p-3 min-h-72 max-h-fit">
                                    <img class="w-full" :src=product.image alt="img-product-item">
                                </div>
                                <div class="flex justify-center items-center my-3">

                                </div>
                                <div class="h-[1px] mx-20 bg-gray-200"></div>
                                <div class="flex justify-center items-center">
                                    <RouterLink :to="{ name: 'product.detail', params: { id: product.id } }">
                                        <button class="text-sm w-40 bg-red-700 text-white py-3 my-5">View
                                            Detail</button>
                                    </RouterLink>
                                </div>
                                <div class="p-5 text-center">
                                    <h4 class="font-bold text-lg my-2">{{ product.name }}</h4>
                                    <p class="text-sm">Vi xử lý Intel Core Thế hệ 13 / card đồ họa GeForce RTX 40 series
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div v-else class="p-40">
                        <EmptySpace />
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { Category } from '@/interfaces/Category';
import EmptySpace from '@components/Element/EmptySpace.vue';
import { Product } from '../interfaces/Product';
import { ComputedRef, computed, ref } from 'vue';
import { RouterLink } from 'vue-router';
import { useStore } from 'vuex';

// DEFINE STORE
const store = useStore();

// ACTION STORE
store.dispatch("product/getAllProducts");
store.dispatch("category/getAllCategory");

// USE STORE
const products: ComputedRef<Product[]> = computed(() => store.state.product.products);
const categories: ComputedRef<Category[]> = computed(() => store.state.category.categories);

// DEFINE CONSTANT
const selectedCategories = ref<string[]>([]);

// METHODS
const filteredProducts = computed(() => {
    if (selectedCategories.value.length === 0) {
        return products.value;
    } else {
        return products.value.filter(product =>
            selectedCategories.value.includes(product.category.name));
    }
});
</script>
<style scoped></style>