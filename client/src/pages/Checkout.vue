<template>
    <div class="min-h-[120vh] max-h-full mb-10">
        <div class="mx-32 my-10">
            <button class="text-green-600 py-2"> &lt; Back to shopping</button>
            <h3 class="font-bold text-4xl uppercase">Order payment</h3>
        </div>
        <div class="flex h-full mx-32">
            <div class="w-8/12">
                <!-- ADDRESS -->
                <div class="border-l border-green-800 h-60 relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">1</button>
                        <h4 class="font-bold">Delivery</h4>
                    </div>
                    <div class="absolute top-10 left-10">
                        <h4 class="text-sm italic my-2">Choose one addree you want to delivery</h4>
                        <div class="flex gap-3">
                            <div class="border-sky-600 w-72 border p-3 text-sm">
                                <ul>
                                    <li class="flex gap-5">
                                        <p>Name</p>
                                        <p class="font-bold">Vo Minh Phung</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Phone:</p>
                                        <p>(84 +) 564392088</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Address: </p>
                                        <p class="truncate">30/4 street - Hung Loi - Ninh Kieu distric - Can Tho City</p>
                                    </li>
                                </ul>
                            </div>
                            <div class="border-gray-600 w-72 border p-3 text-sm">
                                <ul>
                                    <li class="flex gap-5">
                                        <p>Name</p>
                                        <p class="font-bold">Vo Minh Phung</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Phone:</p>
                                        <p>(84 +) 564392088</p>
                                    </li>
                                    <li class="flex gap-5">
                                        <p>Address: </p>
                                        <p class="truncate">30/4 street - Hung Loi - Ninh Kieu distric - Can Tho City</p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <button class="text-green-700 text-sm my-5">Go to your address management -></button>
                    </div>
                </div>
                <!-- ORDERS -->
                <div class="border-l border-green-800 h-60 relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">2</button>
                        <h4 class="font-bold">Order summary</h4>
                    </div>
                    <div class="absolute top-10 left-10">
                        <div class="grid grid-cols-12 gap-3 border-b">
                            <div class="col-span-2">
                                <img class="w-full h-full"
                                    src="https://asset.msi.com/resize/image/global/product/product_1684823634257687253fc3e0a9d76228ea118402bc.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                    alt="">
                            </div>
                            <div class="col-span-10">
                                <h4 class="font-bold text-sm">LAPTOP SỬ DỤNG GEFORCE RTX 40 <span class="font-normal">{{
                                    `(Quantity: x2)` }}</span></h4>
                                <ul>
                                    <li class="flex gap-3 items-center text-sm">
                                        <p class="uppercase text-gray-500">Brand name:</p>
                                        <p>MSI Gamming Latop</p>
                                    </li>
                                    <li class="flex gap-3 items-center text-sm">
                                        <p class="uppercase text-gray-500">Production:</p>
                                        <p>US / UK</p>
                                    </li>
                                    <li class="flex gap-3 items-center text-sm">
                                        <p class="uppercase text-gray-500">Price:</p>
                                        <p class="text-red-600">$350.00</p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- PAYMENT -->
                <div class=" border-green-800 h-60 relative">
                    <div class="flex gap-4 items-center absolute top-0 -left-4">
                        <button class="bg-green-600 rounded-full text-white py-1 px-3">3</button>
                        <h4 class="font-bold">Payment methods</h4>
                    </div>
                    <div class="absolute top-10 left-10 w-full">
                        <div class="flex justify-between w-[60%]">
                            <label for="credit-card" class="flex gap-3 items-center">
                                <input type="radio" id="credit-card" name="radio-1" class="radio radio-sm radio-success"
                                    checked />
                                <span>Visa Card</span>
                            </label>
                            <label for="credit-card" class="flex gap-3 items-center">
                                <input type="radio" id="credit-card" name="radio-1" class="radio radio-sm radio-success"
                                    checked />
                                <span>Banking</span>
                            </label>
                            <label for="credit-card" class="flex gap-3 items-center">
                                <input type="radio" id="credit-card" name="radio-1" class="radio radio-sm radio-success"
                                    checked />
                                <span>Paypal</span>
                            </label>
                            <label for="credit-card" class="flex gap-3 items-center">
                                <input type="radio" id="credit-card" name="radio-1" class="radio radio-sm radio-success"
                                    checked />
                                <span>Carsh on delivery</span>
                            </label>

                        </div>
                        <div class="flex mt-5 gap-5">
                            <div class="border-gray-600 shadow-xl p-3 w-60">
                                <img class="w-1/4" src="https://cdn-icons-png.flaticon.com/128/196/196578.png"
                                    alt="credit-card">
                                <p>**** **** **** 8943</p>
                                <p class="text-xs italic text-gray-500">Expire: 07/30</p>
                            </div>
                            <div class="border-gray-600 shadow-xl p-3 w-60">
                                <img class="w-1/4" src="https://cdn-icons-png.flaticon.com/128/196/196565.png"
                                    alt="credit-card">
                                <p>**** **** **** 8943</p>
                                <p class="text-xs italic text-gray-500">Expire: 07/30</p>
                            </div>
                            <div class="border-gray-600 shadow-xl p-3 w-60">
                                <img class="w-1/4" src="https://cdn-icons-png.flaticon.com/128/14881/14881313.png"
                                    alt="credit-card">
                                <p>**** **** **** 8943</p>
                                <p class="text-xs italic text-gray-500">Expire: 07/30</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="w-4/12">
                <div class="shadow-xl h-fit p-5 flex flex-col gap-5">
                    <h3 class="uppercase font-bold text-lg text-red-600">Your order summary</h3>
                    <p class="italic text-sm">Place your order now to get a lot of things from our events in the black friday
                        20/03/2024.</p>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex flex-col gap-5">
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize ">Total bill</p>
                            <p>$9999.00</p>
                        </div>
                        <div class="flex justify-between text-[15px] items-center">
                            <p class="capitalize ">Shipping</p>
                            <p>$30.00</p>
                        </div>
                        <div class="flex justify-between items-center">
                            <p class="capitalize  text-[15px]">Duties & Taxes</p>
                            <div class="flex items-end flex-col">
                                <p class="text-sm">Due Upon Delivery</p>
                            </div>
                        </div>
                    </div>
                    <div class="w-1/3 h-[1.5px] bg-gray-600"></div>
                    <div class="flex justify-between text-lg items-center">
                        <p class="capitalize font-bold">Subtotal</p>
                        <p class="font-bold text-red-600 text-2xl">$3000.00</p>
                    </div>
                    <button class="py-3 text-sm px-5 w-full bg-green-600 text-white uppercase font-bold tracking-wider">
                        Payment now
                    </button>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">

</script>

<style scoped></style>