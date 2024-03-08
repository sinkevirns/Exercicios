import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maior, menor, n;
        maior = 0;
        menor = 0;

        Scanner in = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Digite o "+(i+1)+"º número:");
            n = in.nextInt();
            if(i==0){
                maior = n;
                menor = n;
            } else {
                if(n > maior){
                    maior = n;
                }
                if(n < menor){
                    menor = n;
                }
            }
        }
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}


