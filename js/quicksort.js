function QuickSort() {
    let tamanho = parseInt(prompt("Digite o tamanho do array:"));
    let numeros = [];
  
    for (let i = 0; i < tamanho; i++) {
      let numero = parseInt(prompt("Digite um número:"));
      numeros.push(numero);
    }
  
    quickSort(numeros, 0, tamanho - 1);
  
    alert(`O array ordenado é: ${numeros}`);
  }
  
  function quickSort(numeros, esquerda, direita) {
    if (esquerda < direita) {
      let pivot = partition(numeros, esquerda, direita);
      quickSort(numeros, esquerda, pivot - 1);
      quickSort(numeros, pivot + 1, direita);
    }
  }
  
  function partition(numeros, esquerda, direita) {
    let pivot = numeros[direita];
    let i = esquerda - 1;
  
    for (let j = esquerda; j < direita; j++) {
      if (numeros[j] < pivot) {
        i++;
        swap(numeros, i, j);
      }
    }
  
    swap(numeros, i + 1, direita);
  
    return i + 1;
  }
  
  function swap(numeros, i, j) {
    let temp = numeros[i];
    numeros[i] = numeros[j];
    numeros[j] = temp;
  }
  quickSort();