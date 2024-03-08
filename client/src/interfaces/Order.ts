import { Product } from "./Product";
import { User } from "./User";
import { UserAddressRes } from "./UserAddress";
import { UserPaymentRes } from "./UserPayment";

export interface OrderReq {
  id?: number;
  user: {
    id: number;
  };
  subTotal: number;
  userPayment: {
    id: number;
  };
  userAddress: {
    id: number;
  };
  dateOrder: Date;
}

export interface OrderRes {
  id?: number;
  user: User;
  product: Product;
  subTotal: number;
  subQuantity: number;
  userPayment: UserPaymentRes;
  userAddress: UserAddressRes;
  dateOrder: string;
  active: boolean;
}
