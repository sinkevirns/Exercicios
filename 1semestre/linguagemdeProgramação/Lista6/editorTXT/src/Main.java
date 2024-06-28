import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arquivo a1 = new Arquivo();
        String continuar;
        boolean cont;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Esqcolha uma opção: ");
            int esc;
            do {
                System.out.println(" Digite 1 para Abrir\n Digite 2 para editar\n Digite 3 para renomear\n Digite 4 para limpar");
                esc = scanner.nextInt();
                scanner.nextLine();

                switch (esc) {
                    case 1:
                        a1.abrir();
                        break;
                    case 2:
                        a1.editar();
                        break;
                    case 3:
                        a1.renomear();
                        break;
                    case 4:
                        a1.limpar();
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                }
            } while (esc > 4 || esc < 1);

            System.out.println("Deseja continuar? S/N ");
            continuar = scanner.nextLine();
            if (continuar.equals("S") || continuar.equals("s"))
                cont = true;
            else
                cont = false;

        } while (cont);
    }
}
