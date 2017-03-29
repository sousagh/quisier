import React, {PropTypes} from 'react'
import { Menu} from 'semantic-ui-react'


const TopMenuItem = ({ name, url, isActive, historyObj}) => (
        <Menu.Item  name={name} active={historyObj.location.pathname == url} onClick={e => {
                      e.preventDefault()
                      historyObj.push( url )
                    }}/>
)

TopMenuItem.propTypes = {
  name: PropTypes.string.isRequired,
  url: PropTypes.string.isRequired,
  isActive: PropTypes.bool.isRequired,
  historyObj: PropTypes.object.isRequired
}


export default TopMenuItem
