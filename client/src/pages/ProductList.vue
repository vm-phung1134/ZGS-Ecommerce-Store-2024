<template>
    <div class="h-[250vh] relative bg-black text-white">
        <div class="absolute text-black top-5 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
            <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                <ul class="uppercase">
                    <li><a>Home</a></li>
                    <li><a class="font-bold" href="">Gaming world</a></li>
                </ul>
            </div>
        </div>
        <div class="absolute top-20 left-10 right-10">
            <div class="flex justify-between">
                <h4 class="font-bold text-4xl text-white">Welcome to Gamming World</h4>
                <div>
                    <p class="uppercase text-sm">Sort by popular</p>
                </div>
            </div>
        </div>
        <div class="flex h-full mx-10 gap-10">
            <div class="w-3/12 h-full bg-[#1c1a1a]">
                <div class="relative w-full top-40 px-5">
                    <!-- CATEGORY -->
                    <div tabindex="0" class="collapse collapse-arrow">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            Laptop gamming
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">Titan GT Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">Stealth Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">Vector GE Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">Crosshair / Pulse
                                        Series</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- CPU -->
                    <div tabindex="0" class="collapse collapse-arrow">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            CPU devices
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX™ 40
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX 30™
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">GeForce RTX™ 20
                                        Series</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">AMD Radeon™ 6000M
                                        Series</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- SIZE SCREEN -->
                    <div tabindex="0" class="collapse collapse-arrow ">
                        <input type="checkbox" name="my-accordion-2" checked />
                        <div class="collapse-title font-medium tracking-wide">
                            Size Screen
                        </div>
                        <div class="collapse-content cursor-pointer text-sm">
                            <ul class="flex flex-col gap-3 ml-5">
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">14</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">15.6</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">15.6 4K</label>
                                </li>
                                <li class="flex gap-2 items-center">
                                    <input id="titan_laptop" type="checkbox"
                                        class="checkbox rounded-none checkbox-warning checkbox-xs" />
                                    <label for="titan_laptop" class="font-thin tracking-wider">17 1080P HD</label>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
            <div class="w-8/12">
                <div class="relative top-40">
                    <div class="grid grid-cols-3 gap-5">
                        <!-- PRODUCT LIST -->
                        <div class="border border-gray-500">
                            <div>
                                <img src="https://asset.msi.com/resize/image/global/product/product_1684823634257687253fc3e0a9d76228ea118402bc.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                    alt="">
                            </div>
                            <div class="flex justify-center items-center my-3">

                            </div>
                            <div class="h-[1px] mx-20 bg-gray-200"></div>
                            <div class="flex justify-center items-center">
                                <button class="text-sm w-40 bg-red-700 text-white py-3 my-5">View Detail</button>
                            </div>
                            <div class="p-5 text-center">
                                <h4 class="font-bold text-lg my-2">Stealth 16 Mercedes-AMG Motorsport A13V</h4>
                                <p class="text-sm">Vi xử lý Intel Core Thế hệ 13 / card đồ họa GeForce RTX 40 series</p>
                            </div>
                        </div>
                        <div class="border border-gray-500">
                            <div>
                                <img src="https://asset.msi.com/resize/image/global/product/product_1684823634257687253fc3e0a9d76228ea118402bc.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                    alt="">
                            </div>
                            <div class="flex justify-center items-center my-3">

                            </div>
                            <div class="h-[1px] mx-20 bg-gray-200"></div>
                            <div class="flex justify-center items-center">
                                <button class="text-sm w-40 bg-red-700 text-white py-3 my-5">View Detail</button>
                            </div>
                            <div class="p-5 text-center">
                                <h4 class="font-bold text-lg my-2">Stealth 16 Mercedes-AMG Motorsport A13V</h4>
                                <p class="text-sm">Vi xử lý Intel Core Thế hệ 13 / card đồ họa GeForce RTX 40 series</p>
                            </div>
                        </div>
                        <div class="border border-gray-500">
                            <div>
                                <img src="https://asset.msi.com/resize/image/global/product/product_1684823634257687253fc3e0a9d76228ea118402bc.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                    alt="">
                            </div>
                            <div class="flex justify-center items-center my-3">

                            </div>
                            <div class="h-[1px] mx-20 bg-gray-200"></div>
                            <div class="flex justify-center items-center">
                                <button class="text-sm w-40 bg-red-700 text-white py-3 my-5">View Detail</button>
                            </div>
                            <div class="p-5 text-center">
                                <h4 class="font-bold text-lg my-2">Stealth 16 Mercedes-AMG Motorsport A13V</h4>
                                <p class="text-sm">Vi xử lý Intel Core Thế hệ 13 / card đồ họa GeForce RTX 40 series</p>
                            </div>
                        </div>
                        <div class="border border-gray-500">
                            <div>
                                <img src="https://asset.msi.com/resize/image/global/product/product_1684823634257687253fc3e0a9d76228ea118402bc.png62405b38c58fe0f07fcef2367d8a9ba1/400.png"
                                    alt="">
                            </div>
                            <div class="flex justify-center items-center my-3">

                            </div>
                            <div class="h-[1px] mx-20 bg-gray-200"></div>
                            <div class="flex justify-center items-center">
                                <button class="text-sm w-40 bg-red-700 text-white py-3 my-5">View Detail</button>
                            </div>
                            <div class="p-5 text-center">
                                <h4 class="font-bold text-lg my-2">Stealth 16 Mercedes-AMG Motorsport A13V</h4>
                                <p class="text-sm">Vi xử lý Intel Core Thế hệ 13 / card đồ họa GeForce RTX 40 series</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">

</script>

<style scoped></style>