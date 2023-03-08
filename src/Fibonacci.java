import java.util.Scanner;

public class Fibonacci {
    long primeiro_termo=0, segundo_termo=1, variavel_auxiliar, termos;
    Scanner sc = new Scanner(System.in);
    public void Sequencia(){
        System.out.println("Digite a quantidade de termos da sequência de Fibonacci");
        termos = sc.nextInt();
        for(int i = 0; i<termos; i++){
            if(i == termos-1){
                System.out.print(primeiro_termo+".");
                break;
            }
            System.out.print(primeiro_termo + ", ");
            variavel_auxiliar = primeiro_termo + segundo_termo;
            primeiro_termo = segundo_termo;
            segundo_termo = variavel_auxiliar;
            
        }
    }
}
