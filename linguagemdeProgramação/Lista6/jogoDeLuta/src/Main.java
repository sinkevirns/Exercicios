import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Player1");
        Personagem p2 = new Personagem("Player2");
        Personagem p3 = new Personagem("Player3");

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("Inicio da Rodada");
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            Random r = new Random();
            System.out.println("\nAtaque: ");
            // Ataque do p1
            int ataquep1 = r.nextInt(2);
            if (ataquep1 == 0) {
                p1.atacar(p2);
                System.out.println(p1.getNome() + " atacou " + p2.getNome());
            } else {
                p1.atacar(p3);
                System.out.println(p1.getNome() + " atacou " + p3.getNome());
            }
            // ataque do p2
            int ataquep2 = r.nextInt(2);
            if (ataquep2 == 0) {
                p2.atacar(p1);
                System.out.println(p2.getNome() + " atacou " + p1.getNome());
            } else {
                p2.atacar(p3);
                System.out.println(p2.getNome() + " atacou " + p3.getNome());
            }

            // ataque do p3
            int ataquep3 = r.nextInt(2);
            if (ataquep3 == 0) {
                p3.atacar(p2);
                System.out.println(p3.getNome() + " atacou " + p2.getNome());
            } else {
                p3.atacar(p1);
                System.out.println(p3.getNome() + " atacou " + p1.getNome());
            }
            System.out.println();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println("\nFim da Rodada ");
            System.out.println("--------------------------------------------------");

            if (p1.getVida() <= 0 || p2.getVida() <= 0 || p3.getVida() <= 0) {
                System.out.println("Um dos personagens morreu");
                if (p1.getVida() <= 0)
                    System.out.println(p1.getNome() + " F ");
                else if (p2.getVida() <= 0)
                    System.out.println(p2.getNome() + " F ");
                else
                    System.out.println(p3.getNome() + " F ");
                break;
            }
        }
    }
}