import './App.css'
import React from 'react'

import Mega from "./components/mega/Mega"
import Contador from './components/contador/Contador'
import Input from "./components/formulario/Input"
import IndiretaPai from "./components//comunicacao/IndiretaPai"
import FamiliaMembro from "./components/basicos/FamiliaMembro"
import DiretaPai from "./components/comunicacao/DiretaPai"
import UsuarioInfo from "./components/condicional/UsuarioInfo"
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
            <Card titulo="#13 Mega" color="black">
                <Mega></Mega>
            </Card>
            <Card titulo="#12 Contador" color="#080">
                <Contador numeroInicial={20}></Contador>
            </Card>
            <Card titulo="#11 Componente controlado" color="#E45F56">
                <Input></Input>
            </Card>
            <Card titulo="#10 Comunicação Indireta" color="#59323C">
                <IndiretaPai></IndiretaPai>
            </Card>

            <Card titulo="#9 Comunicação Direta" color="#59323C">
                <DiretaPai></DiretaPai>
            </Card>

            <Card titulo="#8 Renderização condicional" color="#982395">
                <ParOuImpar numero={20}></ParOuImpar>
                <UsuarioInfo usuario={{ nome: 'Fernando' }} />
                <UsuarioInfo></UsuarioInfo>
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