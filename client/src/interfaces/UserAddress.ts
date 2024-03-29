import { User } from "./User";

export interface UserAddressReq {
  id?: number;
  user: {
    id: number;
  };
  address: string;
  active?: boolean;
  city: string;
  country: string;
  phone: string;
  postCode: string;
}

export interface UserAddressRes {
  id?: number;
  user: User;
  address: string;
  active: boolean;
  city: string;
  country: string;
  phone: string;
  postCode: string;
}

export const INITIAL_USER_ADDRESS_REQ = {
  user: {
    id: 0,
  },
  address: "",
  active: true,
  city: "",
  country: "",
  phone: "",
  postCode: "",
  id: 0,
};
