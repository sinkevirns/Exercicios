//Em um sistemas de caixa eletrônico o usuário deve escolher entre
// as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive.
// Crie um algoritmo que validea entrada do usuário exibindo a opções escolhida
// ou a mensagem de opção inválida casoo usuário entre com um número fora do range
// estabelecido.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um número entre 5 e 9:");
        n = scanner.nextInt();
        if (n >= 5 && n <= 9) {
            System.out.println("Opção válida!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}