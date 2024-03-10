<template>
    <TransitionRoot appear :show="props.isOpenModal" as="template">
        <Dialog as="div" class="relative z-10 text-sm">
            <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0" enter-to="opacity-100"
                leave="duration-200 ease-in" leave-from="opacity-100" leave-to="opacity-0">
                <div class="fixed inset-0 bg-black/50"></div>
            </TransitionChild>

            <div class="fixed inset-0 overflow-y-auto">
                <div class="flex min-h-full items-center justify-center text-center">
                    <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0 scale-95"
                        enter-to="opacity-100 scale-100" leave="duration-200 ease-in" leave-from="opacity-100 scale-100"
                        leave-to="opacity-0 scale-95">
                        <DialogPanel
                            class="w-full text-white h-fit bg-[url('https://storage-asset.msi.com/event/2023/NB/familypage/images/@Gallery-bg.jpg')] transform overflow-hidden bg-cover text-center align-middle shadow-xl transition-all">
                            <div class="bg-black/40 py-14">
                                <DialogTitle as="h3" class="text-4xl -skew-x-12 uppercase leading-6 mb-2">
                                    Notification from <span class="text-green-600 font-bold">Zion Gaming Store</span>
                                </DialogTitle>
                                <slot></slot>
                            </div>

                        </DialogPanel>
                    </TransitionChild>
                </div>
            </div>
        </Dialog>
    </TransitionRoot>
</template>

<script setup lang="ts">

import {
    TransitionRoot,
    TransitionChild,
    Dialog,
    DialogPanel,
    DialogTitle,
} from '@headlessui/vue';

// DEFINE PROPS
const props = defineProps({
    isOpenModal: {
        type: Boolean,
        required: true,
    },
    toggleModal: {
        type: Function,
        required: true
    },
});

</script>