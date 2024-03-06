import { createStore, createLogger } from "vuex";
import auth, { authState } from "./modules/auth";
import product, { productState } from "./modules/product";
import cart, { shoppingCartState } from "./modules/cart";

const debug = process.env.NODE_ENV !== "production";

type initialStateStore = {
  auth: authState;
  product: productState;
  cart: shoppingCartState;
};

export default createStore<initialStateStore>({
  modules: {
    auth,
    product,
    cart,
  },
  strict: debug,
  plugins: debug ? [createLogger()] : [],
});
