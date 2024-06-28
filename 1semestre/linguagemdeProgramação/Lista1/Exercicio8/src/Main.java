//Ler uma medida em polegadas e converter para milímetros.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida em polegadas:");
        n1 = in.nextDouble();
        result = n1*25.4;
        System.out.println("O resultado em mm é:" + result);
    }
}