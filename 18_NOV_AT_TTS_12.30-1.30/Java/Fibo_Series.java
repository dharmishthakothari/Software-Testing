import java.util.Scanner;

public class Fibo_Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1, sum;
        System.out.println("Enter number ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print("\t" + a);
            sum = a + b;
            a = b;
            b = sum;
        }

    }
}
