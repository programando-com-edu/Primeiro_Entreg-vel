import java.util.ArrayList;
import java.util.Scanner;

public class Contagem {
  
  public static int contarInteiros(ArrayList<Object> valores) {
    int contagem = 0;
    for (Object valor : valores) {
      if (valor instanceof Integer) {
        contagem++;
      } else if (valor instanceof Double) {
        Double doubleValor = (Double) valor;
        if (doubleValor == doubleValor.intValue()) {
          contagem++;
        }
      }
    }
    return contagem;
  }
  
  public static void Contar(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Object> valores = new ArrayList<>();
    System.out.println("Digite os valores (digite 'fim' para terminar):");
    while (true) {
      String entrada = sc.next();
      if (entrada.equals("fim")) {
        break;
      }
      try {
        double valor = Double.parseDouble(entrada);
        valores.add(valor);
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Digite um número ou 'fim' para terminar.");
      }
    }
    sc.close();
    int inteiros = contarInteiros(valores);
    System.out.println("O array contém " + inteiros + " valores inteiros.");
  }
  
}