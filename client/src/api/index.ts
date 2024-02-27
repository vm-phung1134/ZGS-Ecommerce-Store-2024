import axios, { AxiosResponse } from 'axios';
import { AuthReq } from '@/interfaces/Auth';

const axiosApiDefault = axios.create({
    baseURL: `http://localhost:8080/api/auth`,
    timeout: 1000,
    headers: { 
        'Content-Type': 'application/json',
    },
});

// const axiosApi = axios.create({
//   baseURL: `http://localhost:8080/api/`,
//   timeout: 1000,
//   headers: { 
//       'Content-Type': 'application/json',
//       'Authorization': `Bearer ${}`
//   },
// });

export default {
  authenticated(auth: AuthReq): Promise<AxiosResponse<string>> {
      return axiosApiDefault.post(`authenticated`, auth);
  },
}
