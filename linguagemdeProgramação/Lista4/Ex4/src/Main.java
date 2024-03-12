import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] maior = new int[1];
        int[] menor = new int[]{0};
        int[] n;
        int i;
        int posMaior = 0;
        int posMenor = 0;

        do {
            for (i = 0; i < 10; i++) {
                System.out.println("Digite o " + (i + 1) + "º número:");
                n = new int[]{in.nextInt()};

                if (i == 0) {
                    maior = n;
                    menor = n;
                } else {
                    if (n[0] > maior[0]) {
                        maior = n;
                        posMaior = i;
                    }
                    if (n[0] < menor[0]) {
                        menor = n;
                        posMenor = i;
                    }
                }
            }
        } while (i < 10);

        System.out.print("O maior número digitado é " + maior[0] + " na posição " + (posMaior + 1) + "\nO menor número digitado é " + menor[0] + " na posição " + (posMenor + 1));
    }
}
