//Ler uma velocidade em m/s e converter para km/h.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade em m/s:");
        n1 = in.nextDouble();
        result = n1*3.6;
        System.out.println("O resultado em Km/h é:" + result);
    }
}