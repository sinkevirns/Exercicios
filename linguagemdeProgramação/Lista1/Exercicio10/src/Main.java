//Ler uma medida de distância em milhas e converter para quilômetros.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância em milhas:");
        n1 = in.nextDouble();
        result = n1/0.621371;
        System.out.println("O resultado em quilômetros é:" + result);
    }
}