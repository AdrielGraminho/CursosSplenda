import React from 'react'
import PageTitle from '../../components/layout/PageTitle'
import { useCounter } from '../../hooks/useCounter'
import SectionTitle from '../../components/layout/SectionTitle'
import { useFetch } from '../../hooks/useFetch'

const UseRef = (props) => {

    const [count, inc, dec] = useCounter()
    const url = 'http://files.cod3r.com.br/curso-react/estados.json'
    const response = useFetch(url)

    function showStates(states){
        return states.map(state => <li key={state.nome}>{state.nome} - {state.sigla}</li>)
    }

    return (
        <div className="UseCustom">
            <PageTitle
                title="Seu Hook"
                subtitle="Vamos aprender como criar o nosso próprio Hook!"
            />

            <SectionTitle title="Exercício 1"></SectionTitle>
            <div className="center">
                <span className="text">{count}</span>
                <div>
                    <button className="btn"
                        onClick={() => inc()}>Inc</button>
                    <button className="btn"
                        onClick={() => dec()}>Dec</button>
                </div>
            </div>

            <div className="center">
                <SectionTitle title="Exercício 2"></SectionTitle>
                <div className="center">
                    <ul>
                        {!response.loadding ? showStates(response.data) : false}
                    </ul>
                </div>
            </div>
        </div>
    )
}

export default UseRef
