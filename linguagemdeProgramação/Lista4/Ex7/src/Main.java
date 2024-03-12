public class Main {
    public static void main(String[] args) {
        int [] [] numbers = {{9,1,6,4,5},
                             {8,3,1,4,5},
                             {1,2,3,4,5},
                             {1,2,3,4,5},
                             {1,2,3,4,5}};
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}