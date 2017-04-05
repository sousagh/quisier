import React, {PropTypes} from 'react'
import { Container, Header, Button, Checkbox, Form } from 'semantic-ui-react'

const Login = ({onSubmitLogin}) => {
  let email, password
  
  return (
  <Container text>
    <Header as='h2'>Login</Header>

    <Form>
      <Form.Field  width='10'>
        <label>Email</label>
        <input placeholder='Email' ref={node => { email = node }}/>
      </Form.Field>
      <Form.Field width='10'> 
        <label>Password</label>
        <input placeholder='Last Name' type='password' ref={node => { password = node }}/>
      </Form.Field>

      <Button type='submit'onClick={ (e) => {
        e.preventDefault()
        onSubmitLogin(email.value, password.value) 
        }
      }>Login</Button>
    </Form>

  </Container>
)}

Login.propTypes = {
  onSubmitLogin: PropTypes.func
}

export default Login
