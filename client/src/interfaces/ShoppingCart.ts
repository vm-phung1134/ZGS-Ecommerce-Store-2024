import { Product } from "./Product";
import { User } from "./User";

export interface ShoppingCartReq{
    id?: number,
    user: {
        id: number
    },
    product: {
        id: number
    },
    quantity: number;
}

export interface ShoppingCartRes{
    id?: number,
    user: User,
    products: Product[]
}