import * as vR from "vue-router";
import AuthVue from "@pages/Auth.vue";
import HomepageVue from "@pages/Homepage.vue";
import ProductDetailVue from "@pages/ProductDetail.vue";
import ProductListVue from "@pages/ProductList.vue";
import checkoutVue from "@pages/checkout.vue";

const _routes: Array<vR.RouteRecordRaw> = [
  {
    path: "/",
    component: HomepageVue,
    name: "homepage.store",
  },
  {
    path: "/sign-in",
    component: AuthVue,
    name: "auth.login",
  },
  {
    path: "/product-list",
    component: ProductListVue,
    name: "product.list",
  },
  {
    path: "/checkout-order",
    component: checkoutVue,
    name: "checkout.order",
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
