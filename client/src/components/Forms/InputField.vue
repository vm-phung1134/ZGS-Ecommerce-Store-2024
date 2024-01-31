<template>
    <div class="relative mb-6">
        <input v-model="props.modelField.value" :type="props.type" class="peer block min-h-[auto] w-full rounded 
            border-0 bg-gray-100 px-3 py-[0.6rem] leading-[2.15] outline-none transition-all duration-200 
            ease-linear focus:placeholder:opacity-100 motion-reduce:transition-none" :id="props.id"
            :autocomplete="props.id" />
        <label :for="props.id" class="pointer-events-none absolute left-3 top-0 mb-0 max-w-[90%] origin-[0_0] truncate pt-[0.37rem] 
            leading-[2.15] text-neutral-500 transition-all duration-200 ease-out -translate-y-[1.3rem] scale-[0.9]
            motion-reduce:transition-none">
            {{ props.label }}
        </label>
        <!-- <span class="text-[12px] text-red-600 flex gap-1 items-center my-1">
            <svg class="w-4" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" stroke="#fa0505">
                <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                <g id="SVGRepo_iconCarrier">
                    <path fill-rule="evenodd" clip-rule="evenodd"
                        d="M12 22c5.523 0 10-4.477 10-10S17.523 2 12 2 2 6.477 2 12s4.477 10 10 10zm-1.5-5.009c0-.867.659-1.491 1.491-1.491.85 0 1.509.624 1.509 1.491 0 .867-.659 1.509-1.509 1.509-.832 0-1.491-.642-1.491-1.509zM11.172 6a.5.5 0 0 0-.499.522l.306 7a.5.5 0 0 0 .5.478h1.043a.5.5 0 0 0 .5-.478l.305-7a.5.5 0 0 0-.5-.522h-1.655z"
                        fill="#f00000"></path>
                </g>
            </svg>
        </span> -->
    </div>
</template>

<script setup lang="ts">
const props = defineProps({
    label: {
        type: String,
        required: true,
    },
    placeHolder: {
        type: String,
        required: true
    },
    id: {
        type: String,
        required: true
    },
    type: {
        type: String,
        required: false,
    },
    modelField: {
        type: Object,
        required: true,
    },

})
</script>

<style scoped></style>