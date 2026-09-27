public class practice3 {
    public static void main(String[] args) {
        int a = 56;
        int b = 72;
        // I USED EUCLIDEAN ALGO FORMULA TYPE SHII CRAZYYYY RAHHHH
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        if (a == 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
