
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer value: ");
        int a = scan.nextInt();
        System.out.println("The integer value is: " + a);

        System.out.println("Enter the float value: ");
        float b = scan.nextFloat();
        System.out.println("The float value is: " + b);

        System.out.println("Enter the bolean value: ");
        boolean c = scan.nextBoolean();
        System.out.println("The boolean value is: " + c);

        System.out.println("Enter the double value: ");
        double d = scan.nextFloat();
        System.out.println("The double value is: " + d);

        System.out.println("Enter the long value: ");
        long e = scan.nextLong();
        System.out.println("The float value is: " + e);

        System.out.println("Enter the short value: ");
        short f = scan.nextShort();
        System.out.println("The float value is: " + f);

    }
}
