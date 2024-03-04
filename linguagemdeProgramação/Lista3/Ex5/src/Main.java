import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 1;
        System.out.println("Digite o número que deseja fatorar:");
        int n = scanner.nextInt();

        for (int x = 1; x <= n; x++) {
            f *= x;
            System.out.println(x + " = !" + f);
        }
    }
}