<template>
    <div :class="prop.className">
        <input type="radio" name="rating-1" class="mask mask-star bg-orange-400" />
        <input type="radio" name="rating-1" class="mask mask-star bg-orange-400" checked />
        <input type="radio" name="rating-1" class="mask mask-star bg-orange-400" />
        <input type="radio" name="rating-1" class="mask mask-star bg-orange-400" />
        <input type="radio" name="rating-1" class="mask mask-star bg-orange-400" />
    </div>
</template>

<script setup lang="ts">
const prop = defineProps({
    className: {
        type: String,
        required: true
    }
})
</script>

<style scoped></style>