import java.util.*;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }

        }
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
    }

}
