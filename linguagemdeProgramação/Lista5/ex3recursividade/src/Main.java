import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        System.out.println("potencia: " + potencia(receber()));
    }

    static int receber()
    {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        return n1 + n2;
    }

    static int potencia(int n1, int n2)
    {
        if (n2 == 0) {
            return 1;
        } else {
            return n1 * potencia(n1, n2 - 1);
        }
    }
}