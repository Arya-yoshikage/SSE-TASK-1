import java.util.*;

public class twoDarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
    
        int cols = sc.nextInt();
        // type[][] arrayname = new type[row][coloumn]
        // 1 D was type[] arrayname = new type[size]

        int[][] numbers = new int[rows][cols];

        // input rows
        for (int i = 0; i < rows; i++) {
            // coloumns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();

            }

        }
        int x = 5;
        // output
        for (int i = 0; i < rows; i++) {
            // coloumns
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location: " + i + " " + j);
                }

            }

        }
        System.out.println();

    }

}
