<template>
    <div class="mt-10">
        <h1 class="text-3xl font-bold text-center py-5">Welcome to ZGS Member Center</h1>
        <div class="flex gap-3 h-[70vh] mx-20">
            <IntroSignIn className="p-5 flex flex-col gap-2 w-1/2" />
            <div class="h-full w-[1px] bg-gray-200"></div>
            <LoginFrom className="w-1/2 p-5" />
        </div>
        <ToastifyMessage v-if="isChangePassword"
            message="Password has been changed successfully, You can sign in now !" />
    </div>
</template>

<script setup lang="ts">
import LoginFrom from "@components/Form/LoginForm.vue";
import IntroSignIn from "@components/Introduce/IntroSignIn.vue";
import { ComputedRef, computed, onMounted } from "vue";
import ToastifyMessage from "@components/Element/ToastifyMessage.vue"
import { useStore } from "vuex";

// LIFE CYCLE
onMounted(() => {
    window.scrollTo(0, 0);
});

// DEFINE STORE
const store = useStore();

// USE STORE
const isChangePassword: ComputedRef<boolean> = computed(() => store.state.auth.isChangePassword);

</script>

<style scoped></style>