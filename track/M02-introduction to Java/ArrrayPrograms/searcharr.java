
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Elaments: ");
        int size = scanner.nextInt();
        int[] arr = new int[5];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        boolean found = false;
        int position = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
