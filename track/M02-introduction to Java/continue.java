
public class Label {

    public static void main(String[] args) {
        // First loop
        for (int i = 0; i < 3; i++) {

            // Second loop
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i: " + i + " " + "j: " + j
                );
            }
        }
    }
}
