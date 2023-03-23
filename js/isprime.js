function isPrime(num) {
    // Um número menor que 2 não pode ser primo
    if (num < 2) {
      return false;
    }
  
    // Percorremos todos os números menores que num para verificar se é divisível
    for (let i = 2; i < num; i++) {
      // Se o número for divisível por algum outro número, não é primo
      if (num % i === 0) {
        return false;
      }
    }
  
    // Se nenhum número menor que num foi divisível, ele é primo
    return true;
  }