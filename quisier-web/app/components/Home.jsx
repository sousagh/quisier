import React from 'react'
import { Link } from 'react-router-dom'

const Home =  ({ match })  => (
  <div>
    <h2>Home Stuff!! page</h2>
       <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/about">About</Link></li>
          </ul>
        <hr/>
  </div>
)

export default Home
