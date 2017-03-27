import { ROUTE } from '../constants/actionTypes'

export default function routingReducer(state, action) {

    switch (action.type) {

        case ROUTE:
            return action.url

        default:
            return ''

    }
}