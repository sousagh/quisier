import { ERROR_MESSAGE, CLEAR_ERRORS } from '../constants/actionTypes'

const initialState = { 
    errors:[],
    warnings: [],
    infos:[]
}

export default function messagesReducer(state = initialState, action) {

    switch (action.type) {

        case ERROR_MESSAGE:
            return Object.assign({}, state, {errors: action.messages} )

        case CLEAR_ERRORS:
            return Object.assign({}, state, {errors: [] } )
            
        default:
            return state

    }
}