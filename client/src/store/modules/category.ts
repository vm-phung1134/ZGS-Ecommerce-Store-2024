import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { Category } from "@/interfaces/Category";

export type categoryState = {
  categories: Category[];
};

// auth state
const state: categoryState = {
  categories: [],
};

// getters
const getters = {};

// actions
const actions: ActionTree<categoryState, any> = {
  getAllCategory({ commit }: ActionContext<categoryState, any>) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllCategory()
        .then((response) => {
          if (response.status == 200) {
            commit("getAllCategory_success", response.data);
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
const mutations: MutationTree<categoryState> = {
  getAllCategory_success(state: categoryState, payload: any) {
    state.categories = payload.data;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
