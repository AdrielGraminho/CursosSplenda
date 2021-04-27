const funcionario = {
    nome: 'Maria',
    salario: 12348.99
}

const clone = { ativo: true, ...funcionario }
console.log(clone)

const grupoA = ['João', 'Pedro', 'Glória']
const grupoFinal = ['Maria', 'Rafaela', ...grupoA]

console.log(grupoFinal)