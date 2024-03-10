<template>
    <div className="h-full w-full shadow-lg">
        <div className="relative h-full w-full p-3 cursor-pointer">
            <div class="flex justify-center">
                <img className="w-72 h-auto bg-cover" :src=props?.product?.image alt="img-product-item"></img>
            </div>
            <div
                className="absolute opacity-0 hover:opacity-100 transition duration-500 ease-in-out top-0 right-0 left-0 bottom-0 w-full h-full overflow-hidden bg-fixed bg-black/50">
                <RouterLink :to="{ name: 'product.detail', params: { id: product.id } }">
                    <button
                        className="absolute top-[50%] left-[50%] translate-x-[-50%] translate-y-[-50%] text-white
                  border border-white text-sm py-[13px] px-[25px] hover:bg-white hover:text-black hover:ease-linear hover:transition hover:duration-500 hover:border-none">
                        VIEW DETAIL
                    </button>
                </RouterLink>
            </div>
            <div className="text-sm mt-2 lg:text-[15px]">
                <p className="uppercase">{{ props?.product?.name }}</p>
                <p className="text-gray-500 font-thin uppercase">{{ props?.product?.category?.name }}</p>
            </div>
        </div>

    </div>
</template>

<script setup lang="ts">
import { Product } from '@/interfaces/Product';


const props = defineProps({
    product: {
        type: Object as () => Product,
        required: true,
    }
})

</script>

<style scoped></style>