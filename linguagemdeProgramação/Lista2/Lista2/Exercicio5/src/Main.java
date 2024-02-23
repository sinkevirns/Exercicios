//Elabore um programa que calcule a média de um aluno e imprima o
// conceito:•
// A se a média >= 8.5•
// B se a média >= 7 e média < 8.5•
// C se a média >= 5 e média < 7•
// D se a média < 5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        System.out.println("Hello world!");
        media = (nota1 + nota2)/2;
        System.out.println("Sua média é: " + media);
        if (media >= 8.5) {
            System.out.println("Nota A!");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("Nota B!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Nota C!");
        } else {
            System.out.println("Nota D!");
        }
    }
}