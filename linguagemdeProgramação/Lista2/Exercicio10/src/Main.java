import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int n3 = scanner.nextInt();
        if (n2 > n1 && n3 > n1 && n3 > n2) {
            System.out.println("A ordem crescente é: " + n1 + ", " + n2 + " e " + n3);
        }  else if (n2 > n1 && n2 > n3 && n1 < n3){
            System.out.println("A ordem crescente é: " + n1 + ", " + n3 + " e " + n2);
        } else if (n2 < n1 && n2 < n3 && n1 < n3){
            System.out.println("A ordem crescente é: " + n2 + ", " + n1 + " e " + n3);
        } else if (n3 < n1 && n3 > n2 && n1 > n2){
            System.out.println("A ordem crescente é: " + n2 + ", " + n3 + " e " + n1);
        } else if (n3 < n1 && n3 < n2 && n2 > n1){
            System.out.println("A ordem crescente é: " + n3 + ", " + n1 + " e " + n2);
        } else if (n3 < n1 && n3 < n2 && n2 < n1){
            System.out.println("A ordem crescente é: " + n3 + ", " + n2 + " e " + n1);
        }
        scanner.close();
    }
}