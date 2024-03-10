<template>
    <div class="h-full mb-72">
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
                    <button class="bg-black text-sm py-2 w-40 text-white uppercase">Search order</button>
                </div>
            </div>
        </div>

        <!-- TRACKING PROGRESS -->

        <div class="w-full py-10 mt-5">
            <ul class="steps steps-vertical text-sm font-bold lg:steps-horizontal w-full">
                <li class="step step-success">Package <span class="font-normal text-red-600">( You here )</span></li>
                <li class="step step-success">Tranfer Moment</li>
                <li class="step step-success">Delivery</li>
                <li class="step">Receive Product</li>
                <li class="step">Success</li>
            </ul>
        </div>

        <!-- TABLE ORDER -->
        <div class="overflow-x-auto mx-40 my-10 min-h-96 max-h-fit">
            <h4 class="uppercase text-2xl font-bold ">Your orders</h4>
            <p class="text-sm font-bold uppercase text-gray-400 py-5">Order Id: #hk2420fm</p>
            <table v-if="orders.length > 0" class="table">
                <!-- head -->
                <thead class="bg-black text-white">
                    <tr>
                        <th>
                            No.
                        </th>
                        <th>Product</th>
                        <th>Address</th>
                        <th>Payment</th>
                        <th>Date</th>
                        <th>Subtotal</th>
                        <th>Progress</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody class="bg-gray-100">
                    <!-- row 1 -->
                    <tr v-for="(order, index) in orders">
                        <th>
                            <div>{{ index }}</div>
                        </th>
                        <td>
                            <div class="flex items-center gap-3">
                                <div class="pr-3">
                                    <div class="w-32">
                                        <img :src=order?.product?.image alt="Avatar Tailwind CSS Component" />
                                    </div>
                                </div>
                                <div>
                                    <div class="font-bold">{{ order?.product?.name }}</div>
                                    <div class="text-sm opacity-50">{{ order?.product?.category?.name }} - ( Quantity
                                        x{{ order?.product?.quantity || 1 }})</div>
                                </div>
                            </div>
                        </td>
                        <td class="capitalize">
                            {{ order?.userAddress?.city }} - {{ order?.userAddress?.country }}
                            <br />
                            <span class="badge badge-ghost badge-sm truncate min-w-20 max-w-32">{{
                order?.userAddress?.address }}</span>
                        </td>
                        <td class="capitalize">{{ order?.userPayment?.paymentType }}</td>
                        <td>{{ order?.dateOrder }}</td>
                        <td>{{ order?.subTotal }}</td>
                        <td>{{ order?.active ? 'Revieced' : 'Delivery...' }}</td>
                        <th>
                            <button class="btn btn-ghost btn-xs text-green-700">details</button>
                        </th>
                    </tr>
                </tbody>
            </table>
            <div v-else class="p-5">
                <EmptySpace />
            </div>
        </div>

        <!-- HISTORY ORDER -->
        <div class="overflow-x-auto mx-40 my-10 min-h-96 max-h-fit">
            <h4 class="uppercase text-2xl font-bold ">Your history orders</h4>
            <p class="text-sm font-bold uppercase text-gray-400 py-5">Order Id: #hk2420fm</p>
            <table v-if="oldOrders.length > 0" class="table w-full">
                <!-- head -->
                <thead class="bg-black text-white">
                    <tr>
                        <th>
                            No.
                        </th>
                        <th>Product</th>
                        <th>Address</th>
                        <th>Payment</th>
                        <th>Date</th>
                        <th>Subtotal</th>
                        <th>Progress</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody class="bg-gray-100">
                    <!-- row 1 -->
                    <tr v-for="(order, index) in oldOrders">
                        <th>
                            <div>{{ index }}</div>
                        </th>
                        <td>
                            <div class="flex items-center gap-3">
                                <div class="pr-3">
                                    <div class="w-32">
                                        <img :src=order?.product?.image alt="Avatar Tailwind CSS Component" />
                                    </div>
                                </div>
                                <div>
                                    <div class="font-bold">{{ order?.product?.name }}</div>
                                    <div class="text-sm opacity-50">{{ order?.product?.category?.name }} - ( Quantity
                                        x{{ order?.product?.quantity || 1 }})</div>
                                </div>
                            </div>
                        </td>
                        <td class="capitalize">
                            {{ order?.userAddress?.city }} - {{ order?.userAddress?.country }}
                            <br />
                            <span class="badge badge-ghost badge-sm truncate min-w-20 max-w-32">{{
                order?.userAddress?.address }}</span>
                        </td>
                        <td class="capitalize">{{ order?.userPayment?.paymentType }}</td>
                        <td>{{ order?.dateOrder }}</td>
                        <td>{{ order?.subTotal }}</td>
                        <td>{{ order?.active ? 'Revieced' : 'Delivery...' }}</td>
                        <th>
                            <button class="btn btn-ghost btn-xs text-green-700">Re-order</button>
                        </th>
                    </tr>
                </tbody>
            </table>
            <div v-else class="p-40">
                <EmptySpace />
            </div>
        </div>

    </div>
</template>

<script setup lang="ts">
import EmptySpace from '@components/Element/EmptySpace.vue';
import { OrderRes } from '@/interfaces/Order';
import { ComputedRef, computed, onMounted } from 'vue';
import { useStore } from 'vuex';
import { useRoute } from 'vue-router';

// LIFE CYCLE
onMounted(() => {
  window.scrollTo(0, 0);
});

// DEFINE STORE
const store = useStore();
const route = useRoute();

// ACTION STORE
store.dispatch('order/getAllUserOrder', route.params.id);

// USE STORE
const orders: ComputedRef<OrderRes[]> = computed(() => store.state.order.orders);
const oldOrders: ComputedRef<OrderRes[]> = computed(() => store.state.order.oldOrders);


</script>

<style scoped></style>