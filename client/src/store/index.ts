import { createStore, createLogger } from 'vuex'
import auth, { authState } from './modules/auth'

const debug = process.env.NODE_ENV !== 'production'

type initialStateStore = {
  auth: authState
}

export default createStore<initialStateStore>({
  modules: {
    auth
  },
  strict: debug,
  plugins: debug ? [createLogger()] : []
})
