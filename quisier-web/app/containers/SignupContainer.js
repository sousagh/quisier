import { connect } from 'react-redux'
import {changeUserType, submitSignUp} from  '../actions/signupActions'

import Signup from '../components/Signup'

const mapStateToProps = (state, ownProps) => {
  let reducers = state.reducers
  return {
    userType: reducers.signup.userType
  }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
    onChangeType: (type) => {
      dispatch(changeUserType(type))
    },
    onSubmitSignUp: (userData) => {
      dispatch( submitSignUp(userData) )
    }
  }
}

const SignupContainer = connect(
  mapStateToProps,
  mapDispatchToProps
)(Signup)

export default SignupContainer