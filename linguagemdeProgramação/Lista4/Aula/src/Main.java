/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        //int [] numeros = {1,9,6,7};
        Scanner in = new Scanner(System.in);
        int [] numeros = new int [5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número " +(i+1)+"/5:");
            numeros[i] = in.nextInt();
        }
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
} */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1,2,3,4},
                            {5,6,7,8},
                            {5,6,7,8}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+", ");
            }
            System.out.println(" ");
        }
        //matriz.length quantidade de linhas
        //matriz[0].length quantidade de colunas
    }
}
