import java.util.Scanner;
public class Recursividade {
    public static void main(String[] args) {
        System.out.println("Soma = "+somar(receber()));
        System.out.println("!= "+fatorial(receber()));
    }
    static int receber(){
        int n;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um numero maior que 0");
            n=in.nextInt();
        }while(n<=0);
        return n;
    }
    static int somar(int n){
        if (n==1)
            return 1;
        return n+somar(n-1);
    }
    static int fatorial(int n){
        if (n==1)
            return 1;
        return n*fatorial(n-1);
    }
}

