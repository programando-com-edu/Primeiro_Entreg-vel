import java.util.Scanner;

public class Somador {
    int num, n, soma=0, i=0;
    Scanner sc;
    public void Soma(){
        //quantidade de números somados
        sc = new Scanner(System.in);
        System.out.println("Digite quantos números serão somados:");
        n = sc.nextInt();
        //somador
        while(i<n){
            i++;
            sc = new Scanner(System.in);
            System.out.println("Digite o " + i + " número: ");
            num = sc.nextInt();
            soma += num;
        }
        //resultado
        System.out.println("O valor total somado foi de: "+ soma);
    }
}
