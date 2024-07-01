//O usuário entra com dois números inteiros e o programa indica qual o maior.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite o primeiro número:");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scanner.nextDouble();
        if (n1 > n2) {
            System.out.println("O primeiro número é maior!");
        }
        else {
            System.out.println("O segundo número é maior!");
        }
    }
}