<script setup lang="ts">
import Header from './layouts/Header.vue';
import Footer from './layouts/Footer.vue';

</script>

<template>
  <div class="relative">
    <Header></Header>
    <router-view></router-view>
    <Footer></Footer>
  </div>
</template>

<style scoped></style>
