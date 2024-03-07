<template>
    <div class="relative mb-6 w-full">
        <label class="text-sm capitalize" :for="props.componentData.id">{{ props.componentData.label }}</label>
        <textarea v-model="valueInput" @blur="validate" :type="props.componentData.type" class="peer block min-h-[auto] w-full rounded 
            border-0 bg-gray-100 px-3 py-[0.6rem] leading-[2.15] outline-none transition-all duration-200 
            ease-linear focus:placeholder:opacity-100 motion-reduce:transition-none" :id="props.componentData.id"
            :autocomplete="props.componentData.id"></textarea>
        <span v-if="localError" class="text-[12px] text-red-600 flex my-2 gap-1">
            <svg class="w-5" viewBox="0 0 25 25" fill="none" xmlns="http://www.w3.org/2000/svg">
                <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                <g id="SVGRepo_iconCarrier">
                    <path fill-rule="evenodd" clip-rule="evenodd"
                        d="M4 12.5C4 7.80558 7.80558 4 12.5 4C17.1944 4 21 7.80558 21 12.5C21 17.1944 17.1944 21 12.5 21C7.80558 21 4 17.1944 4 12.5ZM13 14.5V16H12V14.5H13ZM12 9V13H13V9H12Z"
                        fill="#d10000"></path>
                </g>
            </svg>
            <span>{{ localError }}</span>
        </span>
    </div>
</template>

<script setup lang="ts">
import { defineEmits, defineProps, ref } from 'vue';
// Define props are recieved from parent component
const props = defineProps({
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
const valueInput = defineModel<string>('valueInput');
// Define events
const emits = defineEmits(['form-validate']);
// Define a constant to take error massage
const localError = ref("");
// Event handle validate form field
const validate = (e: Event) => {
    const target = e.target as HTMLInputElement;
    const pattern = new RegExp(props.componentData.pattern, "i");
    const isPatternValue = pattern.test(target.value);
    const isLengthValid =
        target.value.length >= props.componentData.minLength &&
        target.value.length <= props.componentData.maxLength
    if (valueInput.length < 0) {
        localError.value = 'Please enter a valid value';
    } else if (!isPatternValue || !isLengthValid) {
        localError.value = props.componentData.errMsg;
    } else {
        localError.value = '';
    }
    emits('form-validate', (isPatternValue && isLengthValid))
}

</script>

<style scoped></style>