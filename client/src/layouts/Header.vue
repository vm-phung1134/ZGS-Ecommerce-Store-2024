<template>
    <!-- component -->
    <nav class=" bg-white w-full border-b shadow-md flex relative justify-between items-center mx-auto px-8 h-20">
        <div class="inline-flex items-center gap-10">
            <div class="inline-flex">
                <a class="_o6689fn" href="/">
                    <div class="hidden md:block">
                        <svg width="102" height="32" fill="currentcolor" style="display: block">
                            <path
                                d="M29.24 22.68c-.16-.39-.31-.8-.47-1.15l-.74-1.67-.03-.03c-2.2-4.8-4.55-9.68-7.04-14.48l-.1-.2c-.25-.47-.5-.99-.76-1.47-.32-.57-.63-1.18-1.14-1.76a5.3 5.3 0 00-8.2 0c-.47.58-.82 1.19-1.14 1.76-.25.52-.5 1.03-.76 1.5l-.1.2c-2.45 4.8-4.84 9.68-7.04 14.48l-.06.06c-.22.52-.48 1.06-.73 1.64-.16.35-.32.73-.48 1.15a6.8 6.8 0 007.2 9.23 8.38 8.38 0 003.18-1.1c1.3-.73 2.55-1.79 3.95-3.32 1.4 1.53 2.68 2.59 3.95 3.33A8.38 8.38 0 0022.75 32a6.79 6.79 0 006.75-5.83 5.94 5.94 0 00-.26-3.5zm-14.36 1.66c-1.72-2.2-2.84-4.22-3.22-5.95a5.2 5.2 0 01-.1-1.96c.07-.51.26-.96.52-1.34.6-.87 1.65-1.41 2.8-1.41a3.3 3.3 0 012.8 1.4c.26.4.45.84.51 1.35.1.58.06 1.25-.1 1.96-.38 1.7-1.5 3.74-3.21 5.95zm12.74 1.48a4.76 4.76 0 01-2.9 3.75c-.76.32-1.6.41-2.42.32-.8-.1-1.6-.36-2.42-.84a15.64 15.64 0 01-3.63-3.1c2.1-2.6 3.37-4.97 3.85-7.08.23-1 .26-1.9.16-2.73a5.53 5.53 0 00-.86-2.2 5.36 5.36 0 00-4.49-2.28c-1.85 0-3.5.86-4.5 2.27a5.18 5.18 0 00-.85 2.21c-.13.84-.1 1.77.16 2.73.48 2.11 1.78 4.51 3.85 7.1a14.33 14.33 0 01-3.63 3.12c-.83.48-1.62.73-2.42.83a4.76 4.76 0 01-5.32-4.07c-.1-.8-.03-1.6.29-2.5.1-.32.25-.64.41-1.02.22-.52.48-1.06.73-1.6l.04-.07c2.16-4.77 4.52-9.64 6.97-14.41l.1-.2c.25-.48.5-.99.76-1.47.26-.51.54-1 .9-1.4a3.32 3.32 0 015.09 0c.35.4.64.89.9 1.4.25.48.5 1 .76 1.47l.1.2c2.44 4.77 4.8 9.64 7 14.41l.03.03c.26.52.48 1.1.73 1.6.16.39.32.7.42 1.03.19.9.29 1.7.19 2.5zM41.54 24.12a5.02 5.02 0 01-3.95-1.83 6.55 6.55 0 01-1.6-4.48 6.96 6.96 0 011.66-4.58 5.3 5.3 0 014.08-1.86 4.3 4.3 0 013.7 1.92l.1-1.57h2.92V23.8h-2.93l-.1-1.76a4.52 4.52 0 01-3.88 2.08zm.76-2.88c.58 0 1.09-.16 1.57-.45.44-.32.8-.74 1.08-1.25.25-.51.38-1.12.38-1.8a3.42 3.42 0 00-1.47-3.04 2.95 2.95 0 00-3.12 0c-.44.32-.8.74-1.08 1.25a4.01 4.01 0 00-.38 1.8 3.42 3.42 0 001.47 3.04c.47.29.98.45 1.55.45zM53.45 8.46c0 .35-.06.67-.22.93-.16.25-.38.48-.67.64-.29.16-.6.22-.92.22-.32 0-.64-.06-.93-.22a1.84 1.84 0 01-.67-.64 1.82 1.82 0 01-.22-.93c0-.36.07-.68.22-.93.16-.3.39-.48.67-.64.29-.16.6-.23.93-.23a1.84 1.84 0 011.6.86 2 2 0 01.21.94zm-3.4 15.3V11.7h3.18v12.08h-3.19zm11.68-8.9v.04c-.15-.07-.35-.1-.5-.13-.2-.04-.36-.04-.55-.04-.89 0-1.56.26-2 .8-.48.55-.7 1.32-.7 2.31v5.93h-3.19V11.69h2.93l.1 1.83c.32-.64.7-1.12 1.24-1.48a3.1 3.1 0 011.81-.5c.23 0 .45.02.64.06.1.03.16.03.22.06v3.2zm1.28 8.9V6.74h3.18v6.5c.45-.58.96-1.03 1.6-1.38a5.02 5.02 0 016.08 1.31 6.55 6.55 0 011.6 4.49 6.96 6.96 0 01-1.66 4.58 5.3 5.3 0 01-4.08 1.86 4.3 4.3 0 01-3.7-1.92l-.1 1.57-2.92.03zm6.15-2.52c.57 0 1.08-.16 1.56-.45.44-.32.8-.74 1.08-1.25.26-.51.38-1.12.38-1.8 0-.67-.12-1.28-.38-1.79a3.75 3.75 0 00-1.08-1.25 2.95 2.95 0 00-3.12 0c-.45.32-.8.74-1.09 1.25a4.01 4.01 0 00-.38 1.8 3.42 3.42 0 001.47 3.04c.47.29.98.45 1.56.45zm7.51 2.53V11.69h2.93l.1 1.57a3.96 3.96 0 013.54-1.89 4.1 4.1 0 013.82 2.44c.35.76.54 1.7.54 2.75v7.24h-3.19v-6.82c0-.84-.19-1.5-.57-1.99-.38-.48-.9-.74-1.56-.74-.48 0-.9.1-1.27.32-.35.23-.64.52-.86.93a2.7 2.7 0 00-.32 1.35v6.92h-3.16zm12.52 0V6.73h3.19v6.5a4.67 4.67 0 013.73-1.89 5.02 5.02 0 013.95 1.83 6.57 6.57 0 011.59 4.48 6.95 6.95 0 01-1.66 4.58 5.3 5.3 0 01-4.08 1.86 4.3 4.3 0 01-3.7-1.92l-.09 1.57-2.93.03zm6.18-2.53c.58 0 1.09-.16 1.56-.45.45-.32.8-.74 1.09-1.25.25-.51.38-1.12.38-1.8a3.42 3.42 0 00-1.47-3.04 2.95 2.95 0 00-3.12 0c-.44.32-.8.74-1.08 1.25a3.63 3.63 0 00-.38 1.8 3.42 3.42 0 001.47 3.04c.47.29.95.45 1.55.45z">
                            </path>
                        </svg>
                    </div>
                    <div class="block md:hidden">
                        <svg width="30" height="32" fill="currentcolor" style="display: block">
                            <path
                                d="M29.24 22.68c-.16-.39-.31-.8-.47-1.15l-.74-1.67-.03-.03c-2.2-4.8-4.55-9.68-7.04-14.48l-.1-.2c-.25-.47-.5-.99-.76-1.47-.32-.57-.63-1.18-1.14-1.76a5.3 5.3 0 00-8.2 0c-.47.58-.82 1.19-1.14 1.76-.25.52-.5 1.03-.76 1.5l-.1.2c-2.45 4.8-4.84 9.68-7.04 14.48l-.06.06c-.22.52-.48 1.06-.73 1.64-.16.35-.32.73-.48 1.15a6.8 6.8 0 007.2 9.23 8.38 8.38 0 003.18-1.1c1.3-.73 2.55-1.79 3.95-3.32 1.4 1.53 2.68 2.59 3.95 3.33A8.38 8.38 0 0022.75 32a6.79 6.79 0 006.75-5.83 5.94 5.94 0 00-.26-3.5zm-14.36 1.66c-1.72-2.2-2.84-4.22-3.22-5.95a5.2 5.2 0 01-.1-1.96c.07-.51.26-.96.52-1.34.6-.87 1.65-1.41 2.8-1.41a3.3 3.3 0 012.8 1.4c.26.4.45.84.51 1.35.1.58.06 1.25-.1 1.96-.38 1.7-1.5 3.74-3.21 5.95zm12.74 1.48a4.76 4.76 0 01-2.9 3.75c-.76.32-1.6.41-2.42.32-.8-.1-1.6-.36-2.42-.84a15.64 15.64 0 01-3.63-3.1c2.1-2.6 3.37-4.97 3.85-7.08.23-1 .26-1.9.16-2.73a5.53 5.53 0 00-.86-2.2 5.36 5.36 0 00-4.49-2.28c-1.85 0-3.5.86-4.5 2.27a5.18 5.18 0 00-.85 2.21c-.13.84-.1 1.77.16 2.73.48 2.11 1.78 4.51 3.85 7.1a14.33 14.33 0 01-3.63 3.12c-.83.48-1.62.73-2.42.83a4.76 4.76 0 01-5.32-4.07c-.1-.8-.03-1.6.29-2.5.1-.32.25-.64.41-1.02.22-.52.48-1.06.73-1.6l.04-.07c2.16-4.77 4.52-9.64 6.97-14.41l.1-.2c.25-.48.5-.99.76-1.47.26-.51.54-1 .9-1.4a3.32 3.32 0 015.09 0c.35.4.64.89.9 1.4.25.48.5 1 .76 1.47l.1.2c2.44 4.77 4.8 9.64 7 14.41l.03.03c.26.52.48 1.1.73 1.6.16.39.32.7.42 1.03.19.9.29 1.7.19 2.5z">
                            </path>
                        </svg>
                    </div>
                </a>
            </div>

            <div class="hidden sm:block flex-shrink flex-grow-0 justify-start px-2">
                <div class="inline-block">
                    <div class="inline-flex items-center max-w-full">
                        <ul class="flex gap-5 cursor-pointer uppercase">
                            <RouterLink to="/">
                                <li>Store</li>
                            </RouterLink>
                            <RouterLink to="/product-list">
                                <li>Gaming world</li>
                            </RouterLink>
                            <li>Collaborations</li>
                            <li>New in </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>


        <!-- login -->
        <div class="flex-initial">
            <div class="flex justify-end items-center relative">
                <div class="hidden sm:block flex-shrink flex-grow-0 justify-start px-5">
                    <div class="inline-block">
                        <div class="inline-flex items-center max-w-full">
                            <ul class="flex gap-5 cursor-pointer uppercase">
                                <li>dealerships</li>
                                <li>contact</li>
                                <li>support</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="flex items-center">
                    <div class="block relative">
                        <div class="drawer drawer-end">
                            <input id="my-drawer-4" type="checkbox" class="drawer-toggle" />
                            <div class="drawer-content">
                                <label for="my-drawer-4" class="drawer-button cursor-pointer">
                                    <span type="button"
                                        class="inline-block p-2 hover:bg-gray-200 rounded-full relative ">
                                        <div class="flex items-center">
                                            <svg class="w-7 h-7" viewBox="0 0 24 24" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                                                <g id="SVGRepo_tracerCarrier" stroke-linecap="round"
                                                    stroke-linejoin="round"></g>
                                                <g id="SVGRepo_iconCarrier">
                                                    <path
                                                        d="M16.39 15.56H12.2C12.0011 15.56 11.8103 15.481 11.6697 15.3403C11.529 15.1997 11.45 15.0089 11.45 14.81C11.45 14.6111 11.529 14.4203 11.6697 14.2797C11.8103 14.139 12.0011 14.06 12.2 14.06H16.39C16.5889 14.06 16.7797 14.139 16.9203 14.2797C17.061 14.4203 17.14 14.6111 17.14 14.81C17.14 15.0089 17.061 15.1997 16.9203 15.3403C16.7797 15.481 16.5889 15.56 16.39 15.56Z"
                                                        fill="#000000"></path>
                                                    <path
                                                        d="M19.21 15.23C19.1179 15.2279 19.0267 15.211 18.94 15.18C18.8444 15.1448 18.757 15.0905 18.6831 15.0205C18.6092 14.9504 18.5503 14.866 18.51 14.7724C18.4698 14.6789 18.4491 14.5781 18.4491 14.4762C18.449 14.3744 18.4698 14.2736 18.51 14.18L20.89 7.85C20.9171 7.74917 20.9649 7.65511 21.0304 7.57382C21.0959 7.49253 21.1776 7.42581 21.2704 7.37792C21.3631 7.33004 21.4649 7.30205 21.5691 7.29575C21.6733 7.28944 21.7777 7.30496 21.8755 7.34131C21.9734 7.37766 22.0626 7.43404 22.1374 7.50684C22.2122 7.57964 22.271 7.66725 22.31 7.76408C22.349 7.86091 22.3674 7.96482 22.364 8.06915C22.3605 8.17349 22.3353 8.27596 22.29 8.37L19.91 14.71C19.8621 14.8588 19.7688 14.989 19.6433 15.0822C19.5178 15.1754 19.3663 15.2271 19.21 15.23Z"
                                                        fill="#000000"></path>
                                                    <path
                                                        d="M9 15.44C8.84319 15.4399 8.69037 15.3906 8.56301 15.2991C8.43566 15.2077 8.34018 15.0786 8.29 14.93L5.21 5.56H2.41C2.21109 5.56 2.02032 5.48098 1.87967 5.34033C1.73902 5.19968 1.66 5.00891 1.66 4.81C1.66 4.61109 1.73902 4.42032 1.87967 4.27967C2.02032 4.13902 2.21109 4.06 2.41 4.06H5.75C5.90804 4.06081 6.06178 4.11153 6.18929 4.20492C6.31679 4.2983 6.41154 4.42957 6.46 4.58L9.75 14.45C9.78937 14.5461 9.80834 14.6494 9.80571 14.7532C9.80308 14.8571 9.77891 14.9593 9.73472 15.0533C9.69053 15.1473 9.6273 15.2311 9.54902 15.2994C9.47075 15.3677 9.37914 15.419 9.28 15.45C9.187 15.4664 9.09159 15.463 9 15.44Z"
                                                        fill="#000000"></path>
                                                    <path
                                                        d="M10.54 19.94C9.89721 19.94 9.26886 19.7494 8.7344 19.3923C8.19994 19.0352 7.78337 18.5276 7.53739 17.9337C7.29141 17.3399 7.22704 16.6864 7.35245 16.056C7.47785 15.4255 7.78738 14.8464 8.2419 14.3919C8.69642 13.9374 9.27552 13.6279 9.90595 13.5024C10.5364 13.377 11.1899 13.4414 11.7837 13.6874C12.3776 13.9334 12.8852 14.3499 13.2423 14.8844C13.5994 15.4189 13.79 16.0472 13.79 16.69C13.7874 17.5511 13.4441 18.3763 12.8352 18.9852C12.2263 19.5941 11.4011 19.9374 10.54 19.94ZM10.54 14.94C10.1939 14.94 9.85554 15.0426 9.56775 15.2349C9.27996 15.4272 9.05566 15.7005 8.92321 16.0203C8.79076 16.3401 8.7561 16.6919 8.82362 17.0314C8.89115 17.3709 9.05782 17.6827 9.30256 17.9274C9.5473 18.1722 9.85912 18.3389 10.1986 18.4064C10.5381 18.4739 10.8899 18.4392 11.2097 18.3068C11.5295 18.1743 11.8028 17.95 11.9951 17.6622C12.1874 17.3745 12.29 17.0361 12.29 16.69C12.29 16.2259 12.1056 15.7808 11.7774 15.4526C11.4492 15.1244 11.0041 14.94 10.54 14.94Z"
                                                        fill="#000000"></path>
                                                    <path
                                                        d="M18.05 19.94C17.4072 19.94 16.7789 19.7494 16.2444 19.3923C15.7099 19.0352 15.2934 18.5276 15.0474 17.9337C14.8014 17.3399 14.737 16.6864 14.8624 16.056C14.9879 15.4255 15.2974 14.8464 15.7519 14.3919C16.2064 13.9374 16.7855 13.6279 17.416 13.5024C18.0464 13.377 18.6999 13.4414 19.2937 13.6874C19.8876 13.9334 20.3952 14.3499 20.7523 14.8844C21.1094 15.4189 21.3 16.0472 21.3 16.69C21.2974 17.5511 20.9541 18.3763 20.3452 18.9852C19.7363 19.5941 18.9111 19.9374 18.05 19.94ZM18.05 14.94C17.7039 14.94 17.3655 15.0426 17.0778 15.2349C16.79 15.4272 16.5657 15.7005 16.4332 16.0203C16.3008 16.3401 16.2661 16.6919 16.3336 17.0314C16.4012 17.3709 16.5678 17.6827 16.8126 17.9274C17.0573 18.1722 17.3691 18.3389 17.7086 18.4064C18.0481 18.4739 18.3999 18.4392 18.7197 18.3068C19.0395 18.1743 19.3128 17.95 19.5051 17.6622C19.6974 17.3745 19.8 17.0361 19.8 16.69C19.8 16.2259 19.6156 15.7808 19.2874 15.4526C18.9592 15.1244 18.5141 14.94 18.05 14.94Z"
                                                        fill="#000000"></path>
                                                </g>
                                            </svg>
                                        </div>
                                    </span>
                                </label>
                            </div>
                            <span v-if="isUserAuthenticated"
                                class="absolute top-0 font-bold text-sm cursor-pointer right-0 text-red-700">{{
                                subQuantityProductCart
                            }}</span>
                            <div class="drawer-side z-10">
                                <ul class="menu p-4 w-full min-h-full bg-white text-base-content">
                                    <div class="flex justify-between mx-10 my-5">
                                        <div>
                                            <h3 class="font-bold text-4xl uppercase">Your Shopping Cart</h3>
                                            <button class="text-green-600 uppercase my-1">Countinue Shopping</button>
                                        </div>
                                        <label class="cursor-pointer" for="my-drawer-4" aria-label="close sidebar">
                                            <span class="flex gap-3 items-center">
                                                <span class="text-lg uppercase">Close Cart</span>
                                                <svg class="w-8" xmlns="http://www.w3.org/2000/svg" fill="#000000"
                                                    viewBox="0 0 24 24">
                                                    <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                                                    <g id="SVGRepo_tracerCarrier" stroke-linecap="round"
                                                        stroke-linejoin="round"></g>
                                                    <g id="SVGRepo_iconCarrier">
                                                        <path
                                                            d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z">
                                                        </path>
                                                    </g>
                                                </svg>
                                            </span>
                                        </label>
                                    </div>
                                    <ShoppingCart />
                                </ul>
                            </div>
                        </div>

                    </div>
                </div>

                <div class="flex items-center">
                    <div class="block relative">
                        <button @click="toggleSearchBar" type="button"
                            class="inline-block p-2 hover:bg-gray-200 rounded-full relative">
                            <div class="flex items-center">
                                <svg class="w-7 h-7" viewBox="0 -0.5 25 25" fill="none"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                                    <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                                    <g id="SVGRepo_iconCarrier">
                                        <path fill-rule="evenodd" clip-rule="evenodd"
                                            d="M7.30524 15.7137C6.4404 14.8306 5.85381 13.7131 5.61824 12.4997C5.38072 11.2829 5.50269 10.0233 5.96924 8.87469C6.43181 7.73253 7.22153 6.75251 8.23924 6.05769C10.3041 4.64744 13.0224 4.64744 15.0872 6.05769C16.105 6.75251 16.8947 7.73253 17.3572 8.87469C17.8238 10.0233 17.9458 11.2829 17.7082 12.4997C17.4727 13.7131 16.8861 14.8306 16.0212 15.7137C14.8759 16.889 13.3044 17.5519 11.6632 17.5519C10.0221 17.5519 8.45059 16.889 7.30524 15.7137V15.7137Z"
                                            stroke="#000000" stroke-width="1.5" stroke-linecap="round"
                                            stroke-linejoin="round"></path>
                                        <path
                                            d="M11.6702 7.20292C11.2583 7.24656 10.9598 7.61586 11.0034 8.02777C11.0471 8.43968 11.4164 8.73821 11.8283 8.69457L11.6702 7.20292ZM13.5216 9.69213C13.6831 10.0736 14.1232 10.2519 14.5047 10.0904C14.8861 9.92892 15.0644 9.4888 14.9029 9.10736L13.5216 9.69213ZM16.6421 15.0869C16.349 14.7943 15.8741 14.7947 15.5815 15.0879C15.2888 15.381 15.2893 15.8559 15.5824 16.1485L16.6421 15.0869ZM18.9704 19.5305C19.2636 19.8232 19.7384 19.8228 20.0311 19.5296C20.3237 19.2364 20.3233 18.7616 20.0301 18.4689L18.9704 19.5305ZM11.8283 8.69457C12.5508 8.61801 13.2384 9.02306 13.5216 9.69213L14.9029 9.10736C14.3622 7.83005 13.0496 7.05676 11.6702 7.20292L11.8283 8.69457ZM15.5824 16.1485L18.9704 19.5305L20.0301 18.4689L16.6421 15.0869L15.5824 16.1485Z"
                                            fill="#000000"></path>
                                    </g>
                                </svg>
                            </div>
                        </button>
                    </div>
                </div>

                <div class="block ml-2">
                    <div class="inline relative">
                        <button v-if="!isUserAuthenticated" @click="handleDirection"
                            class="bg-red-600 py-3 px-6 text-sm tracking-wider text-white">Sign In</button>
                        <div v-else className="dropdown dropdown-end">
                            <button type="button" tabIndex={0} role="button"
                                class="inline-flex items-center relative px-2 border rounded-full hover:shadow-lg">
                                <div class="pl-1">
                                    <svg viewBox="0 0 32 32" xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
                                        role="presentation" focusable="false"
                                        style="display: block; fill: none; height: 16px; width: 16px; stroke: currentcolor; stroke-width: 3; overflow: visible;">
                                        <g fill="none" fill-rule="nonzero">
                                            <path d="m2 16h28"></path>
                                            <path d="m2 24h28"></path>
                                            <path d="m2 8h28"></path>
                                        </g>
                                    </svg>
                                </div>

                                <div class="block flex-grow-0 flex-shrink-0 h-10 w-12 pl-5">
                                    <svg viewBox="0 0 32 32" xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
                                        role="presentation" focusable="false"
                                        style="display: block; height: 100%; width: 100%; fill: currentcolor;">
                                        <path
                                            d="m16 .7c-8.437 0-15.3 6.863-15.3 15.3s6.863 15.3 15.3 15.3 15.3-6.863 15.3-15.3-6.863-15.3-15.3-15.3zm0 28c-4.021 0-7.605-1.884-9.933-4.81a12.425 12.425 0 0 1 6.451-4.4 6.507 6.507 0 0 1 -3.018-5.49c0-3.584 2.916-6.5 6.5-6.5s6.5 2.916 6.5 6.5a6.513 6.513 0 0 1 -3.019 5.491 12.42 12.42 0 0 1 6.452 4.4c-2.328 2.925-5.912 4.809-9.933 4.809z">
                                        </path>
                                    </svg>
                                </div>
                            </button>
                            <ul tabIndex={0}
                                className="dropdown-content z-[1] menu p-2 shadow bg-base-100 rounded-box w-52">
                                <RouterLink :to="{ name: 'profile.user', params: { id: infoUser.id } }">
                                    <li><a>Account</a></li>
                                </RouterLink>
                                <RouterLink :to="{ name: 'order.tracking', params: { id: infoUser.id } }">
                                    <li><a>Track your orders</a></li>
                                </RouterLink>
                                <li><a>Feedback</a></li>
                                <li><button>Settings</button></li>

                                <li @click="handleLogout()" class="text-red-600"><button>Log out</button></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <SearchScreen :toggleSearchBar="toggleSearchBar" :isOpenSearchBar="isOpenSearchBar" />

    </nav>
</template>

<script setup lang="ts">
import { ComputedRef, Ref, computed, inject, ref } from 'vue';
import SearchScreen from '../pages/SearchScreen.vue';
import { useRouter } from 'vue-router';
import ShoppingCart from '@pages/ShoppingCart.vue';
import { useStore } from 'vuex';
import { RouterLink } from 'vue-router';

// DEFINE STORE
const store = useStore();
const router = useRouter();

// USE STORE
const isLogout: ComputedRef<boolean> = computed(() => store.state.auth.isLogout);
const subQuantityProductCart = computed(() => store.getters['cart/getQuantityCart']);
const infoUser = computed(() => store.getters['auth/getInforUser']);

// DEFINE CONSTANT
const isOpenSearchBar = ref(false);
const isUserAuthenticated = inject<Ref<boolean>>('isUserAuthenticated');
const toggleAuthentication = inject<() => boolean>('toggleAuthentication');

// EVENTS
const emit = defineEmits(['update:isUserAuthenticated']);

// METHODS
const toggleSearchBar = () => isOpenSearchBar.value = !isOpenSearchBar.value;

const handleLogout = () => {
    store.dispatch('auth/logout').then(() => {
        toggleAuthentication?.();
    }).catch((error) => {
        console.log(error);
    });
    if (isLogout) {
        router.push("/sign-in");
    }
}

const handleDirection = () => {
    router.push("/sign-in");
}
</script>

<style scoped></style>