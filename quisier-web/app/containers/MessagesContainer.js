import { connect } from 'react-redux'
import {changeUserType, submitSignUp} from  '../actions/signupActions'

import Messages from '../components/Messages'

const mapStateToProps = (state, ownProps) => {
  let reducers = state.reducers
  return {
    errors: reducers.messages.errors,
    warnings: new Array(),
    infos: new Array()
  }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {}
}

const MessagesContainer = connect(
  mapStateToProps,
  mapDispatchToProps
)(Messages)

export default MessagesContainer