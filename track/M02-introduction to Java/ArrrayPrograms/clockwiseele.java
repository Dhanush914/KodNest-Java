
public class clockwiseele {

    public static void main(String[] args) {

        int[] arr = {12, 23, 34, 45};

        int element = arr[0];
        int index = 3;

        for (int i = 0; i < index; i++) {
            arr[i] = arr[i + 1];
        }

        arr[index] = element;
        System.out.print("Array after moving: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
