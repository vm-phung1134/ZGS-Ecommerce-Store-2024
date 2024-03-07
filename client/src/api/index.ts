import axios, { AxiosResponse } from "axios";
import { AuthReq } from "../interfaces/Auth";
import { UserReq } from "../interfaces/User";
import { ShoppingCartReq } from "../interfaces/ShoppingCart";
import { UserPaymentReq } from "../interfaces/UserPayment";
import { UserAddressReq } from "../interfaces/UserAddress";

const axiosApiDefault = axios.create({
  baseURL: `http://localhost:8080/api/auth`,
  timeout: 1000,
  headers: {
    "Content-Type": "application/json",
  },
});

// const token = localStorage.getItem("token");

const axiosApi = axios.create({
  baseURL: `http://localhost:8080/api/`,
  timeout: 1000,
  headers: {
    "Content-Type": "application/json",
    // Authorization: `Bearer ${token}`,
  },
});

export default {
  wecome(): Promise<AxiosResponse<string>> {
    return axiosApi.post(`welcome`);
  },
  // AUTHENTICATION
  authenticated(auth: AuthReq): Promise<AxiosResponse<Object>> {
    return axiosApiDefault.post(`authenticated`, auth);
  },
  register(auth: UserReq): Promise<AxiosResponse<Object>> {
    return axiosApiDefault.post(`register`, auth);
  },
  logout(): Promise<AxiosResponse<Object>> {
    return axiosApiDefault.post(`logout`);
  },

  // USER INFO
  getOneUser(userId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`user/${userId}`);
  },

  // PRODUCT
  getAllProducts(): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`product`);
  },
  getOneProduct(productId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`product/${productId}`);
  },

  // CART
  addToCart(cart: ShoppingCartReq): Promise<AxiosResponse<Object>> {
    return axiosApi.post(`shopping-cart`, cart);
  },
  getUserCart(userId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`shopping-cart/${userId}`);
  },

  // USER PAYMENT
  createUserPaymentMethod(
    userPayment: UserPaymentReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApi.post(`user-payment`, userPayment);
  },
  getAllUserPayment(userId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`user-payment/${userId}`);
  },
  updateDefaultPayment(
    paymentId: string,
    userPayment: UserPaymentReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApi.put(`user-payment/${paymentId}`, userPayment);
  },
  deletePaymentMethod(paymentId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.delete(`user-payment/${paymentId}`);
  },

  // USER ADDRESS
  createUserAddressMethod(
    userAddress: UserPaymentReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApi.post(`user-address`, userAddress);
  },
  getAllUserAddress(userId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`user-address/${userId}`);
  },
  updateDefaultAddress(
    addressId: string,
    userAddress: UserAddressReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApi.put(`user-address/${addressId}`, userAddress);
  },
  deleteAddressMethod(addressId: string): Promise<AxiosResponse<Object>> {
    return axiosApi.delete(`user-address/${addressId}`);
  },
};
