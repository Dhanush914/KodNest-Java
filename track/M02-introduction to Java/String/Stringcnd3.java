
public class Stringcnd3 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JaVa";
        if (s1 == s2) {
            System.out.println("both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
