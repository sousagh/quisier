import React, { PropTypes } from 'react';
import { Provider } from 'react-redux';

import { ConnectedRouter, routerReducer, routerMiddleware, push } from 'react-router-redux'
import createHistory from 'history/createBrowserHistory'

import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom'

import { createStore, combineReducers, applyMiddleware } from 'redux'
import thunkMiddleware from 'redux-thunk'
import { createLogger } from 'redux-logger'

const history = createHistory()
const loggerMiddleware = createLogger()

// Build the middleware for intercepting and dispatching navigation actions
const middleware = routerMiddleware(history)

import reducers from '../reducers'

// Add the reducer to your store on the `router` key
// Also apply our middleware for navigating
const store = createStore(
  combineReducers({
    reducers,
    router: routerReducer
  }),
  applyMiddleware(
    middleware, 
    thunkMiddleware, // lets us dispatch() functions
    loggerMiddleware // neat middleware that logs actions
    )
)

import App from './App.jsx';
import Home from './Home.jsx'
import About from './About.jsx'
import CreateQuestion from './CreateQuestion.jsx'


const Root = () => (
<Provider store={store}>

    <ConnectedRouter history={history}>
      <div>          
        <Route exact path="/" component={App}/>
      </div>
    </ConnectedRouter>
  </Provider>
);


export default Root;