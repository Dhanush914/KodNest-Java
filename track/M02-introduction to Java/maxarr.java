
import java.util.Scanner;

public class maxarr {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is: " + max);
    }
}
