
// Fazendo uma chamada usando uma função anônima
// document.querySelector('#btnMensagem').onclick = function(){
//     alert('Esta mensagem está em um arquivo externo')
// }

//Usando Arrow Function
// document.querySelector('#btnMensagem').onclick = () => {
//     alert("Agora usando uma arrow function")
// }

//Usando Arrow Function simplificada
// let correr = velocidade => console.log("O carro está correndo a " + velocidade);
// correr(100)

//Usando o método AddEventListener
// document.querySelector('#btnMensagem').addEventListener('click', function(){
//     alert("Agora usando o addEventListener")
// })

//Organizando o código
//let botao = document.querySelector('#btnMensagem')
// botao.addEventListener('click', clicou)
// botao.addEventListener('mouseenter', entrou)

// function clicou(){
//     botao.innerHTML = "Clicou!"
// }

// function entrou(){
//     botao.innerHTML = "Entrou"
// }


let botao = document.querySelector('#btnMensagem')
botao.addEventListener('click', clicou)
botao.addEventListener('mouseenter', entrou)
botao.addEventListener('mouseout', saiu)

function entrou(){
    botao.innerHTML = "Entrou"
}

function saiu(){
    botao.innerHTML = "Saiu"
}

function clicou(){
    botao.innerHTML = "Clicou não entra e não sai mais"
    botao.removeEventListener('mouseenter', entrou)
    botao.removeEventListener('mouseout', saiu)
}

let botoes = document.querySelectorAll('.item')
botoes.forEach((item)=>{item.addEventListener('click', ()=>console.log('Clicou'))})

function clicar(){
    console.log("clicou");
}












