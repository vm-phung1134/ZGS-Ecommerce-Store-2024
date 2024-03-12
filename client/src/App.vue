<script setup lang="ts">
import Header from './layouts/Header.vue';
import Footer from './layouts/Footer.vue';
import { computed, provide, ref } from 'vue';
import { useStore } from 'vuex';

// HANDLE CHECK AUTHENTICATION
const store = useStore();
const checkToken = computed(() => store.getters['auth/isUserAuthenticated']);
const isUserAuthenticated = ref(false);
const toggleAuthentication = () => isUserAuthenticated.value = !isUserAuthenticated.value;
if (checkToken.value) {
  isUserAuthenticated.value = true;
} else {
  isUserAuthenticated.value = false;
}
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
