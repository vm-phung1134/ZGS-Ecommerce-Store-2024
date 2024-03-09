<script setup lang="ts">
import Header from './layouts/Header.vue';
import Footer from './layouts/Footer.vue';
import { computed, ref } from 'vue';
import { useStore } from 'vuex';

const store = useStore();
const existedUser = computed(() => store.getters['auth/isUserAuthenticated']);
const isUserAuthenticated = ref(false);

const handleSetIsAuthenticated = (data: boolean) => {
  isUserAuthenticated.value = data;
}

if (existedUser.value === true) {
  isUserAuthenticated.value = true;
}

</script>

<template>
  <div class="relative">
    <Header :is-authenticated="isUserAuthenticated" @update:is-user-authenticated="handleSetIsAuthenticated">
    </Header>
    <router-view></router-view>
    <Footer></Footer>
  </div>
</template>

<style scoped></style>
