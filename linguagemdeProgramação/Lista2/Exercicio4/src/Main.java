//Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média.
// Se a média for maior ou igual a 50, exibir “Aprovado”, caso contrário
// solicitar ao usuário a nota da prova de recuperação, tirar nova média entre
// a média anterior e a prova de recuperação,se a nova média for menor que 50
// exibir “Reprovado” caso contrário exibir “Aprovado”.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double nota1, nota2, media, nota3, media2;
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("A média é: " + media);
        if (media >= 50) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado! Digite a nota da recuperação");
            nota3 = scanner.nextDouble();
            media2 = (media + nota3)/2;
            if (media2 >= 50) {
                System.out.println("Aprovado!");
            }
            else {
                System.out.println("Reprovado!");
            }
        }
    }
}