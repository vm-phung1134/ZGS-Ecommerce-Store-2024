import { createApp } from "vue";
import "./style.css";
import App from "./App.vue";
import router from "./routes";
import store from "./store";
import ToastPlugin from 'vue-toast-notification';

createApp(App).use(router).use(store).use(ToastPlugin).mount("#app");
