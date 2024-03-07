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
                            class="w-full max-w-4xl transform overflow-hidden rounded-md bg-white p-6 text-left align-middle shadow-xl transition-all">
                            <DialogTitle as="h3" class="text-xl font-bold leading-6 mb-2">
                                Payment method
                            </DialogTitle>
                            <span class="text-xs">Please fill form to register for the event</span>
                            <div class="my-4 relative items-center flex gap-10 w-full">
                                <div class="w-1/2 ">
                                    <div class="my-5">
                                        <SelectBoxForm />
                                    </div>
                                    <div class="w-full bg-red-100 rounded-xl relative text-white shadow-2xl">
                                        <img class="relative object-cover w-full h-full rounded-xl"
                                            src="https://i.imgur.com/kGkSg1v.png">

                                        <div class="w-full px-8 absolute top-8">
                                            <div class="flex justify-between">
                                                <div class="">
                                                    <p class="font-light uppercase">
                                                        Name
                                                    </p>
                                                    <p class="font-bold tracking-widest">
                                                        VO MINH PHUNG
                                                    </p>
                                                </div>
                                                <img class="w-14 h-14" src="https://i.imgur.com/bbPHJVe.png" />
                                            </div>
                                            <div class="pt-1">
                                                <p class="font-light uppercase">
                                                    Card Number
                                                </p>
                                                <p class="font-bold text-lg tracking-widest">
                                                    4642 3489 9867 7632
                                                </p>
                                            </div>
                                            <div class="pt-6 pr-6">
                                                <div class="flex justify-between">
                                                    <div class="">
                                                        <p class="font-light uppercase text-xs">
                                                            Since
                                                        </p>
                                                        <p class="font-medium tracking-wider text-sm">
                                                            11/15
                                                        </p>
                                                    </div>
                                                    <div class="">
                                                        <p class="font-light uppercase text-xs">
                                                            Valid
                                                        </p>
                                                        <p class="font-medium tracking-wider text-sm">
                                                            03/25
                                                        </p>
                                                    </div>

                                                    <div class="">
                                                        <p class="font-light text-xs">
                                                            CVV
                                                        </p>
                                                        <p class="font-bold tracking-more-wider text-sm">
                                                            ···
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="w-1/2">
                                    <PaymentMethodForm :toggleModal="toggleModal" className="" />
                                </div>
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

import PaymentMethodForm from '../Form/PaymentMethodForm.vue';
import SelectBoxForm from '../Form/SelectBoxForm.vue';

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