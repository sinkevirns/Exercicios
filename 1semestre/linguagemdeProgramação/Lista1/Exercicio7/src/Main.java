//Ler uma medida em milímetro e converter para polegadas.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida em mm:");
        n1 = in.nextDouble();
        result = n1/25.4;
        System.out.println("O resultado em polegadas é:" + result);
    }
}