import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Palindromo { // Declaração da classe principal Palindromo
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite uma palavra/frase para verificar se é um palíndromo:"); // Exibe uma mensagem solicitando a entrada do usuário
        String input = scanner.nextLine(); // Lê a linha de entrada do usuário e armazena na variável input

        if (ehPalindromo(input)) { // Chama o método ehPalindromo para verificar se a entrada é um palíndromo
            System.out.println("A palavra/frase é um palíndromo."); // Se for um palíndromo, imprime esta mensagem
        } else {
            System.out.println("A palavra/frase não é um palíndromo."); // Se não for um palíndromo, imprime esta mensagem
        }

        scanner.close(); // Fecha o objeto Scanner
    }

    public static boolean ehPalindromo(String s) { // Método público que verifica se uma string é um palíndromo
        // Remove espaços e caracteres não alfanuméricos e converte para minúsculas
        String limpa = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return ehPalindromoRecursivo(limpa, 0, limpa.length() - 1); // Chama o método recursivo com a string limpa
    }

    private static boolean ehPalindromoRecursivo(String s, int esquerda, int direita) { // Método recursivo que verifica se a string é um palíndromo
        // Caso base: se a esquerda passou da direita, é um palíndromo
        if (esquerda >= direita) {
            return true;
        }

        // Verificar se os caracteres correspondentes são iguais
        if (s.charAt(esquerda) != s.charAt(direita)) {
            return false;
        }

        // Fazer chamada recursiva com os índices ajustados
        return ehPalindromoRecursivo(s, esquerda + 1, direita - 1);
    }
}
