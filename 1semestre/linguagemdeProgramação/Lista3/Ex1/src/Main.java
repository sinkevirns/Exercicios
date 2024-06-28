import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o número que deseja calcular a tabuada:");
        int n = scanner.nextInt();

        for (int t = 0; t <= 10; t++) {
            System.out.println(n*t);
        }
    }
}