//Descobrir uma equação do segundo grau a partir de suas raízes
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x1,x2;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a primeira raiz (x1): ");
        x1 = in.nextDouble();
        System.out.print("Digite a segunda raiz (x2): ");
        x2 = in.nextDouble();
        encontrarEquacao(x1, x2);
    }

    public static void encontrarEquacao(double x1, double x2) {
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("A equação do segundo grau é: ");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Onde:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    }
