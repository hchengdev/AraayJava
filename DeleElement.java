import java.util.Arrays;
import java.util.Scanner;

public class DeleElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        int x = input.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] == x) {
                j--;
                continue;
            }
            newArr[j] = arr[i];
        }
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        System.out.println("Mang sau khi xoa: " + Arrays.toString(newArr));
    }
}
