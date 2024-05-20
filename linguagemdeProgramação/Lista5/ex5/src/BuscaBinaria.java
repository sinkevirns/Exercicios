public class BuscaBinaria {
    public static void main(String[] args) {
        // Define um array de inteiros ordenado
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        // Define o elemento a ser buscado no array
        int elemento = 7;

        // Chama o método de busca binária e armazena o resultado
        int resultado = buscaBinaria(array, elemento);

        // Verifica se o resultado é diferente de -1 (elemento encontrado)
        if (resultado != -1) {
            // Imprime a posição do elemento encontrado
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            // Imprime que o elemento não foi encontrado no array
            System.out.println("Elemento não encontrado no array.");
        }
    }

    // Método público que inicia a busca binária
    public static int buscaBinaria(int[] array, int elemento) {
        // Chama o método recursivo de busca binária com os limites iniciais do array
        return buscaBinariaRecursiva(array, elemento, 0, array.length - 1);
    }

    // Método privado que implementa a busca binária recursiva
    private static int buscaBinariaRecursiva(int[] array, int elemento, int esquerda, int direita) {
        // Caso base: se a esquerda for maior que a direita, o elemento não está no array
        if (esquerda > direita) {
            return -1; // Elemento não encontrado
        }

        // Calcula o índice do meio do array
        int meio = (esquerda + direita) / 2;

        // Verifica se o elemento no índice do meio é igual ao elemento buscado
        if (array[meio] == elemento) {
            return meio; // Elemento encontrado
        } else if (array[meio] > elemento) {
            // Se o elemento no meio é maior que o elemento buscado, busca na metade esquerda
            return buscaBinariaRecursiva(array, elemento, esquerda, meio - 1);
        } else {
            // Se o elemento no meio é menor que o elemento buscado, busca na metade direita
            return buscaBinariaRecursiva(array, elemento, meio + 1, direita);
        }
    }
}
