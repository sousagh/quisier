
import React from 'react'
import Login from './Login.jsx'
import Home from './Home.jsx'
import CreateQuestion from './CreateQuestion.jsx'
import About from './About.jsx'

var routes = new Map();
routes.set('#/about', About)
routes.set('#/login', Login)
routes.set('', Home)
routes.set('#/create', CreateQuestion)


class App extends React.Component {

  constructor(props) {
    super(props);
    this.state =  {
      route: window.location.hash
    }
  }

  componentDidMount() {
    window.addEventListener('hashchange', () => {
      this.setState({
        route: window.location.hash
      })
    })
  }


  render() {
    let Child = routes.get(this.state.route);
    return (
      <div>
        <h1>App</h1>
        <ul>
          <li>
            <a href="/">Home</a>
          </li>
          <li>
            <a href="#/about">About</a>
          </li>
          <li>
            <a href="#/login">Inbox</a>
          </li>
          <li>
            <a href="#/create">Test</a>
          </li>
        </ul>
        <Child/>
      </div>
    )
  }
}


export default App
