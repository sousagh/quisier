import Login from '../components/Login.jsx'
import Home from '../components/Home.jsx'
import CreateQuestion from '../components/CreateQuestion.jsx'
import About from '../components/About.jsx'

const routes = new Map();
routes.set('#/about', About)
routes.set('#/login', Login)
routes.set('', Home)
routes.set('#/create', CreateQuestion)

export default routes