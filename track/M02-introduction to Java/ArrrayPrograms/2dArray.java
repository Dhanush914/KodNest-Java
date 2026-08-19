
import java.util.Scanner;

public class twoArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
