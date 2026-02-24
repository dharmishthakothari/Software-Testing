import java.util.Scanner;

public class check_day {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        System.out.println("Enter day no ");
        day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}
