import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
