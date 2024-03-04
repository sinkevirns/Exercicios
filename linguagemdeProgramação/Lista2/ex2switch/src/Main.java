import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1 = scanner.nextDouble();
        System.out.println("Digite outro número:");
        double n2 = scanner.nextDouble();
        System.out.println("Menu:");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                double result = n1 + n2;
                System.out.println("Resultado" + n1 + " + " + n2 + " = " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Resultado" + n1 + " - " + n2 + " = " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Resultado" + n1 + " * " + n2 + " = " + result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println("Resultado" + n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}