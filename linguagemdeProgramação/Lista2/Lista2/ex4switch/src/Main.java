import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o valor da compra:");
        Scanner scanner = new Scanner(System.in);
        double compra = scanner.nextDouble();
        System.out.println("O valor da compra é " + "R$" + compra);
        System.out.println("Menu:");
        System.out.println("1.Débito");
        System.out.println("2.Pix");
        System.out.println("3.Crédito");
        System.out.println("Escolha a forma de pagamento:");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Débito selecionado");
                double debito = compra - (compra * 0.05);
                System.out.println("Valor final da compra:" + debito);
                break;
            case 2:
                System.out.println("Pix selecionado");
                double pix = compra - (compra * 0.10);
                System.out.println("Valor final da compra:" + pix);
            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas:");
                double parcelas = scanner.nextDouble();
                if (parcelas <= 4) {
                    double credito = compra + (compra * 0.02) * parcelas;
                    System.out.println("Valor final da compra:" + credito);
                } else {
                    double credito = compra + (compra * 0.05) * parcelas;
                    System.out.println("Valor final da compra: " + credito);
                }
                scanner.close();
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}