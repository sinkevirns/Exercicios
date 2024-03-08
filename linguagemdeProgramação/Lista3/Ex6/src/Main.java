import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int n2 = scanner.nextInt();

        System.out.println("Os números entre " + n1 + " e " + n2 + " são: ");
        if (n1 > n2) {
            int aux = n1;
            n1=n2;
            n2=aux;
        }

        for (int i = n1; i <= n2 ; i++) {
            System.out.println(i);
        }
    }
}