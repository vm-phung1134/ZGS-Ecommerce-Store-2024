import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { ShoppingCartRes, ShoppingCartReq } from "@/interfaces/ShoppingCart";
import { Product } from "../../interfaces/Product";
import { reactive } from "vue";

export type shoppingCartState = {
  userCart: ShoppingCartRes | null;
  isAddToCart: boolean;
  isDeleteItem: boolean;
};

// auth state
const state: shoppingCartState = reactive({
  userCart: null,
  isAddToCart: false,
  isDeleteItem: false,
});

// getters
const getters = {
  cartTotalPrice: (state: shoppingCartState) => {
    if (state.userCart && state.userCart.products) {
      return state.userCart.products.reduce(
        (total: number, product: Product) => {
          if (product.quantity) {
            return total + product.price * product.quantity;
          }
          return total;
        },
        0
      );
    }
    return 0;
  },
  getQuantityCart: (state: shoppingCartState) => {
    if (state.userCart && state.userCart.products) {
      return state.userCart.products.length;
    }
    return 0;
  },
};

// actions
const actions: ActionTree<shoppingCartState, any> = {
  getUserCart(
    { commit }: ActionContext<shoppingCartState, any>,
    userId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getUserCart(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getUserCart_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  addProductToCart(
    { commit }: ActionContext<shoppingCartState, any>,
    cart: ShoppingCartReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .addToCart(cart)
        .then((response) => {
          if (response.status == 200) {
            commit("addToCart_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  undoItemCart(
    { commit }: ActionContext<shoppingCartState, any>,
    params: {
      productId: number;
      userId: number;
    }
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .undoItemCart(params.productId, params.userId)
        .then((response) => {
          if (response.status == 200) {
            commit("undoItemCart_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  increaseProductQuantity(
    { commit }: ActionContext<shoppingCartState, any>,
    params: { productId: number; userId: number }
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend successfully");
      api
        .increaseProductQuantity(params.productId, params.userId)
        .then((response) => {
          if (response.status === 200) {
            commit("increaseProductQuantity_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  decreaseProductQuantity(
    { commit }: ActionContext<shoppingCartState, any>,
    params: { productId: number; userId: number }
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend successfully");
      api
        .decreaseProductQuantity(params.productId, params.userId)
        .then((response) => {
          if (response.status === 200) {
            commit("decreaseProductQuantity_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
};

// mutations
const mutations: MutationTree<shoppingCartState> = {
  addToCart_success(state: shoppingCartState) {
    state.isAddToCart = true;
  },
  getUserCart_success(state: shoppingCartState, payload: any) {
    state.userCart = payload.data;
  },
  undoItemCart_success(state: shoppingCartState) {
    state.isDeleteItem = true;
  },
  increaseProductQuantity_success(state: shoppingCartState, productId: number) {
    if (state.userCart && state.userCart.products) {
      const product = state.userCart.products.find((p) => p.id === productId);
      if (product?.quantity) {
        product.quantity++;
      }
    }
  },
  decreaseProductQuantity_success(state: shoppingCartState, productId: number) {
    if (state.userCart && state.userCart.products) {
      const product = state.userCart.products.find((p) => p.id === productId);
      if (product?.quantity && product.quantity > 1) {
        product.quantity--;
      }
    }
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
