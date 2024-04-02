import { ActionContext, ActionTree, MutationTree } from "vuex";
import { reactive } from "vue";
import api from "../../api";
import { CommentReq } from "../../interfaces/Comment";

export type commentState = {
  comments: Comment[];
  isCreated: boolean;
};

// auth state
const state: commentState = reactive({
  comments: [],
  isCreated: false,
});

// getters
const getters = {};

// actions
const actions: ActionTree<commentState, any> = {
  getAllComment(
    { commit }: ActionContext<commentState, any>,
    productId: number
  ) {
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
  createComment(
    { commit }: ActionContext<commentState, any>,
    comment: CommentReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .createComment(comment)
        .then((response) => {
          if (response.status == 200) {
            commit("createComment_success");
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
  createComment_success(state: commentState) {
    state.isCreated = true;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
