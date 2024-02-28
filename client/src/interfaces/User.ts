export interface User{
    id: number,
    email: string,
    firstName: string,
    lastName: string,
    role: string
}
export interface UserReq{
    email: string,
    firstName: string,
    lastName: string,
    password: string,
    passwordConfirm: string,
}