import { createStore, createLogger } from "vuex";
import auth, { authState } from "./modules/auth";
import product, { productState } from "./modules/product";
import cart, { shoppingCartState } from "./modules/cart";
import payment, { paymentState } from "./modules/payment";

const debug = process.env.NODE_ENV !== "production";

type initialStateStore = {
  auth: authState;
  product: productState;
  cart: shoppingCartState;
  payment: paymentState;
};

export default createStore<initialStateStore>({
  modules: {
    auth,
    product,
    cart,
    payment,
  },
  strict: debug,
  plugins: debug ? [createLogger()] : [],
});
