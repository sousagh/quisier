import routingReducer from './routingReducer'

export default function reducerApp(state = {}, action) {

    var newState = {
        route: routingReducer(state, action)
    };
    console.log('state!');
    console.log(newState);
    return newState;
}