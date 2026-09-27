import java.util.*;

public class call {
   /*  public static int calculateSum(int a, int b) {
        System.out.println("mul of two numbers is " + a * b);

        return a * b; */
    public static void printfactorial(int n){
        //loop
        int factorial = 1;
        if(n<0){
            System.out.print("error");
            return;
        }
        for(int i =n ;i>=1;i--){
            factorial= factorial * i;

        }
        System.out.print(factorial);
        return;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printfactorial(n);
        
    }
}