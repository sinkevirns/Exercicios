public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(5684, "Rafael");
        if (c1.depositar(100))
            System.out.println("Depósito realizado com sucesso. Saldo atual de: "  + c1.getSaldo());
        else
            System.out.println("Valor inválido");
        if (c1.sacar(13.40))
            System.out.println("Saque realizado com sucesso. Saldo atual de: " + c1.getSaldo());
        else
            System.out.println("Valor inválido");
        System.out.println(c1.toString());
    }
}