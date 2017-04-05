import { connect } from 'react-redux'
import {submitLogin} from '../actions/loginActions'

import Login from '../components/Login'

const mapStateToProps = (state, ownProps) => {
  return {}
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
      onSubmitLogin: (email, password) => {
          dispatch( submitLogin(email, password, ownProps.history) )
      }
  }
}

const LoginContainer = connect(
  mapStateToProps,
  mapDispatchToProps
)(Login)

export default LoginContainer