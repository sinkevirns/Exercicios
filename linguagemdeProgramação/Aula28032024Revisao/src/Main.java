/*Matriz (Ex. 8, Lista 4)
        - Diagonal Principal
        m = [3, 1, 3]
            [2, 4, 1]
            [1, 2, 2] -> 3, 4, 2
*/
public class Main {
    public static void main(String[] args) {
        int [][]matriz={{1,2,1},
                        {3,2,2},
                        {1,1,3}};
        diagonalPrincipal(matriz);
        System.out.println();
        diagonalSecundaria(matriz);
        System.out.println();
        int resultado = determinante(matriz);
        System.out.println("Determinante = " + resultado);
    }
    static void diagonalPrincipal(int [][]m){
        if (m.length == m[0].length)
            for (int i = 0; i < m.length; i++)
                System.out.print(m[i][i] + " ");
        else
            System.out.println("A matriz não é quadrada!");
    }

    static void diagonalSecundaria(int [][]m){
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][m[0].length-1-i] + " ");
        }
    }

    static int determinante(int [][]m){
        int contadorPositivo, multiplicacaoPositiva, somaPositiva = 0, contadorNegativo, multiplicacaoNegativo, somaNegativa = 0;
        for (int i = 0; i < m.length; i++) {
            contadorPositivo = i;
            contadorNegativo = i;
            multiplicacaoPositiva = 1;
            multiplicacaoNegativo = 1;
            for (int j = 0; j < m.length; j++) {
                multiplicacaoPositiva *= m[j][contadorPositivo];
                multiplicacaoNegativo *= m[j][contadorNegativo];
                contadorPositivo++;
                contadorNegativo--;
                if (contadorPositivo > m.length - 1)
                    contadorPositivo = 0;
                if (contadorNegativo > 0)
                    contadorNegativo = m.length - 1;
            }
            somaPositiva += multiplicacaoPositiva;
            somaNegativa += multiplicacaoNegativo;
        }
        return somaPositiva - somaNegativa;
    }
}