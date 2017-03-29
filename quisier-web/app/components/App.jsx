
import React, { PropTypes } from 'react'
import Login from './Login.jsx'
import Home from './Home.jsx'
import CreateQuestion from './CreateQuestion.jsx'
import About from './About.jsx'

import { Menu, Segment, Button } from 'semantic-ui-react'
import MenuView from './MenuView'
import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom'

var routes = new Map();
routes.set('#/about', About)
routes.set('#/login', Login)
routes.set('', Home)
routes.set('#/create', CreateQuestion)

let App = ({ match }) => (
  <Router>
    <div>
     <MenuView/>

     
      <Route exact path={'/'} component={Home} />
      <Route exact path={'/about'} component={About} />
      <Route exact path={'/create'} component={CreateQuestion} />


    </div>
  </Router>
)

export default App
