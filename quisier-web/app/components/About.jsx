import React from 'react'
import {

  Link
} from 'react-router-dom'

const About =  ({ match })  => (
  <div>
    <h2>This is about me Yifeng.</h2>
    <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/about">About</Link></li>
          </ul>
  </div>
)

export default About
