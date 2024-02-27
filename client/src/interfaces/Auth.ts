export interface AuthReq {
  email: string;
  password: string;
}

export interface AuthRes {
  email: string;
  firstName: string;
  lastName: string;
  role: string;
  token: string;
}
