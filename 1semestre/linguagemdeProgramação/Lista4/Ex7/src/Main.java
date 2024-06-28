import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int somaAtualColunas;
        int somaAtualLinhas;
        int maiorSomaLinhas = 0;
        int maiorSomaColunas = 0;
        int [][] numbers = new int [5][5];

        System.out.println("Insira os elementos da matriz 5x5:");
        for(int i=0;i< numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                numbers[i][j] = in.nextInt();
            }
            System.out.println();
        }
        for (int j = 0; j < numbers.length; j++) {
            somaAtualColunas = 0;
            for (int i = 0; i < numbers[0].length; i++) {
                somaAtualColunas += numbers[i][j];
            }
            if (somaAtualColunas > maiorSomaColunas) {
                maiorSomaColunas = somaAtualColunas;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            somaAtualLinhas = 0;
            for (int j = 0; j < numbers[0].length; j++) {
                somaAtualLinhas += numbers[i][j];
            }
            if (somaAtualLinhas > maiorSomaLinhas) {
                maiorSomaLinhas = somaAtualLinhas;
            }
        }
        System.out.println("A maior soma de linhas é: " + maiorSomaLinhas);
        System.out.println("A maior soma de colunas é: " +maiorSomaColunas);
    }
}