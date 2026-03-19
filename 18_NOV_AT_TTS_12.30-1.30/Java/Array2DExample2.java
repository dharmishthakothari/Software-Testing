import java.util.Scanner;

public class Array2DExample2 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner scan = new Scanner(System.in);
        // matrix.length === no of rows matrix[i].length === no of cols in ith row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter element ");
                matrix[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t" + matrix[i][j]);
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum " + sum);

    }
}
