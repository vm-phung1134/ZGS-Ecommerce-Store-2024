import { ActionContext, ActionTree, MutationTree } from "vuex";
import { reactive } from "vue";
import api from "../../api";

export type commentState = {
  comments: Comment[];
};

// auth state
const state: commentState = reactive({
  comments: [],
});

// getters
const getters = {};

// actions
const actions: ActionTree<commentState, any> = {
  getAllComment({ commit }: ActionContext<commentState, any>, productId: number) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllComment(productId)
        .then((response) => {
          if (response.status == 200) {
            commit("getAllComment_success", response.data);
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
const mutations: MutationTree<commentState> = {
  getAllComment_success(state: commentState, payload: any) {
    state.comments = payload.data;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
