import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][4];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int i = 0;
        String index = null;
        while (i < matrix.length) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = "row " + i + " and column " + j;
                }
            }
            i++;
        }

        System.out.println("Greatest search value : " + max);
        System.out.println("The coordinates of the largest searchable value: " + index);
    }
}
