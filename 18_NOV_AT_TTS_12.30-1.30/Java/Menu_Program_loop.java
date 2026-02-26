import java.util.Scanner;

public class Menu_Program_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no1, no2;
        while (true) {
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("Enter your choice ");
            int ch = scan.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    System.out.println("Addition " + (no1 + no2));
                    break;
                case 2:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    System.out.println("Subtraction " + (no1 - no2));
                    break;
                case 3:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    int ans = no1 * no2;
                    System.out.println("Multiplication " + no1 * no2);
                    break;
                case 4:
                    System.out.println("Enter 2 numbers ");

                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    System.out.println("Division " + no1 / no2);
                    break;
                case 5:
                    System.exit(1);

                default:
                    System.out.println("Invalid ");

            }
        }

    }
}
