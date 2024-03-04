//Ler uma velocidade em Km/h e converter para m/s.
import java.util.*;
public class Main {
    public static void main(String[] args) {
    double n1,result;
    Scanner in = new Scanner(System.in);
    System.out.println("Digite a velocidade em Km/h:");
    n1 = in.nextDouble();
    result = n1/3.6;
    System.out.println("O resultado em m/s é:" + result);
    }
}