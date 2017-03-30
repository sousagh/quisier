import { CHANGE_USER_TYPE } from '../constants/actionTypes'

export default function routingReducer(state, action) {

    switch (action.type) {

        case CHANGE_USER_TYPE:
            return Object.assign(state.signup, {userType :action.userType} )
            
        default:
            return { userType: 'student'}

    }
}