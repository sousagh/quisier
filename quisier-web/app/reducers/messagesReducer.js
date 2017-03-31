import { ERROR_MESSAGE, CLEAR_ERRORS, INFO_MESSAGE} from '../constants/actionTypes'

const initialState = { 
    errors:[],
    warnings: [],
    info: ''
}

export default function messagesReducer(state = initialState, action) {

    switch (action.type) {

        case ERROR_MESSAGE:
            return Object.assign({}, state, {errors: action.messages} )

        case CLEAR_ERRORS:
            return Object.assign({}, state, initialState)
        
        case INFO_MESSAGE:
             return Object.assign({}, state, {info: action.text} )
            
        default:
            return state

    }
}