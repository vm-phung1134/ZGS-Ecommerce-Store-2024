import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { OrderRes, OrderReq } from "../../interfaces/Order";

export type orderState = {
  orders: OrderRes[];
  oldOrders: OrderRes[];
  isCreateOrder: boolean;
  isCancelOrder: boolean;
};

// auth state
const state: orderState = {
  orders: [],
  oldOrders: [],
  isCreateOrder: false,
  isCancelOrder: false,
};

// getters
const getters = {};

// actions
const actions: ActionTree<orderState, any> = {
  getAllUserOrder({ commit }: ActionContext<orderState, any>, userId: number) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllUserOrder(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getAllUserOrder_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  getAllHistoryOrder(
    { commit }: ActionContext<orderState, any>,
    userId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllHistoryOrder(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getAllHistoryOrder_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  createUserOrder(
    { commit }: ActionContext<orderState, any>,
    userOrder: OrderReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .createOrder(userOrder)
        .then((response) => {
          if (response.status == 200) {
            commit("createUserOrder_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  cancelOrder({ commit }: ActionContext<orderState, any>, orderId: number) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .cancelOrder(orderId)
        .then((response) => {
          if (response.status == 200) {
            commit("cancelOrder_success");
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
const mutations: MutationTree<orderState> = {
  getAllUserOrder_success(state: orderState, payload) {
    state.orders = payload.data;
  },
  getAllHistoryOrder_success(state: orderState, payload) {
    state.orders = payload.data;
  },
  cancelOrder_success(state: orderState) {
    state.isCancelOrder = true;
  },
  createUserOrder_success(state: orderState) {
    state.isCreateOrder = true;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
