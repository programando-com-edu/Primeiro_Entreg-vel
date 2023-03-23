function MDC() {
    let primeiro_numero = parseInt(prompt("Digite o primeiro número:"));
    let segundo_numero = parseInt(prompt("Digite o segundo número:"));
  
    let mdc = 1;
    for(let i = 1; i <= primeiro_numero; i++) {
      if(primeiro_numero % i === 0 && segundo_numero % i === 0) {
        mdc = i;
      }
    }
  
    alert(`O valor do MDC de ${primeiro_numero} e ${segundo_numero} é ${mdc}`);
  }