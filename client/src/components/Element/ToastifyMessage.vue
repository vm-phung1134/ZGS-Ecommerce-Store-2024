<template>
    <div></div>
</template>

<script setup lang="ts">
import { useToast } from 'vue-toast-notification';
import 'vue-toast-notification/dist/theme-sugar.css';

const props = defineProps({
    message: {
        type: String,
        required: true
    }
})

const $toast = useToast();
$toast.open({
    message: props.message,
    duration: 4000
});
</script>

<style scoped></style>