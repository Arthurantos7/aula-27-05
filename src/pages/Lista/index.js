// src\pages\Lista\index.js

import ListaDeUsuarios from '../../components/ListaDeUsuarios'
import { useNavigate } from 'react-router-dom'
import './styles.css'
import PlanoDeFundo from '../../assets/images/estadio-curuzu.jpg'

function PaginaListaUsuarios() {
    const navigate = useNavigate()
    
return (
        <div className='pagina-lista-usuarios'>
            <img src={PlanoDeFundo} alt="Plano de fundo do estádio Curuzu" className='planoDeFundo'/>
            <div className='container'>
                <h2>Lista de usuários</h2>
                <ListaDeUsuarios />
                <button onClick={() => navigate('/cadastro')} className='link-voltar'>
                    Cadastrar usuários
                </button>
            </div>
        </div>
    )
}

export default PaginaListaUsuarios