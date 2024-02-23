//Ler uma medida de distância em quilômetros e converter para milhas.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância em quilômetros:");
        n1 = in.nextDouble();
        result = n1*0.621371;
        System.out.println("O resultado em milhas é" + result);
    }
}