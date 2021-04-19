import './App.css'
import React from 'react'

import FamiliaMembro from "./components/basicos/FamiliaMembro"

import ParOuImpar from "./components/condicional/ParOuImpar"
import TabelaProdutos from "./components/repeticao/TabelaProdutos"
import ListaAlunos from "./components/repeticao/ListaAlunos"
import Familia from "./components/basicos/Familia"
import Card from './components/layout/Card'
import Aleatorio from "./components/basicos/Aleatorio"
import Primeiro from './components/basicos/Primeiro'
import ComParametro from './components/basicos/ComParametro'
import Fragmento from './components/basicos/Fragmento'


export default _ =>
    <div className="App">
        <h1>Fundamentos React 2</h1>

        <div className="Cards">

            <Card titulo="#8 Renderização condicional" color="#982395">
                <ParOuImpar numero={20}></ParOuImpar>
            </Card>

            <Card titulo="#7 Desafio Repetição" color="#3A9AD9">
                <TabelaProdutos></TabelaProdutos>
            </Card>

            <Card titulo="#6 Repetição" color="#1E90FF">
                <ListaAlunos></ListaAlunos>
            </Card>

            <Card titulo="#5 Componente com filho" color="#BC8F8F">
                <Familia sobrenome="Ferreira">
                    <FamiliaMembro nome="Pedro" />
                    <FamiliaMembro nome="Ana" />
                    <FamiliaMembro nome="Gustavo" />
                </Familia>
            </Card>

            <Card titulo="#4 Desafio Aleatório" color="#080">
                <Aleatorio min={1} max={60} />
            </Card>

            <Card titulo="#3 Fragmento" color='#1E90FF'>
                <Fragmento />
            </Card>

            <Card titulo="#2 Fragmento" color='#00FF7F'>
                <ComParametro
                    titulo="Segundo Componente"
                    subtitulo="Muito legal!" />
            </Card>

            <Card titulo="#1 Fragmento" color='#BC8F8F'>
                <Primeiro></Primeiro>
            </Card>
        </div>
    </div>