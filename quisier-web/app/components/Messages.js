import React, {PropTypes} from 'react'
import { Message , Divider, Container} from 'semantic-ui-react'

const Messages = (messages) => {

    let myMessages = new Array()
    if(messages.errors.length > 0){
        myMessages.push(
             <Container text key='errors'>
                  <Divider horizontal>Error</Divider>
                <Message error   list={messages.errors}  />
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