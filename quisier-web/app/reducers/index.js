
import signupReducer from './signupReducer'
import messagesReducer from './messagesReducer'

const initialState = {
}

export default function reducerApp(state = initialState, action) {

    var newState = {
        signup: signupReducer(state.signup, action),
        messages: messagesReducer(state.messages, action)
    }
    
    return newState;
}