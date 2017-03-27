import React, {PropTypes} from 'react'

const MenuView = ({ items, child} ) => (
  <ul>
    {items.map(item =>
      <li key={item.toString()}>
            <a href="/">{item}</a>
      </li>
    )}
    <child/>

  </ul>
)

MenuView.propTypes = {
  items: PropTypes.arrayOf(PropTypes.string).isRequired,
  child: PropTypes.func.isRequired
}

export default MenuView
