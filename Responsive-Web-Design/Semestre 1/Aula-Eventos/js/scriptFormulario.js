let nome = document.querySelector('#idNome')
let span = document.querySelector('#acao')

nome.addEventListener('focus', ()=>{
    nome.style.outlineColor = 'blue'
    span.innerHTML = 'Não esqueça de digitar o seu nome completo'
})


nome.addEventListener('blur', ()=>{
    nome.style.borderColor = 'red'
    span.innerHTML = 'Você esqueceu de escrever o nome'
    span.style.color = 'red'
})

let range = document.querySelector('#idBarra')

range.addEventListener('change', ()=>{
    document.querySelector('#idValor').innerHTML = range.value
})


let form = document.querySelector('#idForm')
form.addEventListener('submit', ()=>{
    alert('Obrigado por preencher nossa pesquisa!')
})