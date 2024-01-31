<template>
    <div class="relative mb-6">
        <input @input="onInput" :type="props.componentData.type" class="peer block min-h-[auto] w-full rounded 
            border-0 bg-gray-100 px-3 py-[0.6rem] leading-[2.15] outline-none transition-all duration-200 
            ease-linear focus:placeholder:opacity-100 motion-reduce:transition-none" :id="props.componentData.id"
            :autocomplete="props.componentData.id" />
        <label :for="props.componentData.id" class="pointer-events-none absolute left-3 top-0 mb-0 max-w-[90%] origin-[0_0] truncate pt-[0.37rem] 
            leading-[2.15] text-neutral-500 transition-all duration-200 ease-out -translate-y-[1.3rem] scale-[0.9]
            motion-reduce:transition-none">
            {{ props.componentData.label }}
        </label>
    </div>
</template>

<script setup lang="ts">
import { defineEmits, defineProps } from 'vue';

const props = defineProps({
    modelValue: {
        type: String,
        required: true
    },
    componentData: {
        type: Object,
        default: () => {
            return {
                type: 'text',
                id: 'inputId',
                placeholder: 'PlaceHolder',
                label: 'Label',
                errMsg: null,
                pattern: "",
                minLength: null,
                maxLength: null
            }
        }
    }
});

const emits = defineEmits(['update:modelValue', 'form-validate']);
const onInput = (e: Event) => {
    const target = e.target as HTMLInputElement;
    emits('update:modelValue', target.value);
};
// Validate function

</script>

<style scoped></style>