// CLASSE COM SOBRECARGA

public class Carro {
    // atributos
    private String cor;
    private double peso;
    private double aceleracao;

    // construtor
    public Carro (String cor, double peso){
        this.cor=cor;
        this.peso=peso;
        this.aceleracao=0;
    }

    public Carro (String cor, double peso, double aceleracao){
        this(cor,peso);
        this.aceleracao=aceleracao;
    }

    // Métodos
    public void acelerar(){
        this.aceleracao++;
    }

    public void acelerar(double valor){
        this.aceleracao+=valor;
    }


    // Getters & Setters

    public double getPeso() {
        return peso;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // toString

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", peso=" + peso +
                ", aceleracao=" + aceleracao +
                '}';
    }
}