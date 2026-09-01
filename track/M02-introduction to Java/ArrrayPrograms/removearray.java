
public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        System.out.println("Before Removing: ");
        for (int arr1 : arr) {
            System.out.println(arr1 + " ");
        }

        System.out.println("Array after removal: ");
        for (int num : newArr) {
            System.out.println(num + " ");
        }
    }
}
