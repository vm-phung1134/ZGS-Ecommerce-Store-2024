<template>
    <div class="h-full mb-96">
        <div class="flex relative">
            <div class="absolute text-black top-5 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
                <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                    <ul class="uppercase">
                        <li><a>Home</a></li>
                        <li><a>Account</a></li>
                        <li><a class="font-bold" href="">Tracking your order</a></li>
                    </ul>
                </div>
            </div>
            <div class="w-7/12">
                <img class="w-full h-auto"
                    src="https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/model_detail/augmented-reality/revuelto/ar_revuelto.png"
                    alt="">
            </div>
            <div class="w-5/12 flex justify-center items-center px-10">
                <div>
                    <h4 class="uppercase font-bold text-4xl w-96">Fast delivery has just become Faster</h4>
                    <p class="text-justify my-5">Just before the 60th anniversary of the marque, Lamborghini unveiled
                        Revuelto, the first HPEV
                        (High Performance Electrified Vehicle) hybrid super sports car. With the Revuelto, Lamborghini
                        has established a new benchmark in performance, on-board technology, and driving pleasure. The
                        ultimate thrill provided by the Revuelto is reached thanks to a powertrain that delivers 1015 CV
                        total.
                    </p>
                    <div class="flex gap-5 items-center">
                        <button class="hexagon-shape w-fit bg-black">❯</button>
                        <p class="uppercase">View delivery policies</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- SEARCH REQUEST -->
        <div class="w-full flex justify-center">
            <div class="shadow-xl py-10 px-5 w-1/2">
                <h4 class="font-bold text-2xl my-5">Find you request</h4>
                <div class="flex h-10 w-full">
                    <input placeholder="Enter your order number..." type="text"
                        class=" outline-none bg-gray-200 py-1 px-3 text-sm h-full w-full">
                    <button class="bg-black text-sm py-2 w-40 text-white">Search order</button>
                </div>
            </div>
        </div>

        <!-- TRACKING PROGRESS -->

        <div class="w-full py-10 mt-5">
            <ul class="steps steps-vertical text-sm font-bold lg:steps-horizontal w-full">
                <li class="step step-success">Package <span class="font-normal text-red-600">( You here )</span></li>
                <li class="step step-success">Tranfer Moment</li>
                <li class="step">Delivery</li>
                <li class="step">Receive Product</li>
                <li class="step">Success</li>
            </ul>
        </div>

        <!-- TABLE ORDER -->
        <div class="overflow-x-auto mx-40 my-10">
            <h4 class="uppercase text-2xl font-bold ">Your orders</h4>
            <p class="text-sm font-bold uppercase text-gray-400 py-5">Order Id: #hk2420fm</p>
            <table class="table">
                <!-- head -->
                <thead class="bg-black text-white">
                    <tr>
                        <th>
                            <label>
                                <input type="checkbox" class="checkbox rounded-none checkbox-xs" />
                            </label>
                        </th>
                        <th>Name</th>
                        <th>Job</th>
                        <th>Favorite Color</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody class="bg-gray-100">
                    <!-- row 1 -->
                    <tr>
                        <th>
                            <label>
                                <input type="checkbox" class="rounded-none checkbox-xs" />
                            </label>
                        </th>
                        <td>
                            <div class="flex items-center gap-3">
                                <div class="avatar">
                                    <div class="mask mask-squircle w-12 h-12">
                                        <img src="https://daisyui.com/tailwind-css-component-profile-2@56w.png"
                                            alt="Avatar Tailwind CSS Component" />
                                    </div>
                                </div>
                                <div>
                                    <div class="font-bold">Hart Hagerty</div>
                                    <div class="text-sm opacity-50">United States</div>
                                </div>
                            </div>
                        </td>
                        <td>
                            Zemlak, Daniel and Leannon
                            <br />
                            <span class="badge badge-ghost badge-sm">Desktop Support Technician</span>
                        </td>
                        <td>Purple</td>
                        <th>
                            <button class="btn btn-ghost btn-xs">details</button>
                        </th>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script setup lang="ts">

</script>

<style scoped></style>