import java.util.*;

public class practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int mul = x;
         if(n==0){
            System.out.println("1");
            return;
        }
        if(n<0){
            System.out.println("error");
        return; }
        for (int i = 1; i < n; i++) {
            mul*= x;
        }
       
        
        System.out.println(mul);
    }
}