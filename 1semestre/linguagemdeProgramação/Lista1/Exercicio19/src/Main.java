//Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução. Equação do segundo grau: $ax^2+bx+c=0$
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c,delta;
        System.out.println("Digite o coeficiente 'a':");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente 'b':");
        b = in.nextDouble();
        System.out.println("Digite o coeficiente 'c':");
        c = in.nextDouble();
        delta = b * b - 4 * a * c;
        System.out.println("O resultado da equação é:" + delta);
        if (delta > 0) {
            // Duas raízes reais distintas
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As soluções da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            // Raízes reais iguais
            double x = -b / (2 * a);
            System.out.println("A solução da equação é única: x = " + x);
        } else {
            // Raízes complexas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-delta) / (2 * a);
            System.out.println("As soluções da equação são: x1 = " + parteReal + " + " + parteImaginaria + "i e x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}