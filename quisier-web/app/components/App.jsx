
import React, { PropTypes } from 'react'
import Login from './Login.jsx'
import Home from './Home.jsx'
import CreateQuestion from './CreateQuestion.jsx'
import About from './About.jsx'
import SignupContainer from '../containers/SignupContainer'
import MessagesContainer from '../containers/MessagesContainer'

import { Menu, Segment, Button } from 'semantic-ui-react'
import MenuView from './MenuView'
import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom'



let App = ({ match }) => (
  <Router>
    <div>
     <MenuView/>
  
      <Route exact path={'/'} component={Home} />
      <Route exact path={'/login'} component={Login} />
      <Route exact path={'/about'} component={About} />
      <Route exact path={'/create'} component={CreateQuestion} />
      <Route exact path={'/signup'} component={SignupContainer} />

      <MessagesContainer/>
    </div>
  </Router>
)

export default App
