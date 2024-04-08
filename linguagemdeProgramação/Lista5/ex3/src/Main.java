import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(potencia(n1,n2));
    }

    static int potencia(int n1, int n2)
    {
        int resultado = 1;
        while (n2 != 0)
        {
            resultado = resultado * n1;
            n2--;
        }
        System.out.print("Resultado = ");
        return resultado;
    }
}