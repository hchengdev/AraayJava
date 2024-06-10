import java.util.Scanner;

public class ResultColum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int rows = input.nextInt();
        System.out.println("Nhap so cot");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int resultColum = 0;
        System.out.println("Nhap vao so thu tu cot can tinh tong: ");
        int resultCol = input.nextInt();
        for (int i = 0; i < rows; i++) {
            resultColum += matrix[i][resultCol + 1];
        }
        System.out.println(resultColum);
    }
}
