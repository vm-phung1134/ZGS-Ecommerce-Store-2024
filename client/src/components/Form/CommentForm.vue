<template>
    <div>
        <form id="login.form" @submit="submitForm" method="post">
            <div class="grid grid-cols-12 gap-5 w-1/2">
                <div class="col-span-3">
                    <h4 class="text-white tracking-wider mb-2 text-sm">Reviews and rating</h4>
                    <RatingStar @update:get-rating="handleRatingStar" :rating-count="5" className="rating rating-sm" />
                </div>
                <div class="col-span-9">
                    <div class="flex text-sm tracking-wider items-end">
                        <input v-model="formData.message" type="text" placeholder="Enter your message"
                            class="placeholder:text-sm text-white px-3 py-2 focus:outline-none w-full bg-transparent border-b border-gray-600">
                        <button 
                            v-if="isUserAuthenticated"
                            type="submit"
                            class="px-10 py-2 bg-orange-600 text-white text-xs tracking-wider uppercase">
                            Send
                        </button>
                        <RouterLink v-else to="/sign-in">
                            <button type="submit"
                                class="px-10 py-2 bg-orange-600 text-white text-xs tracking-wider uppercase">
                                Send
                            </button>
                        </RouterLink>
                    </div>
                    <div class="w-full text-xs mt-2" v-show="errors.length > 0">
                        <span class="text-red-500">Ops! {{ errors }}</span>
                    </div>
                </div>
            </div>
        </form>
    </div>
</template>

<script setup lang="ts">
import { Ref, computed, inject, reactive, ref } from 'vue';
import RatingStar from '@components/Element/RatingStar.vue'
import { useStore } from 'vuex';
import { useRoute } from 'vue-router';

// DEFINE STORE
const store = useStore();
const route = useRoute();

const errors = ref('');
const formData = reactive({
    message: "",
    rating: 5
});
const isUserAuthenticated = inject<Ref<boolean>>('isUserAuthenticated');


// USE STORE
const infoUser = computed(() => store.getters['auth/getInforUser']);

const handleRatingStar = (newValue: number) => {
    formData.rating = newValue;
}

const submitForm = (event: Event) => {
    event.preventDefault();
    if (formData.message != "") {
        errors.value = "";
        store.dispatch("comment/changePasswordUser",
            {
                user: {
                    id: infoUser.value.id
                },
                product: {
                    id: Number(route.params.id)
                },
                message: formData.message,
                quantityStar: formData.rating
            }).then(() => {
                store.dispatch('comment/getAllComment')
            }).catch((error) => {
                console.log(error);
                errors.value = "Password is invalid";
            });
    }
    else {
        errors.value = "Message is required !";
    }

};
</script>

<style scoped></style>