//Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução. Equação do primeiro grau: $ax + b = 0$
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,result;
        System.out.println("Digite o coeficiente 'a':");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente 'b':");
        b = in.nextDouble();
        result = -b / a;
        System.out.println("O resultado da equação é:" + result);
    }
}