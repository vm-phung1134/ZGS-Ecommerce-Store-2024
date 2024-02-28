import * as vR from "vue-router";
import AuthVue from "@pages/Auth.vue";
import HomepageVue from "@pages/Homepage.vue";

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
];

const router = vR.createRouter({
  history: vR.createWebHistory(),
  routes: _routes,
});

export default router;
