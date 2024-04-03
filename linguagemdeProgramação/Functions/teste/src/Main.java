public class Main {
    public static void main(String[] args) {
        int n = 1;
        int []v={1,2,3,4,5};
        teste(n,v);
        System.out.println(n);
        for(int value:v)
            System.out.println(value + "");
    }
    static void teste (int n, int []v){
        n = n+10;
        v[2]=300;
    }
}

