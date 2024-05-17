import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Vermelho",1000);
        Carro c2 = new Carro("Azul",1500, 5);

        Random r = new Random();

        for(int i=0;i<=r.nextInt(100);i++)
            c1.acelerar();

        for(int i=0;i<=r.nextInt(100);i++)
            c2.acelerar(5);

        System.out.println(c1);
        System.out.print("Força: ");
        System.out.println(Fisica.calcularForca(c1.getPeso(),c1.getAceleracao()));
        System.out.print("Velocidade: ");
        System.out.println(Fisica.calcularVelocidade(c1.getAceleracao(),10));

        System.out.println(c2);
        System.out.print("Força: ");
        System.out.println(Fisica.calcularForca(c2.getPeso(),c2.getAceleracao()));
        System.out.print("Velocidade: ");
        System.out.println(Fisica.calcularVelocidade(c2.getAceleracao(),10));
    }
}