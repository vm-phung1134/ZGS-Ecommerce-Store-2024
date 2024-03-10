<template>
    <div v-if="isLoading">
        <LoadingScreen />
    </div>
    <div v-else
        class="h-[100vh] bg-cover bg-[url('https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/face_react/museum/2024/01_31_refresh/museum_hero_01.jpg')]">
        <div class="flex justify-center items-center h-full bg-gradient-to-r from-black to-black/60">
            <div class="text-white w-1/2 text-xl">
                <p class="my-5 uppercase italic"><span>Delivery by: </span>Lamborgini shipping</p>
                <h1 class="uppercase text-[3rem] text-orange-600 leading-normal -skew-x-[20deg] font-bold">Congratuations! Your order
                    has been placed
                    successfully</h1>
                <p class="my-5 text-[15px]">Thanks you ! Your order has been processed</p>
                <p class="my-5 text-[15px]">We soon contact to you to confirm again your order.</p>
                <div class="flex gap-5 mt-10">
                    <RouterLink to="/">
                        <button class=" bg-white font-bold text-black text-sm px-10 py-3">Shopping continue</button>
                    </RouterLink>
                    <RouterLink :to="{ name: 'order.tracking', params: { id: infoUser.id } }">
                        <button class=" bg-white font-bold text-black text-sm px-10 py-3">Tracking your order</button>
                    </RouterLink>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import LoadingScreen from '@components/Element/LoadingScreen.vue';
import { computed, onMounted, ref } from 'vue';
import { RouterLink } from 'vue-router';
import { useStore } from 'vuex';

// LIFE CYCLE
onMounted(() => {
    window.scrollTo(0, 0);
});

// DEFINE STORE
const store = useStore();

// USE STORE
const infoUser = computed(() => store.getters['auth/getInforUser']);

// DEFINE CONSTANT
const isLoading = ref(true);

// METHODS
setTimeout(() => {
    isLoading.value = false;
}, 2000)

</script>

<style scoped></style>