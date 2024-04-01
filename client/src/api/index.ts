import axios, { AxiosResponse } from "axios";
import { AuthReq, ChangePasswordReq } from "../interfaces/Auth";
import { UserReq } from "../interfaces/User";
import { ShoppingCartReq } from "../interfaces/ShoppingCart";
import { UserPaymentReq } from "../interfaces/UserPayment";
import { UserAddressReq } from "../interfaces/UserAddress";
import { OrderReq } from "../interfaces/Order";
import { CommentReq } from "../interfaces/Comment";

const axiosApiDefault = axios.create({
  baseURL: `http://localhost:8080/api/auth/`,
  timeout: 6000,
  headers: {
    "Content-Type": "application/json",
  },
});

const token = localStorage.getItem("token");

const axiosApi = axios.create({
  baseURL: `http://localhost:8080/api/`,
  timeout: 6000,
  headers: {
    "Content-Type": "application/json",
  },
});

const axiosApiToken = axios.create({
  baseURL: `http://localhost:8080/api/`,
  timeout: 6000,
  headers: {
    "Content-Type": "application/json",
    Authorization: `Bearer ${token}`,
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
  getOneUser(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiDefault.get(`${userId}`);
  },
  changePasswordUser(
    changePass: ChangePasswordReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApiDefault.post(`reset-password`, changePass);
  },

  // PRODUCT
  getAllProducts(): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`product`);
  },
  getOneProduct(productId: number): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`product/${productId}`);
  },

  // CATEGORY
  getAllCategory(): Promise<AxiosResponse<Object>> {
    return axiosApi.get(`product-category`);
  },

  // CART
  addToCart(cart: ShoppingCartReq): Promise<AxiosResponse<Object>> {
    return axiosApiToken.post(`shopping-cart`, cart);
  },
  getUserCart(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.get(`shopping-cart/${userId}`);
  },
  undoItemCart(
    productId: number,
    userId: number
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.delete(`shopping-cart/${productId}/${userId}`);
  },
  increaseProductQuantity(
    productId: number,
    userId: number
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.put(`shopping-cart/increase/${productId}/${userId}`);
  },
  decreaseProductQuantity(
    productId: number,
    userId: number
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.put(`shopping-cart/decrease/${productId}/${userId}`);
  },

  // USER PAYMENT
  createUserPaymentMethod(
    userPayment: UserPaymentReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.post(`user-payment`, userPayment);
  },
  getAllUserPayment(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.get(`user-payment/${userId}`);
  },
  updateDefaultPayment(
    userPayment: UserPaymentReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.put(`user-payment/${userPayment.id}`, userPayment);
  },
  deletePaymentMethod(paymentId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.delete(`user-payment/${paymentId}`);
  },

  // USER ADDRESS
  createUserAddressMethod(
    userAddress: UserAddressReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.post(`user-address`, userAddress);
  },
  getAllUserAddress(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.get(`user-address/${userId}`);
  },
  updateDefaultAddress(
    userAddress: UserAddressReq
  ): Promise<AxiosResponse<Object>> {
    return axiosApiToken.put(`user-address/${userAddress.id}`, userAddress);
  },
  deleteAddressMethod(addressId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.delete(`user-address/${addressId}`);
  },

  // ORDER
  createOrder(orderReq: OrderReq): Promise<AxiosResponse<Object>> {
    return axiosApiToken.post(`user-order`, orderReq);
  },
  cancelOrder(orderId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.delete(`user-order/${orderId}`);
  },
  getAllUserOrder(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.get(`user-order/${userId}`);
  },
  getAllHistoryOrder(userId: number): Promise<AxiosResponse<Object>> {
    return axiosApiToken.get(`user-order/history/${userId}`);
  },

  // COMMENT
  createComment(commentReq: CommentReq): Promise<AxiosResponse<Object>> {
    return axiosApiToken.post(`user-comment`, commentReq);
  },
  getAllComment(productId: number): Promise<AxiosResponse<Object>>{
    return axiosApi.get(`user-comment/getAllComment/${productId}`);
  },
  getAvgStar(productId: number): Promise<AxiosResponse<Object>>{
    return axiosApi.get(`user-comment/get-star/${productId}`);
  },
};
