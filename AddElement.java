import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] newArray = new int[array.length + 1];
        System.out.print("Nhap vi tri ban muon them: ");
        int viTri = input.nextInt();
        for(int i = 0, j = 0 ; i < array.length ; i++, j++){
            if(i == viTri){
                System.out.println("Nhap so ban muon them");
                int num = input.nextInt();
                newArray[j] = num;
                j++;
            }
            newArray[j] = array[i];
        }
        System.out.println("Mang moi truoc khi them phan tu: " + Arrays.toString(array));
        System.out.println("Mang moi sau khi them phan tu: " + Arrays.toString(newArray));
    }
}
