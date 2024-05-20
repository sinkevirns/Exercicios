public class ContaBancaria {

    //Atributos
    private int numero;
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(int numero, String titular){
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }

    //Métodos
    public boolean depositar(double valor){
        if (valor<=0)
            return false;
        this.saldo+=valor;
        return true;
    }
    public boolean sacar(double valor){
        if (valor<=0 || valor>this.saldo)
            return false;
        this.saldo-=valor;
        return true;
    }

    //getters e setters
    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // toString()

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
