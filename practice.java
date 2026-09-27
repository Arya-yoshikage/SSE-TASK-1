import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int p = 0;
        int n = 0;
        int z = 0;
        for (int j = 1; j <= i; j++) {
            int a = sc.nextInt();
            if (a > 0) {
                p++;
            }
            if (a < 0) {
                n++;

            }
             if(a == 0) {
                z++;
            }
        }
        System.out.println("total positive:" +p);
        System.out.println("total negative" + n);
        System.out.println("total zeroes:" +z);

    }
}
