import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;
        boolean eprimo=true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = in.nextLong();
        }while(n<0);
        if(n==1)
            eprimo=false;
        for(long i=n/2;i>1;i--){
            if(n%i==0) {
                eprimo = false;
                break;
            }
        }
        if(eprimo)
            System.out.println("O número "+n+" é primo");
        else
            System.out.println("O número "+n+" não é primo");
    }
}