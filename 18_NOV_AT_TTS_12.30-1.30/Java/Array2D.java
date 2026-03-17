
public class Array2D {
    public static void main(String[] args) {
        int matrix[][] = { { 23, 56, 89 }, { 67, 90, 67 }, { 77, 65, 7 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

    }
}
