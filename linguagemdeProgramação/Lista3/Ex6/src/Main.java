import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números em ordem crescente e descubra todos os números existentes entre eles:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Os números entre " + n1 + " e " + n2 + " são: ");
        while (n1 <= n2) {
            System.out.println(n1);
            n1++;
        }
    }
}