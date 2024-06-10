import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Danh sach: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                j++;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + j);
    }
}
