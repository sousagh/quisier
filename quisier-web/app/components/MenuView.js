import React, {PropTypes} from 'react'
import { Menu } from 'semantic-ui-react'
import {
  BrowserRouter as Router,
  Route,
  Link, withRouter
} from 'react-router-dom'
import TopMenuItem from './TopMenuItem'

const MenuView = withRouter(({ history}) => (
      <Menu pointing secondary>
        <TopMenuItem name='Quisier' url='/' historyObj={history} isActive={false} />
        <TopMenuItem name='About' url='/about' historyObj={history} isActive={false} />

        <Menu.Menu position='right'>
          <TopMenuItem name='Login' url='/login' historyObj={history} isActive={false} />
          <TopMenuItem name='Sign up' url='/signup' historyObj={history} isActive={false} />
        </Menu.Menu>
      </Menu>

))  


export default MenuView
