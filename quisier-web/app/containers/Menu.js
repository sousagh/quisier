
import MenuView from '../components/MenuView'
import changePage from '../actions/routingActions'

import { connect } from 'react-redux'
import routes from '../util/routes'


const mapStateToProps = (state) => {

    console.log(routes.get(state.route))
  return {
    items: ['test', 'test2'],
    child: routes.get(state.route)
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
      onMenuClick: (url) => {
        dispatch( changePage(url) )
      }
    }
}

const Menu = connect(
  mapStateToProps,
  mapDispatchToProps
)(MenuView)

export default Menu