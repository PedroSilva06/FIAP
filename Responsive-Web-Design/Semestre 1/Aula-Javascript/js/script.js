alert("Agora sim estou em um arquivo separado!")


//Comenta uma linha
/*
Comenta várias linhas
*/

//Escreve no documento
document.write("Agora sim")

//Escreve no console do navegador
console.log("Este codigo aparece no console do navegador")

let nome = "Pedro Silva" //String
console.log(nome);
console.log(typeof nome);

let numero = 45 //int
console.log(numero);
console.log(typeof numero);

let numero2 = 123.4567 //float
console.log(numero2);
console.log(typeof numero2);

let casado = false //boolean
console.log(casado);
console.log(typeof casado);

let carros = ['Onix', 'Polo', 'HB20', 'Cronos']
console.log(carros);
console.log(typeof carros);
console.log(carros[1]);

let carro = {
    cor:"Preta",
    numPortas: 4,
    tipo: "sedan",
    modelo:"Onix",
    Marca:"GM",
    correr: function(){
        alert("Estou correndo")
    }
}

console.log(carro);
console.log(typeof carro);
console.log(carro.cor);

//carro.correr()

let teste = "Turma H"
console.log(teste);

teste = 150
console.log(teste);

let numFloat = 123.5641
console.log(parseInt(numFloat));

let numString = "545.54";

console.log(parseFloat(numString));

console.log(numFloat.toString());

let pedido = 'Quero um copo d\'água'
console.log(pedido);
console.log(pedido.length);

let txt = "Estão chegando as provas"
console.log(txt.indexOf("as"));

console.log(txt.lastIndexOf("as"));

console.log(txt.slice(0,5));

console.log(txt.substr(6,8));

console.log(txt.replace("provas","avaliações"));

console.log(txt.toUpperCase());

console.log(txt.toLowerCase());

console.log(numFloat.toFixed(2));

console.log(numFloat.toPrecision(4));

console.log(5 + 4);
console.log(5 - 4);
console.log(5 * 4);
console.log(5 / 4);
console.log(5 % 4);
console.log(5 ** 4);

// let confirmacao = confirm("Você estuda na FIAP?")

// console.log(confirmacao);

// let pergunta = prompt("Qual o seu nome?" , "Digite o seu nome aqui")

// console.log(pergunta);

if(false) {
    console.log("O if funcionou");

} else {
    console.log("Não funcionou");
}

let caso1 = "50"
let caso2 = 50

if(caso1 == caso2) {
    console.log("Passou!");
}
if (caso1 === caso2 || caso1 == caso2){
    console.log("É igual")
} else {
    console.log("Não é igual")
}

for(let i=0; i < 10; i++){
    console.log("Volta", i)
}

let frutas = ['Maça' , 'Uva', 'Pera', 'Laranja']

for(let i=0 ; i < frutas.length; i++) {
    console.log(frutas[i]);
}

for(let fruta of frutas){
    console.log(fruta);
}

function somar(n1, n2){
    return n1 + n2
}

console.log(somar(7,3));

function avisar(){
    alert("Esta é uma função")
}

let exemplo = function(){
    alert("Outro exemplo")
}

let titulo = document.getElementById("titulo")
console.log(titulo);
console.log(typeof titulo);
console.log(titulo.innerHTML);
titulo.style.color = "red";

let titulo1 = document.querySelector("#titulo") //uma ocorrência
console.log(titulo1);

document.querySelectorAll(".corredor")[0].style.color = "blue"
document.querySelectorAll(".corredor")[1].style.color = "green"
document.querySelectorAll(".corredor")[2].style.color = "orange"

document.querySelector(".corredor").style.backgroundColor = "yellow" // background-color

                                        