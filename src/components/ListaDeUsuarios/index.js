// src\components\ListaDeUsuarios\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css'

function ListaDeUsuarios() {
    const [usuarios, setUsuarios] = useState([])

    useEffect(() => {
        const carregarUsuarios = async () => {
            try {
                const response = await axios.get('http://localhost:8080/usuarios')
                setUsuarios(response.data)
            } catch (error) {
                alert('Erro ao buscar usuários: ', error)
                setUsuarios([])
            }
        }
        carregarUsuarios()
    }, [])

    return (
        <ul id="listaUsurios" className="lista-usuarios">
            {usuarios.length === 0 ? (
                <li>Nenhum jogador encontrado.</li>
            ) : (
                usuarios.map( usuario => (
                    <li key={usuario.id} className="usuario-jogador">
                        <strong>Nome: </strong> {usuario.nome}<br />
                        <strong>Sexo: </strong> {usuario.sexo}<br />
                        <strong>Idade: </strong> {usuario.idade}<br />          
                        <strong>Altura: </strong> {usuario.altura}<br />          
                        <strong>Peso: </strong> {usuario.peso}<br />          
                        <strong>Posicao: </strong> {usuario.posicao}<br />          
                        <strong>NumeroDaCamisa: </strong> {usuario.NumeroDaCamisa}<br />          
                    </li>
                ))
            )}
        </ul>
    )
    
}

export default ListaDeUsuarios