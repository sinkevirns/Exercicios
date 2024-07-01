import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1.Círculo");
        System.out.println("2.Triângulo Retângulo");
        System.out.println("3.Retângulo");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Informe o raio:");
                double raio = scanner.nextDouble();
                double resulta = 3.14 * (raio * raio);
                System.out.println("A área do círculo é = " + resulta);
                double resultp = (3.14 * 3.14) * raio;
                System.out.println("O perímetro do círculo é = " + resultp);
                break;
            case 2:
                System.out.println("Informe a base:");
                double base = scanner.nextDouble();
                System.out.println("Informe a altura:");
                double altura = scanner.nextDouble();
                resulta = (base * altura) / 2;
                System.out.println("A área do triângulo retângulo é: " + resulta);
                System.out.println("Informe os lados:");
                double lado1 = scanner.nextDouble();
                double lado2 = scanner.nextDouble();
                double lado3 = scanner.nextDouble();
                resultp = lado1 + lado2 + lado3;
                System.out.println("O perímetro do triângulo retângulo é " + resultp);
            case 3:
                System.out.println("Informe a base:");
                base = scanner.nextDouble();
                System.out.println("Informe a altura:");
                altura = scanner.nextDouble();
                resulta = base * altura;
                System.out.println("A base do retângulo é: " + resulta);
                System.out.println("Informe os lados:");
                lado1 = scanner.nextDouble();
                lado2 = scanner.nextDouble();
                lado3 = scanner.nextDouble();
                double lado4 = scanner.nextDouble();
                resultp = lado1 + lado2 + lado3 + lado4;
                System.out.println("O perímetro do retângulo é " + resultp);
                scanner.close();
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}