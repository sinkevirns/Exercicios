public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double t;

        for (double c = -80; c < 81; c++) {
            t = (c * 9/5) + 32;
            System.out.println("Celsius: " + c + " Fahrenheit: " + t);
        }
    }
}