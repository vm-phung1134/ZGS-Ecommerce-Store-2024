import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { AuthReq, AuthRes } from "interfaces/Auth";

export type authState = {
  isAuthenticated: boolean;
  authRes: AuthRes | null;
};

// auth state
const state: authState = {
  isAuthenticated: false,
  authRes: null,
};

// getters
const getters = {
  token: (state: authState) => {
    return state.authRes?.token;
  },
};

// actions
const actions: ActionTree<authState, any> = {
  login({ commit }: ActionContext<authState, any>, auth: AuthReq) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with user: '" + auth.email);
      api
        .authenticated(auth)
        .then((response) => {
          if (response.status == 201) {
            commit("login_success", response.data);
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
const mutations: MutationTree<authState> = {
  login_success(state: authState, payload: any) {
    state.isAuthenticated = true;
    state.authRes = payload.data;
    localStorage.setItem("token", payload.data.token);
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
