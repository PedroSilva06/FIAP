function calcular(){
    let form = document.getElementById("formulario");	
    let nome  	= form.nome.value;
    let idade  	= form.idade.value;
    let peso  	= +form.peso.value;
    let altura 	= +form.altura.value;
     
    var imc = peso / (altura * altura);
    
    form.imc.value = imc.toFixed(2);
    
    if(imc < 18.5)
    {
        alert("Nome: " + nome + "\nIdade: " + idade +  "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nVocê esta abaixo do peso!");
    } 
    else if(imc >=18.5 && imc < 25)
    {
        alert("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nPeso Ideal");
    }
    else if(imc >=25 && imc < 30)
    {
        alert("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nSobrepeso");
    }
    else if(imc >=30 && imc < 35)
    {
        alert("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nObesidade I");
    }
    else if(imc >=35 && imc < 40)
    {
        alert("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nObesidade II");
    }
    else if(imc >40)
    {
        alert("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nO seu IMC é: " + imc.toFixed(2) + "\nObesidade III");
    }
    
}

