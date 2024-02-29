//Receba um número real e caso ele seja positivo imprima sua raiz quadrada, casocontrário imprima a mensagem: “Valor inválido!”
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, raiz;
        System.out.println("Digite o número:");
        n = scanner.nextDouble();
        raiz = Math.sqrt(n);
        if (n>0) {
            System.out.println("A raíz quadrada de " + n + " é: " + raiz);
        }
        else {
            System.out.println("O número é inválido!");
        }
    }
}