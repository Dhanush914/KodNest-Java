
public class Break {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Loop ended.");
    }
}
