import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter number ");
        int number = scan.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime ");
                temp = 0;
                break;
            } else {
                // System.out.println("Number is prime ");
                temp = 1;
            }
        }
        if (temp == 1) {
            System.out.println("Number is prime ");
        }
    }
}
