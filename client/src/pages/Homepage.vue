<template>
    <Suspense>
        <div v-if="isLoading">
            <LoadingScreen />
        </div>
        <div v-else>
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

        </div>
    </Suspense>
</template>

<script setup lang="ts">
import NewProduction from '@components/Introduce/NewProduction.vue';
import Carousel from '@components/Element/Carousel.vue';
import CategoryProduct from "@components/Introduce/CategoryProduct.vue";
import LatestProduct from "@components/Introduce/LatestProduct.vue";
import AboutStore from '@components/Introduce/AboutStore.vue';
import LoadingScreen from '@components/Element/LoadingScreen.vue';
import { Suspense, onMounted, ref } from 'vue';

// LIFE CYCLE
onMounted(() => {
  window.scrollTo(0, 0);
});

// DEFINE CONSTANT
const isLoading = ref(true);

// METHODS
setTimeout(() => {
    isLoading.value = false;
}, 1200)

</script>

<style scoped></style>