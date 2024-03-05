<template>
    <div>
        <div class="flex gap-10 mx-20">
            <div class="w-8/12">
                <div class="overflow-x-auto">
                    <table class="table">
                        <!-- head -->
                        <thead>
                            <tr class="uppercase">
                                <th></th>
                                <th>Product name</th>
                                <th>Image</th>
                                <th>Quantity</th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- row 1 -->
                            <tr class="bg-base-200">
                                <th>1</th>
                                <td>Cy Ganderton</td>
                                <td>
                                    <img class="w-20" src="https://asset.msi.com/resize/image/global/product/product_17035046674023a211767f3af074d5b9f843f5f9e1.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                        alt="">
                                </td>
                                <td>1</td>
                                <td>$20</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="w-4/12">
                <div class="shadow-xl h-full p-5 flex flex-col gap-5">
                    <h3 class="uppercase font-bold text-lg text-red-600">Your order summary</h3>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex flex-col gap-5">
                        <div class="flex justify-between text-lg items-center">
                            <p class="capitalize font-bold">Total bill</p>
                            <p class="font-bold">$9999.00</p>
                        </div>
                        <div class="flex justify-between text-lg items-center">
                            <p class="capitalize font-bold">Shipping</p>
                            <p class="font-bold">$30.00</p>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="capitalize font-bold text-lg">Address</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">Ninh Kieu / Can Tho</p>
                                <button class="text-green-700">Address management</button>
                            </div>
                        </div>
                    </div>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex justify-between text-lg items-center">
                        <p class="capitalize font-bold">Subtotal</p>
                        <p class="font-bold text-red-600 text-2xl">$3000.00</p>
                    </div>
                    <button class="py-3 px-5 w-full bg-black text-white uppercase font-bold tracking-wider">Checkout your
                        order</button>
                </div>
            </div>
        </div>

    </div>
</template>

<script setup lang="ts">

</script>

<style scoped></style>