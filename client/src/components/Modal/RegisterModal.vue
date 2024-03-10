<template>
    <TransitionRoot appear :show="props.isOpenModal" as="template">
        <Dialog as="div" class="relative z-10 text-sm">
            <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0" enter-to="opacity-100"
                leave="duration-200 ease-in" leave-from="opacity-100" leave-to="opacity-0">
                <div class="fixed inset-0 bg-black/25"></div>
            </TransitionChild>

            <div class="fixed inset-0 overflow-y-auto">
                <div class="flex min-h-full items-center justify-center p-4 text-center">
                    <TransitionChild as="template" enter="duration-300 ease-out" enter-from="opacity-0 scale-95"
                        enter-to="opacity-100 scale-100" leave="duration-200 ease-in" leave-from="opacity-100 scale-100"
                        leave-to="opacity-0 scale-95">
                        <DialogPanel
                            class="w-full max-w-xl transform overflow-hidden rounded-md bg-white p-6 text-left align-middle shadow-xl transition-all">
                            <DialogTitle as="h3" class="text-xl font-bold leading-6 mb-2 uppercase">
                                Create an account
                            </DialogTitle>
                            <span class="text-xs">Please fill form to register for the event</span>
                            <div class="my-4">
                                <RegisterForm :toggleModal="props.toggleModal" />
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
import RegisterForm from '../Form/RegisterForm.vue';

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
  