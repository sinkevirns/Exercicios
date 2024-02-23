//Receber o raio e a altura de um cilindro e calcular seu volume.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double raiodabase,altura,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio:");
        raiodabase = in.nextDouble();
        System.out.println("Digite a altura:");
        altura = in.nextDouble();
        result = 3.14 * (raiodabase * raiodabase) * altura;
        System.out.println("O volume é:" + result);
    }
}