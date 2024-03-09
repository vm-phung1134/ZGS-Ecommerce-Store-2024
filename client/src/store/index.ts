import { createStore, createLogger } from "vuex";
import auth, { authState } from "./modules/auth";
import product, { productState } from "./modules/product";
import cart, { shoppingCartState } from "./modules/cart";
import payment, { paymentState } from "./modules/payment";
import address, { addressState } from "./modules/address";
import order, { orderState } from "./modules/order";
import category, { categoryState } from "./modules/category";

const debug = process.env.NODE_ENV !== "production";

type initialStateStore = {
  auth: authState;
  product: productState;
  cart: shoppingCartState;
  payment: paymentState;
  address: addressState;
  order: orderState;
  category: categoryState;
};

export default createStore<initialStateStore>({
  modules: {
    auth,
    product,
    cart,
    payment,
    address,
    order,
    category,
  },
  strict: debug,
  plugins: debug ? [createLogger()] : [],
});
