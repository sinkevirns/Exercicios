public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Vetor:");
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }
        System.out.println("Cópia invertida:");
        for (int i = v1.length - 1; i >= 0; i--) {
            System.out.println(v1[i]);
        }
    }
}