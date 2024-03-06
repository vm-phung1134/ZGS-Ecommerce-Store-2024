import { Product } from "./Product";
import { User } from "./User";

export interface ShoppingCartReq{
    id?: number,
    user: User,
    product: Product,
    quantity: number;
}

export interface ShoppingCartRes{
    id?: number,
    user: User,
    products: Product[]
}