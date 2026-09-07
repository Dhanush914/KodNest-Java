
public class ShiftArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int shift = 2;

        System.out.println("Before shift:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + shift) % n];
        }

        System.out.println("\nAfter shift:");
        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}
