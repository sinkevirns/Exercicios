public class Main {
    public static void main(String[] args) {
        String str = "rafael@gmail.com";
        System.out.println(str.substring(str.indexOf('@')+1, str.indexOf('.')));

    }
}