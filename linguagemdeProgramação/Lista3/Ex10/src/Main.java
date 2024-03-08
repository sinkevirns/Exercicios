import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int aux;

        System.out.println("Digite o limite esperado na sequência de Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println(0);
        while (n2 < n){
            System.out.println(n2);
            aux=n1;
            n1=n2;
            n2=aux+n2;
        }
        scanner.close();
    }
}