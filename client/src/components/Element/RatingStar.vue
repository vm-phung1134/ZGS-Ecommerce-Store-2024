<template>
    <div :class="props.className">
        <input v-for="index in props.ratingCount" name="rating-1" :key="index" type="radio"
            class="mask mask-star bg-orange-400" @click="handleRatingClick(index)" />
    </div>
</template>

<script setup lang="ts">
import { defineProps, defineEmits } from 'vue';

const props = defineProps({
    className: {
        type: String,
        required: true
    },
    ratingCount: {
        type: Number,
        required: true
    }
});

const emit = defineEmits(['update:getRating']);

const handleRatingClick = (rating: number) => {
    emit('update:getRating', rating);
}
</script>

<style scoped></style>