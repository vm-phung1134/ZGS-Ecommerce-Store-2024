import { ActionContext, ActionTree, MutationTree } from "vuex";
import api from "../../api";
import { UserAddressRes, UserAddressReq } from "../../interfaces/UserAddress";
import { reactive } from "vue";

export type addressState = {
  addressList: UserAddressRes[];
  isSetDefault: boolean;
  isCreateAddress: boolean;
  isDeleteAddress: boolean;
};

// auth state
const state: addressState = reactive({
  addressList: [],
  isSetDefault: false,
  isCreateAddress: false,
  isDeleteAddress: false,
});

// getters
const getters = {
  getDefaultAddress: (state: addressState) => {
    if (state.addressList) {
      return state.addressList.find((item) => item.active === true);
    }
    return {};
  },
};

// actions
const actions: ActionTree<addressState, any> = {
  getAllUserAddress(
    { commit }: ActionContext<addressState, any>,
    userId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .getAllUserAddress(userId)
        .then((response) => {
          if (response.status == 200) {
            commit("getAllUserAddress_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  createAddressMethod(
    { commit }: ActionContext<addressState, any>,
    userAddress: UserAddressReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .createUserAddressMethod(userAddress)
        .then((response) => {
          if (response.status == 200) {
            commit("createAddressMethod_success", response.data);
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  setDefaultAddress(
    { commit }: ActionContext<addressState, any>,
    addressMethodSet: UserAddressReq
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .updateDefaultAddress(addressMethodSet)
        .then((response) => {
          if (response.status == 200) {
            commit("setDefaultAddress_success");
          }
          resolve(response);
        })
        .catch((error) => {
          console.log("Error: " + error);
          reject("Invalid credentials!");
        });
    });
  },
  deleteAddressMethod(
    { commit }: ActionContext<addressState, any>,
    addressId: number
  ) {
    return new Promise((resolve, reject) => {
      console.log("Accessing backend with successfully");
      api
        .deleteAddressMethod(addressId)
        .then((response) => {
          if (response.status == 200) {
            commit("deleteAddressMethod_success");
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
const mutations: MutationTree<addressState> = {
  getAllUserAddress_success(state: addressState, payload) {
    state.addressList = payload.data;
  },
  setDefaultAddress_success(state: addressState) {
    state.isSetDefault = true;
  },
  deleteAddressMethod_success(state: addressState) {
    state.isDeleteAddress = true;
  },
  createAddressMethod_success(state: addressState) {
    state.isCreateAddress = true;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
