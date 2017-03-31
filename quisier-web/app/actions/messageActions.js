import {ERROR_MESSAGE, CLEAR_ERRORS, INFO_MESSAGE} from '../constants/actionTypes'


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

export function showMessage(text) {
    return {
        type: INFO_MESSAGE,
        text
    }
}