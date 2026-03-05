public class continue_Example {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 3) {
                // continue;
                break;
            }
            System.out.println(i);

        }
    }
}
