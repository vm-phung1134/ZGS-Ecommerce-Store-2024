<template>
    <div :class="props.className">
        <h2 class="font-bold">Not a ZGS Member Yet?</h2>
        <p>Become ZGS member to follow latest promotions and support updates.</p>
        <button class="px-5 flex justify-between items-center py-3 w-60 rounded-sm bg-red-600 text-gray-100">
            <p>Create an account</p>
            <svg class="w-5" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" stroke="#ffffff">
                <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                <g id="SVGRepo_iconCarrier">
                    <path
                        d="M9.71069 18.2929C10.1012 18.6834 10.7344 18.6834 11.1249 18.2929L16.0123 13.4006C16.7927 12.6195 16.7924 11.3537 16.0117 10.5729L11.1213 5.68254C10.7308 5.29202 10.0976 5.29202 9.70708 5.68254C9.31655 6.07307 9.31655 6.70623 9.70708 7.09676L13.8927 11.2824C14.2833 11.6729 14.2833 12.3061 13.8927 12.6966L9.71069 16.8787C9.32016 17.2692 9.32016 17.9023 9.71069 18.2929Z"
                        fill="#fafafa"></path>
                </g>
            </svg>
        </button>
        <div>
            <h3 class="mb-2 font-bold">Membership benefits</h3>
            <ul class="text-sm list-disc ml-10 flex flex-col gap-1">
                <li>Warranty Registration</li>
                <li>Quicker service and product support</li>
                <li>Exclusive updates on promotions and events</li>
                <li>View your current registered MSI products</li>
            </ul>
        </div>
        <div class="w-full h-[1px] my-3 bg-gray-200"></div>
        <div class="flex flex-col gap-2">
            <h3 class="font-bold">
                Upgrade your member benefits by opt-in MSI Reward Program and enjoy more
                exclusive rewards!
            </h3>
            <p class="text-sm indent-5">
                MyMSI gives you front-row access to all things MSI. From App-Only content, quests, and rewards to
                requesting product support you can do it all from here!
            </p>
        </div>
    </div>
</template>

<script setup lang="ts">
    const props = defineProps({
        className: {
            type: String,
            required: true,
        }
    })
</script>

<style scoped></style>