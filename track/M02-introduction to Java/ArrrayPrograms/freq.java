
public class freq {

    static void count(int arr[], int key) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Frequency of " + key + " is: " + count);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 30};
        count(arr, 30);
    }
}
