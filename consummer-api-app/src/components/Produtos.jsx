import React, { useEffect, useState } from 'react'
import { Link} from 'react-router-dom'
import {AiOutlineEdit as ED} from 'react-icons/ai'
import {RiDeleteBin2Line as EX} from 'react-icons/ri'



export default function Produtos() {

    //STATE - LISTA DE PRODUTOS
    const [produtos, setProdutos] = useState([])

    useEffect(() => {
        //CRIANDO A FUNÇÃO ASSINCRONA
        const getProdutos = async ()=>{
            const response = await fetch("http://localhost:8080/LojaApp/rest/produto")
            const data = await response.json()

            setProdutos(data)
        }

        getProdutos()
    }, [])


    
  return (
    <div>

        <table border={1}>
            <tr>
                <th>ID</th>
                <th>TÍTULO</th>
                <th>PREÇO</th>
                <th>QUANTIDADE</th>
                <th>Editar | Excluir</th>
            </tr>

        {produtos.map((p,i)=>
            <tr key={i}>
                <td>{p.codigo}</td>
                <td>{p.titulo}</td>
                <td>{p.preco}</td>
                <td>{p.quantidade}</td>
                <td><Link to={`/editar/${p.codigo}`}><ED/></Link>  | <Link to={`/excluir/${p.codigo}`}><EX/></Link></td>
            </tr>
        )}
    </table>
    </div>
  )
}
