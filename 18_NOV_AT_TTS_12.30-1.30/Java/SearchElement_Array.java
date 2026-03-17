import java.util.Scanner;

public class SearchElement_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of element ");
        int no_of_element = scan.nextInt();
        int[] numbers = new int[no_of_element];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element ");
            numbers[i] = scan.nextInt();
        }
        // display
        System.out.println("Elements ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Searching
        System.out.println("Enter element that you want to search ");
        int search = scan.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (search == numbers[i]) {
                System.out.println("Element found at " + i);
                break;
            }
        }
    }
}
