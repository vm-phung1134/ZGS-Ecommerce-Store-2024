<template>
    <div class="carousel relative w-full h-full">
        <!-- carousel items -->
        <div v-for="(slide, index) in slides" :key="index" :id="`${index + 1}`" class="carousel-item w-full h-full">
            <img :src="slide.image" class="w-full h-full" />
        </div>
        <!-- navigation buttons -->
        <div class="flex justify-between transform -translate-y-1/2 left-5 right-5 top-1/2 absolute">
            <button @click="clickPrevSlide" class="text-[4rem] text-green-100">❮</button>
            <button @click="clickNextSlide" class="text-[4rem] text-green-100">❯</button>
        </div>
        <!-- breadcrums -->
        <div class="absolute top-14 -left-5 bg-white rounded-none outline-none -skew-x-[35deg]">
            <div className="text-sm breadcrumbs px-10 skew-x-[30deg]">
                <ul class="uppercase">
                    <li><a>Home</a></li>
                    <li><a class="font-bold" href="">Store</a></li>
                </ul>
            </div>
        </div>
    </div>
</template>
  
<script setup lang="ts">

const slides = [
    {
        image: 'https://storage-asset.msi.com/global/picture/banner/banner_170445142354207818e5028f0c1f969f8e17c9fbac.jpeg',
    },
    {
        image: 'https://storage-asset.msi.com/global/picture/banner/banner_17060671188a63a155004390a4cf523feff7a6eca6.jpeg',
    },
    {
        image: 'https://storage-asset.msi.com/global/picture/banner/banner_1704425013843a4d42330d97624d785c0f6e5c085e.jpeg',
    },
];


const clickNextSlide = () => {

};

const clickPrevSlide = () => {

};
</script>
  
<style scoped></style>
  