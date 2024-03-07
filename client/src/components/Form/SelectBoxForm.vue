<template>
    <div :class="props.className">
        <Listbox v-model="props.selectedValue">
            <div class="relative mt-1">
                <ListboxButton
                    class="relative w-full cursor-default rounded-lg bg-white py-2 pl-3 pr-10 text-left shadow-md focus:outline-none focus-visible:border-indigo-500 focus-visible:ring-2 focus-visible:ring-white/75 focus-visible:ring-offset-2 focus-visible:ring-offset-orange-300 sm:text-sm">
                    <span class="block truncate">{{ props.selectedValue }}</span>
                    <span class="pointer-events-none absolute inset-y-0 right-0 flex items-center pr-2">
                        <ChevronUpDownIcon class="h-5 w-5 text-gray-400" aria-hidden="true" />
                    </span>
                </ListboxButton>

                <transition leave-active-class="transition duration-100 ease-in" leave-from-class="opacity-100"
                    leave-to-class="opacity-0">
                    <ListboxOptions
                        class="absolute mt-1 cursor-pointer max-h-60 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black/5 focus:outline-none sm:text-sm">
                        <ListboxOption v-for="item in arrayValue" :key="item.key"
                            :value="item.value" as="template">
                            <li class="hover:bg-amber-100 cu p-3 hover:text-amber-900">{{ item.value }}</li>
                        </ListboxOption>
                    </ListboxOptions>
                </transition>
            </div>
        </Listbox>
    </div>
</template>

<script setup lang="ts">
import {
    Listbox,
    ListboxButton,
    ListboxOptions,
    ListboxOption,
} from '@headlessui/vue'

export type SelectType = {
    key: string,
    value: string,
}

const props = defineProps({
    arrayValue:{
        type: Array as () => SelectType[],
        required: true
    },
    selectedValue: {
        type: String,
        required: true
    },
    className: {
        type: String,
        required: false
    }
})

</script>