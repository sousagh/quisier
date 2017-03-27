
import React, { PropTypes } from 'react'
import Login from './Login.jsx'
import Home from './Home.jsx'
import CreateQuestion from './CreateQuestion.jsx'
import About from './About.jsx'
import Menu from '../containers/Menu'

import { Button } from 'semantic-ui-react'

var routes = new Map();
routes.set('#/about', About)
routes.set('#/login', Login)
routes.set('', Home)
routes.set('#/create', CreateQuestion)
import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom'

let App = ({ match }) => (
  <Router>
    <div>
      <h2>This is from App</h2>
      <ul>
        <li><Link to="/home">Home</Link></li>
        <li><Link to="/about">About</Link></li>
        <li><Link to="/create">Create</Link></li>
      </ul>
 <Button>
    Click Here
  </Button>
      
      <hr />

      <Route exact path={'/home'} component={Home} />
      <Route exact path={'/about'} component={About} />
      <Route exact path={'/create'} component={CreateQuestion} />

    </div>
  </Router>
)

export default App
