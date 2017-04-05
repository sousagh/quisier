
import { showErrorMessage, clearErrorMessages , showMessage} from '../actions/messageActions'
import {sendPost} from '../util/requests'

export function submitLogin(email, password, history) {
    return (dispatch) => {

        let errors = new Array();
        if (email == '') {
            errors.push('Email field cannot be empty.')
        }

        if (password == '') {
            errors.push('Password field cannot be empty.')
        }

        if (errors.length > 0) {
            dispatch(showErrorMessage(errors))
        } else {
            dispatch(clearErrorMessages())

            sendPost('/auth/login', {email: email, password: password},
                function (response) {

                    if (response.success) {
                        dispatch(showMessage('User successfully created!'))
                        setTimeout(() => {
                            dispatch(clearErrorMessages())
                            history.push('/create')
                        }, 2000)
                    } else {
                        dispatch(showErrorMessage([response.message]))
                    }
                }
                , function (e) {
                    dispatch(showErrorMessage(['Internal Server Error: ' + e.message]))
                })
        }
    }
}