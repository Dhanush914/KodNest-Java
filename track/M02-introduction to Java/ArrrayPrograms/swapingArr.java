
public class SwapArray {

    public static void main(String[] args) {
        int[] arr = {10, 40, 30, 20, 50};

        System.out.println("Before swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int right = 1;
        int left = 3;

        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;

        System.out.println("\nAfter swap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
