public class Main {
    public static void main(String[] args) {

        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int [] rotcev = new int [vector.length];

        for (int i = 0; i < vector.length; i++) {
            rotcev[(vector.length-1)-i]=vector[i];
        }
        System.out.println("Vector: ");
        for (int n : vector) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : rotcev) {
            System.out.print(n + " ");
        }
    }
}