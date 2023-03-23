let entradas = prompt("Digite várias entradas, separadas por vírgulas:");

let numeros = entradas.split(",").filter(x => Number.isInteger(Number(x)));

console.log(`Você digitou ${numeros.length} números inteiros: ${numeros.join(", ")}`);