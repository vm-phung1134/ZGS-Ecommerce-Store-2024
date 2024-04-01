import { Product } from "./Product";
import { User } from "./User";

export interface CommentReq {
  user: {
    id: number;
  };
  product: {
    id: number;
  };
  message: string;
  quantityStar: number;
}

export interface CommentRes {
  id?: number;
  user: User;
  product: Product;
  message: string;
  quantityStar: number;
}
