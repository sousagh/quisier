import {ERROR_MESSAGE, CLEAR_ERRORS} from '../constants/actionTypes'


export function showErrorMessage (messages) {

    return {
        type: ERROR_MESSAGE,
        messages, 
    }
}

export function clearErrorMessages () {
    return {
        type: CLEAR_ERRORS
    }
}