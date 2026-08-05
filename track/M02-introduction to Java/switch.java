
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

    }
}
