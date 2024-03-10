export interface AuthReq {
  email: string;
  password: string;
}

export interface AuthRes {
  id: number;
  email: string;
  firstName: string;
  lastName: string;
  role: string;
  token: string;
}

export interface ChangePasswordReq {
  email: string;
  password: string;
  passwordConfirm: string;
}

export const INITIAL_AUTH: AuthRes = {
  id: 0,
  email: "",
  firstName: "",
  lastName: "",
  role: "",
  token: "",
};
