<template>
    <div>
        <div class="py-2 uppercase text-xs px-3 bg-white">
            <div class="w-full flex justify-between items-center gap-x-3">
                <div>
                    <span class="block font-bold text-xs text-gray-800 dark:text-white">
                        Product quantity
                    </span>
                    <span class="block text-[10px] normal-case text-gray-500 dark:text-gray-400">
                        Including tax and shipping
                    </span>
                </div>
                <div class="flex items-center gap-x-1.5">
                    <button @click="decreaseNumberInput" type="button"
                        class="size-6 inline-flex justify-center items-center gap-x-4 text-sm font-medium rounded-md border border-gray-200 bg-white text-gray-800 shadow-sm hover:bg-gray-50 disabled:opacity-50 disabled:pointer-events-none dark:bg-slate-900 dark:border-gray-700 dark:text-white dark:hover:bg-gray-800 dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600">
                        <svg class="flex-shrink-0 size-3.5" xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                            viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                            stroke-linecap="round" stroke-linejoin="round">
                            <path d="M5 12h14" />
                        </svg>
                    </button>
                    <input
                        class="p-0 w-6 text-[14px] bg-transparent border-0 font-bold focus:outline-none text-gray-800 text-center"
                        type="text" v-model="props.quantityValue">
                    <button @click="increaseNumberInput" type="button"
                        class="size-6 inline-flex justify-center items-center gap-x-4 text-sm font-medium rounded-md border border-gray-200 bg-white text-gray-800 shadow-sm hover:bg-gray-50 disabled:opacity-50 disabled:pointer-events-none dark:bg-slate-900 dark:border-gray-700 dark:text-white dark:hover:bg-gray-800 dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600">
                        <svg class="flex-shrink-0 size-3.5" xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                            viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                            stroke-linecap="round" stroke-linejoin="round">
                            <path d="M5 12h14" />
                            <path d="M12 5v14" />
                        </svg>
                    </button>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">

const props = defineProps({
    quantityValue: {
        type: Number,
        required: true
    }
})
const emit = defineEmits(['update:changeInputNumber']);

const increaseNumberInput = () => {
    emit('update:changeInputNumber', props.quantityValue + 1);
}

const decreaseNumberInput = () => {
    if (props.quantityValue > 1) {
        emit('update:changeInputNumber', props.quantityValue - 1);
    }
}
</script>

<style scoped></style>