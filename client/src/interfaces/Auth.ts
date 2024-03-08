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
