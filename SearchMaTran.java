import java.util.Scanner;

public class SearchMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int colum = sc.nextInt();

        int[][] matrix = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("Phần tử lớn nhất là %d tại vị trí [%d][%d]\n", max, maxRow, maxCol);
    }
}
