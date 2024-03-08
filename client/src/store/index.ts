import { createStore, createLogger } from "vuex";
import auth, { authState } from "./modules/auth";
import product, { productState } from "./modules/product";
import cart, { shoppingCartState } from "./modules/cart";
import payment, { paymentState } from "./modules/payment";
import address, { addressState } from "./modules/address";

const debug = process.env.NODE_ENV !== "production";

type initialStateStore = {
  auth: authState;
  product: productState;
  cart: shoppingCartState;
  payment: paymentState;
  address: addressState
};

export default createStore<initialStateStore>({
  modules: {
    auth,
    product,
    cart,
    payment,
    address,
  },
  strict: debug,
  plugins: debug ? [createLogger()] : [],
});
