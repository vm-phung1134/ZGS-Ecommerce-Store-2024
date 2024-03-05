import * as vR from "vue-router";
import AuthVue from "@pages/Auth.vue";
import HomepageVue from "@pages/Homepage.vue";
import ProductDetailVue from "@pages/ProductDetail.vue";

const _routes: Array<vR.RouteRecordRaw> = [
  {
    path: "/sign-in",
    component: AuthVue,
    name: "auth.login",
  },
  {
    path: "/",
    component: HomepageVue,
    name: "homepage.store",
  },
  {
    path: "/product-list/product-detail/1",
    component: ProductDetailVue,
    name: "product.detail",
  },

];

const router = vR.createRouter({
  history: vR.createWebHistory(),
  routes: _routes,
});

export default router;
