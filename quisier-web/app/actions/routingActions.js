import { ROUTE } from '../constants/actionTypes'

export const changePage = (text) => {
    return {
        type: ROUTE,
        url: text,  //<--ES6. same as text:text, in ES5
    }
}