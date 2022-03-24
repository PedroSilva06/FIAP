let minhaDiv = document.querySelector('#div1')

minhaDiv.addEventListener('mouseenter', entrar)
minhaDiv.addEventListener('mouseout', sair)
//minhaDiv.addEventListener('click', clicar)
minhaDiv.addEventListener('contextmenu', clickDireito)
minhaDiv.addEventListener('dblclick', clickDuplo)
minhaDiv.addEventListener('mousemove', mover)
minhaDiv.addEventListener('mousedown', apertou)
minhaDiv.addEventListener('mouseup', soltou)


function entrar(){
    minhaDiv.innerHTML = "você entrou"
    minhaDiv.style.backgroundColor = 'blue'
}

function sair(){
    minhaDiv.innerHTML = "você saiu"
    minhaDiv.style.backgroundColor = 'green'
}

function clicar(){
    minhaDiv.innerHTML = "você clicou"
    minhaDiv.style.backgroundColor = 'orange'
}

function clickDireito(){
    minhaDiv.innerHTML = "Click Direito"
    minhaDiv.style.backgroundColor = 'pink'
}

function clickDuplo(){
    minhaDiv.innerHTML = "Click Duplo"
    minhaDiv.style.backgroundColor = 'red'
}

function mover(event){
    let x = event.clientX // Relativo a tela
    let y = event.clientY //Relativo a tela
    // let x = event.clienteX - this.offsetLeft// Relativo ao elemento
    // let y = event.clienteY - this.offsetTop//Relativo ao elemento
   let res = document.querySelector('span')
   res.innerHTML = 'Posição X: ' + x + ' e Y: ' + y
}

function apertou(){
    minhaDiv.innerHTML = "Botão apertado"
    minhaDiv.style.backgroundColor = 'aqua'
}

function soltou(){
    minhaDiv.innerHTML = "Botão solto"
    minhaDiv.style.backgroundColor = 'lime'
}