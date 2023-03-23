function Sequencia() {
    let primeiro_termo = 0;
    let segundo_termo = 1;
    let variavel_auxiliar, termos;
  
    termos = parseInt(prompt("Digite a quantidade de termos da sequência de Fibonacci"));
  
    let sequencia = [primeiro_termo, segundo_termo];
  
    for(let i = 2; i < termos; i++){
        variavel_auxiliar = primeiro_termo + segundo_termo;
        sequencia.push(variavel_auxiliar);
        primeiro_termo = segundo_termo;
        segundo_termo = variavel_auxiliar;
    }
  
    alert(`A sequência de Fibonacci é: ${sequencia}`);
  }


  Sequencia();