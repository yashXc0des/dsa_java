import java.util.Scanner;

public class minnumberinarray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 23, 4, 24, 234, 4, 312, 31, 23, 123};
        Scanner sc = new Scanner(System.in);
        int minimum = min(arr); // Call the min method and store the result
        System.out.println("The minimum number in the array is: " + minimum); // Print the minimum value
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
