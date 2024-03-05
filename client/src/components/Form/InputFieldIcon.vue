<template>
    <div class="relative mb-6 w-full">
        <div class="flex gap-2 w-full items-center">
            <!-- Passed from parent -->
            <svg class="w-5" viewBox="0 0 20 20" version="1.1" xmlns="http://www.w3.org/2000/svg" fill="#000000">
                <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                <g id="SVGRepo_iconCarrier">
                    <g id="layer1">
                        <path
                            d="M 10 0 L 9.4375 0.40234375 L 8.8613281 0.77539062 L 8.2636719 1.1230469 L 7.6542969 1.4433594 L 7.0292969 1.734375 L 6.390625 1.9960938 L 5.7421875 2.2304688 L 5.0839844 2.4335938 L 4.4179688 2.6054688 L 3.7421875 2.7480469 L 3.0605469 2.8574219 L 2.3769531 2.9355469 L 1.6894531 2.984375 L 1 3 L 1.015625 3.8339844 L 1.0664062 4.6660156 L 1.1503906 5.4960938 L 1.2695312 6.3222656 L 1.421875 7.1425781 L 1.6054688 7.9550781 L 1.8222656 8.7597656 L 2.0722656 9.5546875 L 2.3535156 10.339844 L 2.6679688 11.113281 L 3.0136719 11.873047 L 3.3886719 12.617188 L 3.7929688 13.347656 L 4.2265625 14.058594 L 4.6894531 14.751953 L 5.1816406 15.427734 L 5.6992188 16.082031 L 6.2421875 16.712891 L 6.8105469 17.322266 L 7.4042969 17.910156 L 8.0214844 18.470703 L 8.6601562 19.007812 L 9.3203125 19.517578 L 10 20 L 10.679688 19.517578 L 11.339844 19.007812 L 11.978516 18.470703 L 12.595703 17.910156 L 13.189453 17.322266 L 13.757812 16.712891 L 14.300781 16.082031 L 14.818359 15.427734 L 15.308594 14.751953 L 15.771484 14.058594 L 16.207031 13.347656 L 16.611328 12.617188 L 16.986328 11.873047 L 17.332031 11.113281 L 17.644531 10.339844 L 17.925781 9.5546875 L 18.175781 8.7597656 L 18.394531 7.9550781 L 18.580078 7.1425781 L 18.730469 6.3222656 L 18.849609 5.4960938 L 18.933594 4.6660156 L 18.984375 3.8339844 L 19 3 L 18.310547 2.984375 L 17.623047 2.9355469 L 16.939453 2.8574219 L 16.257812 2.7480469 L 15.582031 2.6054688 L 14.916016 2.4335938 L 14.257812 2.2304688 L 13.607422 1.9960938 L 12.970703 1.734375 L 12.345703 1.4433594 L 11.734375 1.1230469 L 11.138672 0.77539062 L 10.560547 0.40234375 L 10 0 z M 10 1.2285156 L 10.597656 1.6152344 L 11.210938 1.9746094 L 11.837891 2.3085938 L 12.482422 2.6132812 L 13.136719 2.8867188 L 13.804688 3.1328125 L 14.482422 3.3496094 L 15.169922 3.5332031 L 15.863281 3.6894531 L 16.5625 3.8125 L 17.267578 3.90625 L 17.976562 3.96875 L 17.921875 4.7558594 L 17.833984 5.5410156 L 17.716797 6.3242188 L 17.566406 7.0996094 L 17.384766 7.8691406 L 17.171875 8.6308594 L 16.929688 9.3808594 L 16.658203 10.123047 L 16.353516 10.853516 L 16.023438 11.570312 L 15.662109 12.273438 L 15.273438 12.960938 L 14.855469 13.632812 L 14.414062 14.289062 L 13.945312 14.923828 L 13.451172 15.541016 L 12.931641 16.136719 L 12.388672 16.710938 L 11.824219 17.263672 L 11.236328 17.791016 L 10.626953 18.296875 L 10 18.777344 L 9.3730469 18.296875 L 8.7636719 17.791016 L 8.1777344 17.263672 L 7.6113281 16.710938 L 7.0683594 16.136719 L 6.5488281 15.541016 L 6.0566406 14.923828 L 5.5859375 14.289062 L 5.1445312 13.632812 L 4.7265625 12.960938 L 4.3378906 12.273438 L 3.9785156 11.570312 L 3.6445312 10.853516 L 3.34375 10.123047 L 3.0703125 9.3808594 L 2.828125 8.6308594 L 2.6152344 7.8691406 L 2.4335938 7.0996094 L 2.2832031 6.3242188 L 2.1660156 5.5410156 L 2.078125 4.7558594 L 2.0234375 3.96875 L 2.7304688 3.90625 L 3.4355469 3.8125 L 4.1367188 3.6894531 L 4.8320312 3.5332031 L 5.5175781 3.3496094 L 6.1953125 3.1328125 L 6.8632812 2.8867188 L 7.5175781 2.6132812 L 8.1621094 2.3085938 L 8.7910156 1.9746094 L 9.4023438 1.6152344 L 10 1.2285156 z M 14.007812 6.4960938 C 13.878054 6.4996937 13.754782 6.5536348 13.664062 6.6464844 L 9.0175781 11.292969 L 7.3710938 9.6464844 C 6.8998386 9.1556779 6.1732557 9.8822616 6.6640625 10.353516 L 8.6640625 12.353516 C 8.8593275 12.5487 9.1758285 12.5487 9.3710938 12.353516 L 14.371094 7.3535156 C 14.696364 7.0355126 14.462535 6.4836228 14.007812 6.4960938 z "
                            style="fill:#222222; fill-opacity:1; stroke:none; stroke-width:0px;"></path>
                    </g>
                </g>
            </svg>

            <input v-model="valueInput" @blur="validate" :type="props.componentData.type" class="peer block min-h-[auto] w-full 
            border-b-2 px-3 py-[0.6rem] leading-[2.15] outline-none transition-all duration-200 placeholder:text-sm
            ease-linear focus:placeholder:opacity-100 motion-reduce:transition-none"
                :placeholder="props.componentData.placeholder" :id="props.componentData.id"
                :autocomplete="props.componentData.id" />
        </div>
        <span v-if="localError" class="text-[12px] text-red-600 flex mt-1 gap-1">
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
const valueInput = defineModel('valueInput');
// Define 1 events
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