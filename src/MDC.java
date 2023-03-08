import java.util.Scanner;

public class MDC {
    int primeiro_numero, segundo_numero, mdc=1;
    Scanner sc = new Scanner(System.in);
    public void Divisor(){
        System.out.println("Digite o primeiro número:");
        primeiro_numero = sc.nextInt();
        System.out.println("Digite o segundo número:");
        segundo_numero = sc.nextInt();
        for(int i=1; i<primeiro_numero; i++){
            if((primeiro_numero%i==0) && (segundo_numero%i ==0)){
                    mdc = i;
            }
        }
        System.out.println("O valor do mdc de " + primeiro_numero +" e "+ segundo_numero +" é " + mdc);
    }
}
