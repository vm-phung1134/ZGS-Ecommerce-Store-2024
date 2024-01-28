<script setup lang="ts">
import { ref } from 'vue'

defineProps<{ msg: string }>()

const count = ref(0)
</script>

<template>
  <h1>{{ msg }}</h1>

  <div class="card">
    <button class="border rounded-md p-3 bg-green-700 text-white
    " type="button" @click="count++">count is {{ count }}</button>
  </div>
</template>

<style scoped>
  .btn{
    @apply border rounded-md p-3 bg-green-700 text-white;
  }
</style>
