<template>
    <div class="w-full">
        <button class="btn-style w-full">
            <span>{{ prop.value }}</span>
            <div class="top"></div>
            <div class="left"></div>
            <div class="bottom"></div>
            <div class="right"></div>
        </button>
    </div>
</template>

<script setup lang="ts">
const prop = defineProps({
    value: {
        type: String,
        required: true
    }
})
</script>

<style scoped>
.btn-style {
    padding: 20px 60px;
    background-color: #000;
    border: none;
    font-size: 18px;
    position: relative;
    /* overflow: hidden; */
    transition: 500ms;
}

.btn-style span {
    color: #ffffff;
    position: relative;
    transition: 500ms;
    transition-delay: 500ms;
    font-size: 16px;
    text-transform: uppercase;
    letter-spacing: 2px;
    font-weight: 600;
}

.btn-style:before {
    content: '';
    position: absolute;
    width: 0%;
    height: 0%;
    left: 50%;
    right: 50%;
    top: 50%;
    bottom: 50%;
    transition: 500ms;
    transition-delay: 500ms;
    background-color: #d70000;
    box-shadow: 0 0 10px #d70000,
        0 0 30px #d70000,
        0 0 50px #d70000;
}

.btn-style div {
    transition: 500ms;
    position: absolute;
    background-color: #d70000;
    box-shadow: 0 0 15px #d70000, 0 0 30px #d70000, 0 0 50px #d70000;
}

.btn-style .top {
    width: 15px;
    height: 2px;
    top: 0;
    left: 0;
}

.btn-style .bottom {
    width: 15px;
    height: 2px;
    bottom: 0;
    right: 0;
}

.btn-style .left {
    width: 2px;
    height: 15px;
    top: 0;
    left: 0;
}

.btn-style .right {
    width: 2px;
    height: 15px;
    bottom: 0;
    right: 0;
}

.btn-style:hover {
    color: #ffffff;
}

.btn-style:hover span {
    color: #ffffff;
}

.btn-style:hover:before {
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
}

.btn-style:hover .top,
.btn-style:hover .bottom {
    width: 100%;
}

.btn-style:hover .left,
.btn-style:hover .right {
    height: 100%;
}
</style>