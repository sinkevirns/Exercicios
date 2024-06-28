public class Main {
    public static void main(String[] args) {
        int [] vector = {10,20,30,40,50,60,70,80,90,100};
        int aux;

        for (int n: vector) {
            System.out.print(n + " ");
        }

        for(int i=0;i<vector.length/2;i++){
            aux=vector[i];
            vector[i]=vector[(vector.length-1)-i];
            vector[(vector.length-1)-i]=aux;
        }

        System.out.println();
        for (int n: vector) {
            System.out.print(n + " ");
        }
    }
}