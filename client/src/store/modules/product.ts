import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { Product } from "../../interfaces/Product";

export type productState = {
  products: Product[],
  product: Product | null,
};

// auth state
const state: productState = {
  products: [],
  product: null
};

// getters
const getters = {};

// actions
const actions: ActionTree<productState, any> = {
  getAllProducts({ commit }: ActionContext<productState, any>) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllProducts()
        .then((response) => {
          if (response.status == 200) {
            commit("getAll_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  getOneProduct({ commit }: ActionContext<productState, any>, productId: string) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getOneProduct(productId)
        .then((response) => {
          if (response.status == 200) {
            commit("getOne_success", response.data);
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
const mutations: MutationTree<productState> = {
  getAll_success(state: productState, payload: any) {
    state.products = payload.data
  },
  getOne_success(state: productState, payload) {
    state.product = payload.data
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
