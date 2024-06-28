public class Main {
    public static void main(String[] args) {
        int a11 = 1;
        int a12 = 9;
        int a13 = 5;
        int a21 = 3;
        int a22 = 7;
        int a23 = 8;
        int a31 = 10;
        int a32 = 4;
        int a33 = 2;
        int [] [] matriz = {{a11,a12,a13},
                            {a21,a22,a23},
                            {a31,a32,a33}};

        int diagonalPrincipal1 = a11 * a22 * a33;
        int diagonalPrincipal2 = a12 * a23 * a31;
        int diagonalPrincipal3 = a13 * a21 * a32;

        int diagonalPrincipal = diagonalPrincipal1 + diagonalPrincipal2 + diagonalPrincipal3;

        int diagonalSecundaria1 = a13 * a22 * a31;
        int diagonalSecundaria2 = a11 * a23 * a32;
        int diagonalSecundaria3 = a12 * a21 * a33;

        int diagonalSecundaria = diagonalSecundaria1 - diagonalSecundaria2 - diagonalSecundaria3;

        int determinante = diagonalPrincipal - diagonalSecundaria;

        System.out.println("Diagonal principal: " + diagonalPrincipal);
        System.out.println("Diagonal secundária " + diagonalSecundaria);
        System.out.println("Determinante: " + determinante);
    }
}