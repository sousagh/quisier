import React, {PropTypes} from 'react'
import { Message , Divider, Container} from 'semantic-ui-react'

const Messages = (messages) => {

    console.log(messages)

    let myMessages = new Array()
    if(messages.errors.length > 0){
        myMessages.push(
             <Container text key='errors'>
                  <Divider horizontal>Error</Divider>
                <Message error   list={messages.errors}  />
            </Container>
        )
    }
    if(messages.info != ''){
        myMessages.push(
            <Container text key='info'>
                <Divider horizontal>Info</Divider>
                <Message info>
                    <p>{messages.info}</p>
                </Message>
            </Container>
        )
    }

    return(
        <div>
            <hr style={{display: 'none'}}/>
            {myMessages}
        </div>
      
)}

Messages.prototype = {
    messages: PropTypes.object
}

export default Messages