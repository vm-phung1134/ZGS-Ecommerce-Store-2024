<template>
    <div
        class="h-[100vh] bg-[url('https://storage-asset.msi.com/global/picture/image/feature/nb/GE/Raider-GE78-HX-13V/cooler-boost-bg.jpg')]">
        <div class="flex justify-center items-center h-full">
            <div class="text-white w-1/2">
                <h1 class="uppercase text-[3rem] -skew-x-[20deg] font-bold">Congratuations! Your order has been placed
                    successfully</h1>
                <div class="flex gap-5 mt-5">
                    <RouterLink to="/">
                        <button class="hover:text-red-500">Shopping continue</button>
                    </RouterLink>
                    <RouterLink :to="{ name: 'order.tracking', params: { id: infoUser.id } }">
                        <button class="hover:text-green-500">Tracking your orer</button>
                    </RouterLink>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import { computed, onMounted } from 'vue';
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

</script>

<style scoped></style>