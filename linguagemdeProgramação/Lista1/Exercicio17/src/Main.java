//Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double v0,a,t,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");
        v0 = in.nextDouble();
        System.out.println("Digite a aceleração:");
        a = in.nextDouble();
        System.out.println("Digite o tempo de percurso:");
        t = in.nextDouble();
        result = v0 + (a*t);
        System.out.println("A velocidade é:" + result);
    }
}