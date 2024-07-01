import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os coeficientes da equação ax^2 + bx + c = 0:");
        System.out.println("Coeficiente A");
        double a = scanner.nextDouble();
        System.out.println("Coeficiente B");
        double b = scanner.nextDouble();
        System.out.println("Coeficiente C");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0){
            double x = -b / (2 * a);
            System.out.println("A raiz dupla é: x = " + x);
        } else {
            System.out.println("Não existem raízes reais para esta equação.");
        }
        scanner.close();
    }
}