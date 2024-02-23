<template>
    <div class="w-full">
        <div class="lg:h-[80vh] h-full">
            <Carousel />
        </div>
        <div class="h-[50vh]">
            <NewProduction />
        </div>
        <div class="h-[90vh]">
            <CategoryProduct />
        </div>
        <div class="max-h-full">
            <LatestProduct />
        </div>
        <div class="max-h-full">
            <AboutStore />
        </div>
    </div>
</template>

<script setup lang="ts">
import NewProduction from '../components/Introduce/NewProduction.vue';
import Carousel from '../components/Element/Carousel.vue';
import CategoryProduct from "../components/Introduce/CategoryProduct.vue";
import LatestProduct from "../components/Introduce/LatestProduct.vue";
import AboutStore from '../components/Introduce/AboutStore.vue';


</script>

<style scoped></style>