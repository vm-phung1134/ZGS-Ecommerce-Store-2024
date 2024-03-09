import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { AuthReq, AuthRes } from "interfaces/Auth";
import { UserReq } from "interfaces/User";

export type authState = {
  isAuthenticated: boolean;
  authRes: AuthRes | null;
  isRegister: boolean;
  isLogout: boolean;
};

// auth state
const state: authState = {
  isAuthenticated: false,
  authRes: null,
  isRegister: false,
  isLogout: false,
};

// getters
const getters = {
  isUserAuthenticated: () => {
    const token = localStorage.getItem("token");
    const auth = localStorage.getItem("auth");
    if (token && auth) {
      return true;
    }
    return false;
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
          if (response.status == 200) {
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
  register({ commit }: ActionContext<authState, any>, auth: UserReq) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with user: '" + auth.email);
      api
        .register(auth)
        .then((response) => {
          if (response.status == 200) {
            commit("register_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  logout({ commit }: ActionContext<authState, any>) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend");
      api
        .logout()
        .then((response) => {
          if (response.status == 200) {
            commit("logout_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  getInfoUser({ commit }: ActionContext<authState, any>, userId: number) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend");
      api
        .getOneUser(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getInfoUser_success");
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
    localStorage.setItem("auth", JSON.stringify(payload.data));
  },
  register_success(state: authState) {
    state.isRegister = true;
  },
  logout_success(state: authState) {
    state.isLogout = true;
    state.isAuthenticated = false;
    localStorage.removeItem("token");
    localStorage.removeItem("auth");
  },
  getInfoUser_success(state: authState) {
    state.isAuthenticated = false;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
