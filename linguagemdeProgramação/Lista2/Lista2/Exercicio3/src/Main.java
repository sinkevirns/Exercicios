//Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a médiafor menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double nota1, nota2, media;
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("A média é: " + media);
        if (media < 50) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Aprovado!");
        }
    }
}