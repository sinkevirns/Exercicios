//Ler um número inteiro e exibir o seu dobro.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número inteiro:");
        n1 = in.nextInt();
        result = 2*n1;
        System.out.println("O dobro do número digitado é:" + result);
    }
}