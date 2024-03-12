<script setup lang="ts">
import Header from './layouts/Header.vue';
import Footer from './layouts/Footer.vue';
import { provide, ref } from 'vue';

// HANDLE CHECK AUTHENTICATION
const isUserAuthenticated = ref(false);
const toggleAuthentication = () => isUserAuthenticated.value = !isUserAuthenticated.value;

provide('isUserAuthenticated', isUserAuthenticated);
provide('toggleAuthentication', toggleAuthentication);

</script>

<template>
  <div class="relative">
    <Header>
    </Header>
    <router-view></router-view>
    <Footer></Footer>
  </div>
</template>

<style scoped></style>
