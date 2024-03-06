import { Category } from "./Category";
import { Discount } from "./Discount";
import { Inventory } from "./Inventory";

export interface Product{
    id?: number,
    name: string,
    price: number,
    image: string,
    inventory: Inventory,
    discount: Discount,
    category: Category,
    quantity?: number,
}