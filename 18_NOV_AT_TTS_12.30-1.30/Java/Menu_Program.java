import java.util.Scanner;

public class Menu_Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exit");
        System.out.println("Enter your choice ");
        int ch = scan.nextInt();
        System.out.println("Enter 2 numbers ");
        int no1 = scan.nextInt();
        int no2 = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition " + no1 + no2);
                break;
            case 2:
                System.out.println("Subtraction " + (no1 - no2));
                break;
            case 3:
                int ans = no1 * no2;
                System.out.println("Multiplication " + no1 * no2);
                break;
            case 4:
                System.out.println("Division " + no1 / no2);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid ");

        }

    }
}
