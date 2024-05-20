import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println("Digite dois números: ");
        int[] numeros = receber();
        int n1 = numeros[0];
        int n2 = numeros[1];
        System.out.println("potencia: " + potencia(n1, n2));
    }

    static int[] receber() {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        return new int[]{n1, n2};  // Retorna os valores como um array de inteiros
    }

    static int potencia(int n1, int n2) {
        if (n2 == 0) {
            return 1;
        } else {
            return n1 * potencia(n1, n2 - 1);
        }
    }
}
