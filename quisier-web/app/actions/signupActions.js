import { CHANGE_USER_TYPE } from '../constants/actionTypes'
import {showErrorMessage, clearErrorMessages} from '../actions/messageActions'

export const changeUserType = (type) => {

    return {
        type: CHANGE_USER_TYPE,
        userType: type, 
    }
}

export function submitSignUp (userData) {
    return (dispatch) => {

        let errors = validate(userData)

        if(errors.length > 0){
            dispatch( showErrorMessage(errors))
        } else {
            dispatch( clearErrorMessages())
        }
    }
}

function validate(userData){
    let errors = new Array();
    if(userData.firstName == ''){
        errors.push("First name cannot by empty")
    }

    if(userData.lastName == ''){
        errors.push("Last name cannot by empty")
    }
    if(! validateEmail(userData.email)){
        errors.push('Email is not valid')
    }
    if(userData.password == ''){
        errors.push("Password cannot by empty")
    }
    if(userData.confPassword == ''){
        errors.push("Password confirmation cannot by empty")
    }
    if(userData.confPassword != userData.password){
        errors.push("Password and confirmation does not match")
    }

    return errors
}

function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}