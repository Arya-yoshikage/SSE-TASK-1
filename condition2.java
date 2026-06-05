import java.util.*;

public class condition2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0 || x > 100) {
            System.out.println("invalid");
        } else {
            switch (x / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("fail");
            }
        }
    }
}