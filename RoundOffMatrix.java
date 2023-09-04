import java.util.Scanner;
import java.lang.Math;

public class RoundOffMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the size of the matrix
        System.out.print("Enter the size of the matrix: ");
        int size = in.nextInt();

        // Create the matrix
        int[][] matrix = new int[size][size];

        // Get the values for the matrix
        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Round off the values to the nearest numbers divisible by 5
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.round(matrix[i][j] / 5) * 5;
            }
        }

        // Print the rounded off matrix
        System.out.println("The rounded off matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}