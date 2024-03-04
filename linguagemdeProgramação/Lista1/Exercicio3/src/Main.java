//Ler um número real e exibir a quinta parte deste número.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número:");
        n1 = in.nextDouble();
        result = n1/5;
        System.out.println("A quinta parte do número digitado é:" + result);
    }
}