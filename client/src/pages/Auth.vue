<template>
    <div class="mt-10">
        <h1 class="text-3xl font-bold text-center py-5">Welcome to ZGS Member Center</h1>
        <div class="flex gap-3 h-[75vh] mx-20">
            <IntroSignIn className="py-5 flex flex-col gap-2 w-1/2" />
            <div class="h-full w-[1px] bg-gray-200"></div>
            <div>

            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
import IntroSignIn from "@components/IntroSignIn.vue";


</script>

<style scoped></style>