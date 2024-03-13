import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { UserPaymentRes, UserPaymentReq } from "../../interfaces/UserPayment";
import { reactive } from "vue";

export type paymentState = {
  payments: UserPaymentRes[];
  isSetDefault: boolean;
  isCreatePayment: boolean;
  isDeletePayment: boolean;
};

// auth state
const state: paymentState = reactive({
  payments: [],
  isSetDefault: false,
  isCreatePayment: false,
  isDeletePayment: false,
});

// getters
const getters = {};

// actions
const actions: ActionTree<paymentState, any> = {
  getAllUserPayment(
    { commit }: ActionContext<paymentState, any>,
    userId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllUserPayment(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getAllUserPayment_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  createPaymentMethod(
    { commit }: ActionContext<paymentState, any>,
    userPayment: UserPaymentReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .createUserPaymentMethod(userPayment)
        .then((response) => {
          if (response.status == 200) {
            commit("createPaymentMethod_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  setDefaultPayment(
    { commit }: ActionContext<paymentState, any>,
    paymentMethodSet: UserPaymentReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .updateDefaultPayment(paymentMethodSet)
        .then((response) => {
          if (response.status == 200) {
            commit("setDefaultPayment_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  deletePaymentMethod(
    { commit }: ActionContext<paymentState, any>,
    paymentId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .deletePaymentMethod(paymentId)
        .then((response) => {
          if (response.status == 200) {
            commit("deletePaymentMethod_success");
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
const mutations: MutationTree<paymentState> = {
  getAllUserPayment_success(state: paymentState, payload) {
    state.payments = payload.data;
  },
  setDefaultPayment_success(state: paymentState) {
    state.isSetDefault = true;
  },
  deletePaymentMethod_success(state: paymentState) {
    state.isDeletePayment = true;
  },
  createPaymentMethod_success(state: paymentState) {
    state.isCreatePayment = true;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
