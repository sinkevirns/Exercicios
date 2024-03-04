import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int np = scanner.nextInt();
        String resposta;
        do {
            if (np == 2) {
                System.out.println("O número 2 é primo.");
            } else if (np > 1 && np / np == 1 && np / 1 == np && np % 2 == 1) {
                System.out.println("O número " + np + " é primo.");
            } else {
                System.out.println("O número " + np + " não é primo.");
            }
            System.out.println("Programa encerrado.");
        } while (scanner.nextInt() == np);
        scanner.close();
    }
}