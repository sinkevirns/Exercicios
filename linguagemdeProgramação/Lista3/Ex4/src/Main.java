public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double t;

        for (double c = -80; c < 81; c++) {
            t = (9/5 * c) + 32 + 10;
            System.out.println("O C: " + c + " e o F: " + t);
        }
    }
}