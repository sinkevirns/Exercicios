//Receber o raio e a altura de um cone e calcular seu volume.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double raio,altura,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio:");
        raio = in.nextDouble();
        System.out.println("Digite a altura:");
        altura = in.nextDouble();
        result = 3.14 * (raio*raio) * altura / 3;
        System.out.println("O volume é" + result);
    }
}