import * as vR from "vue-router";
import AuthVue from "@pages/Auth.vue";
import HomepageVue from "@pages/Homepage.vue";
import ProductDetailVue from "@pages/ProductDetail.vue";
import ProductListVue from "@pages/ProductList.vue";
import checkoutVue from "@pages/Checkout.vue";
import OrderSuccessVue from "@pages/OrderSuccess.vue";
import Profile from "@pages/Profile.vue";
import TrackingOrder from "@pages/TrackingOrder.vue";

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
    path: "/profile-user",
    component: Profile,
    name: "profile.user",
  },
  {
    path: "/product-list",
    component: ProductListVue,
    name: "product.list",
  },
  {
    path: "/checkout-order/:id",
    component: checkoutVue,
    name: "checkout.order",
  },
  {
    path: "/product-list/product-detail/:id",
    component: ProductDetailVue,
    name: "product.detail",
  },
  {
    path: "/payment-success",
    component: OrderSuccessVue,
    name: "order.success"
  },
  {
    path: "/track-your-order/:id",
    component: TrackingOrder,
    name: "order.tracking"
  }

];

const router = vR.createRouter({
  history: vR.createWebHistory(),
  routes: _routes,
});

export default router;
