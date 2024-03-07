import { User } from "./User"

export interface UserPaymentReq{
    id?: number,
    user: {
        id: number
    },
    accountNumber: string,
    active?: boolean,
    paymentType: string,
    cvv: string,
    since: string,
    valid: string
}

export interface UserPaymentRes{
    id?: number,
    user: User
    accountNumber: string,
    active: boolean,
    paymentType: string,
    cvv: string,
    since: string,
    valid: string
}