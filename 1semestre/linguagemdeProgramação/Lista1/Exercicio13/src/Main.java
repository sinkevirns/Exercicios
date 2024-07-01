//Receber o raio de um círculo e calcular sua área.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio:");
        n1 = in.nextDouble();
        result = 3.14 * (n1*n1);
        System.out.println("A área é:" + result);
    }
}