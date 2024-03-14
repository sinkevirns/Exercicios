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
/*

        int [] [] matriz = {{1,2,3,4},
                            {5,6,7,8},
                            {5,6,7,8}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+", ");
            }
            System.out.println(" ");
        }
      public class Main {
    public static void main(String[] args) {  //matriz.length quantidade de linhas
        //matriz[0].length quantidade de colunas
    }
}
*/
/*Ex2
public class Main {
    public static void main(String[] args) {
        int[] vector = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < vector.length; i++) {
            if (i%2==0)
                vector[i] += 2;
            else
                vector[i]*=2;

            System.out.println(vector[i]);
        }
    }
}
*/

/*
//Ex3
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
*/

/*
//Ex4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vector = new int[10];
        int [] bigger = new int[2];
        int [] smaller = new int[2];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vector[i] = in.nextInt();
        }
        bigger[0] = vector[0];
        smaller[0] = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > bigger[0]){
                bigger[0] = vector[i];
            bigger[1] = i;
            }
            if (vector[i]<smaller[0]){
                smaller[0]=vector[i];
                smaller[1]= i;
            }
        }
        System.out.println("Maior valor = " + bigger[0] + " na " + (bigger[1] + 1) + "ª posição.");
        System.out.println("Menor valor = " + smaller[0] + " na " + (smaller[1] + 1) + "ª posição.");
    }
}
*/
/*
//Ex5
public class Main {
    public static void main(String[] args) {

        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int [] rotcev = new int [vector.length];

        for (int i = 0; i < vector.length; i++) {
            rotcev[(vector.length-1)-i]=vector[i];
        }
        for (int n : vector) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : rotcev) {
            System.out.print(n + " ");
        }
    }
}
*/
/*
//Ex6
public class Main {
    public static void main(String[] args) {
        int [] vector = {10,20,30,40,50,60,70,80,90,100};
        int aux;

        for (int n: vector) {
            System.out.print(n + " ");
        }

        for(int i=0;i<vector.length/2;i++){
            aux=vector[i];
            vector[i]=vector[(vector.length-1)-i];
            vector[(vector.length-1)-i]=aux;
        }

        System.out.println();
        for (int n: vector) {
            System.out.print(n + " ");
        }
    }
}
*/
//Ex7
public class Main {
    public static void main(String[] args) {
        int [][] matrix = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        int column_sum, line_sum,biggest_column_sum, biggest_line_sum;
        biggest_line_sum=0;
        biggest_column_sum=0;

        for(int i=0;i<matrix.length;i++){
            column_sum=0;
            line_sum=0;
            for(int j=0;j<matrix[0].length;j++){
                line_sum+=matrix[i][j];
                column_sum+=matrix[j][i];
            }
            if(i==0){
                biggest_column_sum=column_sum;
                biggest_line_sum=line_sum;
            }else{
                if(column_sum>biggest_column_sum)
                    biggest_column_sum=column_sum;
                if(line_sum>biggest_line_sum)
                    line_sum=biggest_line_sum;
            }
        }
        System.out.println("Maior linha = " + biggest_line_sum);
        System.out.println("Maior coluna = " + biggest_column_sum);

    }
}