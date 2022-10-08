import React,{useEffect} from 'react'
import { useNavigate, useParams } from 'react-router-dom'
export default function Manipulador() {

        //GERANDO O REDIRECT
    let navigate = useNavigate()

    //CARREGAMENTO DO PARÂMETRO
    const { id } = useParams()

    useEffect(() => {
        
        const removeProduto = async ()=>{
            const response = await fetch(`http://localhost:8080/LojaApp/rest/produto/${id}`,{
                                    method: "DELETE",
                                    headers: {
                                        'Accept' : 'application/json',
                                        'Content-Type':'application/json'
                                    }})
                                    .then(()=>  navigate("/produto"))
        }
        
        removeProduto()

    }, [id])

  return (
    <>Manipulador</>
  )
}
