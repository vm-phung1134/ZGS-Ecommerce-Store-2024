<script setup lang="ts">
import Header from './layouts/Header.vue';
import Footer from './layouts/Footer.vue';
import { computed, provide, ref } from 'vue';
import { useStore } from 'vuex';

const store = useStore();
const existedUser = computed(() => store.state.auth.isUserAuthenticated);
const isUserAuthenticated = ref(existedUser ? true : false);
provide('isUserAuthenticated', isUserAuthenticated);

const handleSetIsAuthenticated = (data: boolean) => {
  isUserAuthenticated.value = data;
}


</script>

<template>
  <div class="relative">
    <Header @update:is-user-authenticated="handleSetIsAuthenticated"></Header>
    <router-view></router-view>
    <Footer></Footer>
  </div>
</template>

<style scoped></style>
