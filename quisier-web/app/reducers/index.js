import routingReducer from './routingReducer'
import signupReducer from './signupReducer'
import messagesReducer from './messagesReducer'

const initialState = {
}

export default function reducerApp(state = initialState, action) {

    var newState = {
        route: routingReducer(state, action),
        signup: signupReducer(state, action),
        messages: messagesReducer(state.messages, action)
    }
    
    return newState;
}