// src\pages\Cadastro\index.js

import FormularioCadastro from '../../components/FormularioCadastro'
import './styles.css'
import planoDeFundo from '../../assets/images/estadio-curuzu.jpg'

function PaginaCadastro() {
    return (
        <div className='pagina-cadastro'>
            <img src={planoDeFundo} alt="Plano de fundo do estádio Curuzu" className='planoDeFundo'/>
            <FormularioCadastro/>
        </div>
    )
}

export default PaginaCadastro