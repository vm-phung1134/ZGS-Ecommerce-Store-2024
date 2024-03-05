<template>
    <div class="relative bg-cover p-20 bg-[url('https://storage-asset.msi.com/global/picture/image/feature/monitor/MEG-342C-QD-OLED/gamingIntelligence-bg.jpg')] w-full h-full">
        <div class="absolute top-14 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
            <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                <ul class="uppercase">
                    <li><a>Home</a></li>
                    <li><a class="font-bold" href="">Latest Product</a></li>
                </ul>
            </div>
        </div>
        <h3 class="uppercase text-gray-100 text-[2.5rem] font-bold my-10">Discover the Latest MSI Innovations</h3>
        <div class="grid grid-cols-3 gap-5 cursor-pointer">
            <div v-for="product in productLists" :key="product.id" @click="handleDirection">
                <img class="hover:scale-95 hover:transform hover:duration-500 hover:ease-in" :src="product.img" alt="image-product-item">
                <div class="flex text-white my-5 flex-col justify-center items-center gap-2">
                    <p class="font-bold uppercase text-lg">{{ product.name }}</p>
                    <p>{{ product.description }}</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
    import { useRouter } from 'vue-router';

    const router = useRouter();

    const handleDirection = () => {
        router.push("/product-list/product-detail/1");
    }
    const productLists = [
        {
            id: "1",
            name: "Raider GE78 HX 13V",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_168126246157f5c054a0ec238caa0c26a84a494cc9.jpeg",
            description: "The First Choice for Professionals"
        },
        {
            id: "2",
            name: "MEG Z790 ACE MAX",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_16958670825c9deda34c2e529276e4a97d24159561.jpeg",
            description: "Lustrous Aesthetics, Pure Performance"
        },
        {
            id: "3",
            name: "GeForce RTX 4090 SUMPRIM X 24 G",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_16812627534194c7f3a6b45ee5f32edc4a98654139.jpeg",
            description: "Change The Game"
        },
        {
            id: "4",
            name: "Raider GE78 HX 13V",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_168126246157f5c054a0ec238caa0c26a84a494cc9.jpeg",
            description: "The First Choice for Professionals"
        },
        {
            id: "5",
            name: "MEG Z790 ACE MAX",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_16958670825c9deda34c2e529276e4a97d24159561.jpeg",
            description: "Lustrous Aesthetics, Pure Performance"
        },
        {
            id: "6",
            name: "GeForce RTX 4090 SUMPRIM X 24 G",
            img: "https://storage-asset.msi.com/global/picture/banner/banner_16812627534194c7f3a6b45ee5f32edc4a98654139.jpeg",
            description: "Change The Game"
        }
    ]
</script>

<style scoped>

</style>