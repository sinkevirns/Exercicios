import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas e colunas da 1ª matriz: ");
        int linhaMatriz1 = in.nextInt();
        int colunaMatriz1 = in.nextInt();
        int[][] matriz1 = new int [linhaMatriz1][colunaMatriz1];

        System.out.println("Insira a quantidade de linhas e colunas da 2ª matriz: ");
        int linhaMatriz2 = in.nextInt();
        int colunaMatriz2 = in.nextInt();
        int[][] matriz2 = new int [linhaMatriz2][colunaMatriz2];

        if (matriz1[0].length != matriz2.length) {
            System.out.println("Não é possível realizar a multiplicação das matrizes.");
            return;
        }

        int[][] resultado = new int[matriz1.length][matriz2[0].length];

        System.out.println("Insira os elementos da primeira matriz " + linhaMatriz1 + "x" + colunaMatriz1 + ":");
        for (int i = 0; i < linhaMatriz1; i++) {
            for (int j = 0; j < colunaMatriz1; j++) {
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.println("Insira os elementos da segunda matriz " + linhaMatriz2 + "x" + colunaMatriz2 + ":");
        for (int i = 0; i < linhaMatriz2; i++) {
            for (int j = 0; j < colunaMatriz2; j++) {
                matriz2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}