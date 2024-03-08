import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 1;
        System.out.println("Digite o número que deseja fatorar:");
        int n = scanner.nextInt();

            for (int i = n; i > 1; i--)
                f = f * i;
            System.out.println(n + " = !" + f);

    }
}