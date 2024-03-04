import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o dinheiro:");
        Scanner scanner = new Scanner(System.in);
        double dinheiro = scanner.nextDouble();
        System.out.println("O dinheiro inserido é " + "R$" + dinheiro);
        System.out.println("1.Café Expresso R$0,50");
        System.out.println("2.Café Longo R$1,00");
        System.out.println("3.Capuccino R$2,50");
        System.out.println("4.Chocolate R$2,00");
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Bebida selecionada: Café Expresso R$0,50");
                double troco = dinheiro - 0.50;
                System.out.println("Seu troco: " + "R$" + troco);
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo R$1,00");
                troco = dinheiro - 1.00;
                System.out.println("Seu troco: " + "R$" + troco);
            case 3:
                System.out.println("Bebida selecionada: Capuccino R$2,50");
                troco = dinheiro - 2.50;
                System.out.println("Seu troco: " + "R$" + troco);
            case 4:
                System.out.println("Bebida selecionada: Chocolate R$2,00");
                troco = dinheiro - 2.00;
                System.out.println("Seu troco: " + "R$" + troco);
                scanner.close();
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}