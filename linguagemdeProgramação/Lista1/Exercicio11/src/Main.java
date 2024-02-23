//Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        n1 = in.nextDouble();
        result = (n1 * 9/5) + 32;
        System.out.println("O resultado em Fahrenheit é:" + result);
    }
}