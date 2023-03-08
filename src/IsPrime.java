import java.util.Scanner;

public class IsPrime {
    Scanner sc = new Scanner(System.in);
    int numero, contador = 0;
    public void Primo(){
        System.out.println("Digite o número");
        numero = sc.nextInt();
        for(int i = 2; i<numero; i++){
            if(numero%i == 0){
                contador++;
            }
        }
        if(contador>0){
            System.out.println("O número não é primo");
        }
        else{
            System.out.println("O número é primo");
        }  
    }
}
