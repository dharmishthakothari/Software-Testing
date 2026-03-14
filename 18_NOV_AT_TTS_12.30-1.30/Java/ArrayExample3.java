import java.util.Scanner;

public class ArrayExample3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no, sum = 0;

        System.out.println("Enter no of element ");
        no = scan.nextInt();
        int numbers[] = new int[no];
        // adding element from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        // printing array
        System.out.println("Array is ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("\n\nSUM of element is " + sum);
    }
}
