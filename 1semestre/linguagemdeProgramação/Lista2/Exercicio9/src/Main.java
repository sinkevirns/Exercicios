import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida do primeiro lado:");
        double l1 = scanner.nextDouble();
        System.out.println("Digite a medida do segundo lado:");
        double l2 = scanner.nextDouble();
        System.out.println("Digite a medida do terceiro lado:");
        double l3 = scanner.nextDouble();
        if (l1 < l2 + l3 && l1 > l2 - l3) {
            System.out.println("Medidas válidas.");
            if (l1 == l2 && l1 == l3 && l2 == l3) {
                System.out.println("O triângulo é equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Medidas inválidas.");
            return;
        }
        scanner.close();
    }
}