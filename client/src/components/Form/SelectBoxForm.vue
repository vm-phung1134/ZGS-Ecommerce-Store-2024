<template>
    <div class="absolute top-0 w-[25rem] z-10">
        <Listbox v-model="selectedPerson">
            <div class="relative mt-1">
                <ListboxButton
                    class="relative w-full cursor-default rounded-lg bg-white py-2 pl-3 pr-10 text-left shadow-md focus:outline-none focus-visible:border-indigo-500 focus-visible:ring-2 focus-visible:ring-white/75 focus-visible:ring-offset-2 focus-visible:ring-offset-orange-300 sm:text-sm">
                    <span class="block truncate">{{ selectedPerson }}</span>
                    <span class="pointer-events-none absolute inset-y-0 right-0 flex items-center pr-2">
                        <ChevronUpDownIcon class="h-5 w-5 text-gray-400" aria-hidden="true" />
                    </span>
                </ListboxButton>

                <transition leave-active-class="transition duration-100 ease-in" leave-from-class="opacity-100"
                    leave-to-class="opacity-0">
                    <ListboxOptions
                        class="absolute mt-1 cursor-pointer max-h-60 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black/5 focus:outline-none sm:text-sm">
                        <ListboxOption v-for="payment in payments" :key="payment.key"
                            :value="payment.value" as="template">
                            <li class="hover:bg-amber-100 cu p-3 hover:text-amber-900">{{ payment.value }}</li>
                        </ListboxOption>
                    </ListboxOptions>
                </transition>
            </div>
        </Listbox>
    </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import {
    Listbox,
    ListboxButton,
    ListboxOptions,
    ListboxOption,
} from '@headlessui/vue'

const payments = [
    { value: 'Visa', key: 'vs' },
    { value: 'Master card', key: 'ms' },
    { value: 'Paypal', key: 'pp' },
]
const selectedPerson = ref(payments[0].value)
</script>