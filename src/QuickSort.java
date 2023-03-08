import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
  
  public static void Organizar(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o tamanho do array: ");
    int n = sc.nextInt();
    int[] numeros = new int[n];
    System.out.println("Digite os elementos do array: ");
    for (int i = 0; i < n; i++) {
      numeros[i] = sc.nextInt();
    }
    sc.close();
    quickSort(numeros, 0, n - 1);
    System.out.println("Array ordenado: " + Arrays.toString(numeros));
  }
  
  public static void quickSort(int[] numeros, int esquerda, int direta) {
    if (esquerda < direta) {
      int pivot = partition(numeros, esquerda, direta);
      quickSort(numeros, esquerda, pivot - 1);
      quickSort(numeros, pivot + 1, direta);
    }
  }
  
  public static int partition(int[] array, int left, int right) {
    int pivot = array[right]; // O pivô é o último elemento do array
    int i = left - 1; // Índice do menor elemento
    for (int j = left; j < right; j++) {
      if (array[j] < pivot) {
        i++;
        swap(array, i, j); // Troca o elemento i pelo elemento j
      }
    }
    swap(array, i + 1, right); // Coloca o pivô no lugar correto
    return i + 1;
  }
  
  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  
}