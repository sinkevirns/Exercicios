import java.util.Random;

public class Personagem {

    private String nome;
    private double vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome){
        Random r = new Random();
        this.nome = nome;
        this.vida = 100;
        this.ataque = r.nextInt(11) + 20;
        this.defesa = r.nextInt(6) + 10;
    }

    public void atacar(Personagem player1){
        if (this != player1)
            player1.vida = (this.ataque - player1.defesa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                '}';
    }
}
