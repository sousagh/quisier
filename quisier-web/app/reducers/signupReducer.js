import { CHANGE_USER_TYPE } from '../constants/actionTypes'

const initialState = { 
    userType: 'student'
}

export default function routingReducer(state = initialState, action) {

    switch (action.type) {

        case CHANGE_USER_TYPE:
            return Object.assign(state, {userType :action.userType} )
            
        default:
            return state

    }
}