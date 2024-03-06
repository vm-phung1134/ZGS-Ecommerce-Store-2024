import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { ShoppingCartRes, ShoppingCartReq } from "@/interfaces/ShoppingCart";

export type shoppingCartState = {
  userCart: ShoppingCartRes | null
};

// auth state
const state: shoppingCartState = {
  userCart: null,
};

// getters
const getters = {};

// actions
const actions: ActionTree<shoppingCartState, any> = {
  getUserCart({ commit }: ActionContext<shoppingCartState, any>, cart: ShoppingCartReq) {
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
};

// mutations
const mutations: MutationTree<shoppingCartState> = {
    addToCart_success(state: shoppingCartState, payload: any) {
    state.userCart = payload.data;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
