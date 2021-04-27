function falarDepoisDe(segundos, frase) {
    return new Promise((resolver, reject) => {
        setTimeout(() => {
            resolver(frase)
        }, segundos * 1000)
    })
}

falarDepoisDe(3, 'Que Legal!')
    .then(frase => frase.concat('?1?'))
    .then(outraFrase => console.log(outraFrase))
    .catch(e => console.log(e))