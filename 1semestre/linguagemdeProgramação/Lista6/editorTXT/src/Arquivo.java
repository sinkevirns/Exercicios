import java.util.Scanner;
public class Arquivo {
    private String nome;
    private int tamanho;
    private String conteudo;

    public Arquivo(){
        this.nome = "";
        this.tamanho = 0;
        this.conteudo = "";
    }

    public void abrir(){
        System.out.println("Nome do Arquivo " + this.nome);
        System.out.println("Tamanho " + this.tamanho + " bits");
        System.out.println("Conteúdo " + this.conteudo);
    }

    public void editar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as alterações do conteúdo: ");
        String alteracoesConteudo = scanner.nextLine();
        this.conteudo = alteracoesConteudo;
        System.out.println("Alterado com sucesso! ");
        int tam = this.conteudo.length();
        int bits = tam*8;
        this.tamanho = bits;
        abrir();
    }

    public void renomear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as alterações do título: ");
        String alteracoesTitulo = scanner.nextLine();
        this.nome = alteracoesTitulo;
        System.out.println("Alterado com sucesso! ");
        abrir();
    }

    public void limpar(){
        if (this.nome != "" && this.conteudo != "") {
            this.nome = "";
            this.conteudo = "";
            this.tamanho = 0;
            abrir();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
