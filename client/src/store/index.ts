import { createStore, createLogger } from 'vuex'
import auth, { authState } from './modules/auth'
import product, { productState } from './modules/product'

const debug = process.env.NODE_ENV !== 'production'

type initialStateStore = {
  auth: authState,
  product: productState
}

export default createStore<initialStateStore>({
  modules: {
    auth,
    product
  },
  strict: debug,
  plugins: debug ? [createLogger()] : []
})
