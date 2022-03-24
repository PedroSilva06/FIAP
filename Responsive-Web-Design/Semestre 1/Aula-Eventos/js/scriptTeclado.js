let texto = document.querySelector('#idTexto')

// texto.addEventListener('keydown', ()=>{
//     let resultado = document.querySelector('#res')
//     resultado.innerHTML = texto.value
// })


// texto.addEventListener('keyup', ()=>{
//     let resultado = document.querySelector('#res')
//     resultado.innerHTML = texto.value
// })

texto.addEventListener('keydown', ()=>{
    let resultado = document.querySelector('#res')
    resultado.innerHTML = ""
    texto.value = ""
})

texto.addEventListener('keyup', (event)=>{
    let resultado = document.querySelector('#res')
    resultado.innerHTML = "A tecla " + texto.value + " = " + event.keyCode
})


let px = 0
let py = 0

document.addEventListener('keydown', function(event){
    let obj = document.querySelector('#div1')
    obj.style.position = 'absolute'
    let tecla =  event.keyCode

    if(tecla == 37){
        px -= 10
        obj.style.left = px + "px"
    } else if(tecla == 38){
        py -= 10
        obj.style.top = py + "px"
    } else if(tecla == 39){
        px += 10
        obj.style.left = px + "px"
    }else if(tecla == 40){
        py += 10
        obj.style.top = py + "px"
    }
})