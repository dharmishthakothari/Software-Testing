import java.util.Scanner;

public class Multilication_class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int no = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " * " + i + " =" + no * i);
        }
    }
}
