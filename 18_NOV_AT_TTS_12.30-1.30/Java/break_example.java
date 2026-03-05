
public class break_example {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);

            if (i == 3)
                break;
            i++;
        }
    }
}
