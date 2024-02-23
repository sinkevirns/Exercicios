import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número de 1-7:");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("O dia da semana correspondente é Domingo");
                break;
            case 2:
                System.out.println("O dia da semana correspondente é Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia da semana correspondente é Terça-Feira");
                break;
            case 4:
                System.out.println("O dia da semana correspondente é Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia da semana correspondente é Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia da semana correspondente é Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia da semana correspondente é Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}