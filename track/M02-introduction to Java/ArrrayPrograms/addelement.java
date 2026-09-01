
public class InsertElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50};
        int element = 30;
        int index = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println("Before Inserting :");
        for (int arr1 : arr) {
            System.out.println(arr1 + " ");
        }

        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
