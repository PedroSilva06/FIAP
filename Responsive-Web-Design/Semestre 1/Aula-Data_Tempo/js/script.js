
// Date() é a classe que retorna a data e hora da máquina do usuário
// let data = new Date()
// console.log(data);


// método getDate() extrai o dia da data
// let data = new Date().getDate()
// console.log(data);

//Usando o slice para pegar apenas os últimos 2 dígitos
// console.log(('0'+data).slice(-2));


// método getMonth retorna o mês
// let data = new Date().getMonth()+1
// console.log(data);

// método getFullYear para extrair o ano
// let data = new Date().getFullYear()
// console.log(data);

//método getDay retorna o dia da semana
// let data = new Date()
// let diasSemana = ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado']
// console.log(diasSemana[data.getDay()]);

//Setando um novo valor para o dia
// let data = new Date()
// console.log(data);
// data.setDate(data.getDate()+5)
// console.log(data);

//Setando um novo valor para o mês
// let data = new Date()
// console.log(data);
// data.setMonth(data.getMonth()+3)
// console.log(data);

//Setando um valor para o ano
// let data = new Date()
// console.log(data);
// data.setFullYear(data.getFullYear()+8)
// console.log(data);

// //Retorna a data no formato americano
// let data = new Date()
// console.log(data.toDateString());

// //Retorna a data no formato padrão do pais configurado no navegador
// console.log(data.toLocaleDateString());


//Montando uma data completa (Cabeçalho)
// let data = new Date()
// let dia = ('0'+data.getDate()).slice(-2)
// let mes = data.getMonth()
// let meses = ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro',]
// let ano = data.getFullYear()
// console.log("São Paulo, " + dia + " de " + meses[mes] + " de " + ano);


// //método getHours retorna a hora
// let data = new Date()
// console.log(data.getHours);

//Método getMinutes retorna os minutos
// let data = new Date()
// console.log(data.getMinutes);

//Método getSeconds retorna os segundoss
// let data = new Date()
// console.log(data.getSeconds);

//Setando um novo valor
// let data = new Date()
// console.log(data.getHours);
// data.setHours(data.getHours()+3)
// console.log(data.getHours());


//Setando um novo valor para os minutos
// let data = new Date()
// console.log(data.getMinutes());
// data.setMinutes(data.getMinutes()+15)
// console.log(data.getMinutes());

//Setando um novo valor
// let data = new Date()
// console.log(data.getSeconds());
// data.setSeconds(data.getSeconds()+15)
// console.log(data.getSeconds());

//Retorna a data e horário completo
// let data = new Date()
// console.log(data.toLocaleString());

// //Usando o slice para retornar só o horário
// console.log((data.toLocaleString()).slice(+8));

//***************************************************

//Configura um tempo de espera para executar a função
// function ola(){
//     alert('Olá pessoal, demorei?')
// }
// setTimeout(ola, 4000)


//Executa a função repetitivamente dentro de um intervalo de tempo

// function tempo(){
//     let relogio = document.querySelector('#div1')
//     let hora = new Date()
//     relogio.innerHTML = (hora.toLocaleString()).slice(-8)
// }
// setInterval(tempo, 1000)


// o clearInterval suspende a reprodução criada pelo seInterval
let tmp
function tempo(){
    let relogio = document.querySelector('#div1')
    let hora = new Date()
    relogio.innerHTML = (hora.toLocaleString()).slice(-8)
}
document.querySelector('#ligar').addEventListener('click',()=>{
    tmp = setInterval(tempo, 1000)
})

document.querySelector('#desligar').addEventListener('click',()=>{
    clearInterval(tmp)
})
