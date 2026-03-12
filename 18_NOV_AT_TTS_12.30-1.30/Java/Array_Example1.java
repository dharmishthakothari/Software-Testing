public class Array_Example1 {
    public static void main(String[] args) {
        int roll_no[] = { 11, 12, 13, 14, 45, 223, 123123, 13123 };
        for (int i = 0; i < roll_no.length; i++) {
            if (roll_no[i] > 100)
                System.out.println(roll_no[i]);
        }
        // String array
        String names[] = { "Prusha", "Dharmishtha", "Vidhi" };
        for (int i = 0; i < names.length; i++)

            System.out.println(names[i]);

    }
}
