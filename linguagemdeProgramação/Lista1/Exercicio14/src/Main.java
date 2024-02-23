//Receber a base e a altura de um triângulo retângulo e calcular sua área.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double base,altura,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base:");
        base = in.nextDouble();
        System.out.println("Digite a altura:");
        altura = in.nextDouble();
        result = (base * altura) /2;
        System.out.println("A área é:" + result);
    }
}