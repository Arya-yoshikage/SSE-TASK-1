public class palindromicpyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // half of the pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            //rest half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            
            System.out.println();
            

        }

    }
}
