import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vector = {0,1,2,3,4,5,6,7,8,9};
        int value;
        boolean not_found = true;

        System.out.println("Digite um valor: ");
        value = in.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==value) {
                System.out.println("Valor " + value + " encontrado na " + (i+1) +"ª posição: ");
                not_found = false;
                break;
            }
        }
        if (not_found)
            System.out.println("Valor " + value + " não encontrado.");
    }
}