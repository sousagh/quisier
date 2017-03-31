import React , {PropTypes} from 'react'
import { Container, Header, Button, Checkbox, Form } from 'semantic-ui-react'



const Signup = ({ userType, onChangeType, onSubmitSignUp }) => {

let firstName, lastName, email, password, confPassword, type

return (
  <Container text>
    <Header as='h2'>Sign up</Header>

    <Form>
      <Form.Field>
        <label>First Name</label>
        <input placeholder='First Name' ref={node => { firstName = node }}/>
      </Form.Field>
      <Form.Field>
        <label>Last Name</label>
        <input placeholder='Last Name' ref={node => { lastName = node }}/>
      </Form.Field>
      <Form.Field>
        <label>Email Address</label>
        <input placeholder='joe@myemail.com' ref={node => { email = node }} />
      </Form.Field>
      <Form.Field>
        <Form.Group inline ref={node => { type = node }}>
          <label>User type</label>
          <Form.Radio label='Student' value='student' onChange={() => onChangeType('student') } checked={userType === 'student'}/>
          <Form.Radio label='Teacher' value='teacher' onChange={() => onChangeType('teacher') }  checked={userType === 'teacher'}/>
        </Form.Group>
        <label>Password</label>
        <input type='password' placeholder='Password' ref={node => { password = node }}/>
      </Form.Field>
      <Form.Field>
        <label>Confirm Password</label>
        <input type='password' placeholder='Confirm password' ref={node => { confPassword = node }}/>
      </Form.Field>

      <Button type='submit' onClick={ (e) => {
        e.preventDefault()
        let userData = {
          firstName: firstName.value,
          lastName: lastName.value,
          email: email.value,
          type: userType,
          password: password.value,
          confPassword: confPassword.value
        }

        onSubmitSignUp(userData)
        }} >Submit</Button>
    </Form>

  </Container>
)}

Signup.propTypes = {
  userType : PropTypes.string,
  onChangeType : PropTypes.func,
  onSubmitSignUp: PropTypes.func
}



export default Signup
