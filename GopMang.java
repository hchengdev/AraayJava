import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {10,11,12,13};

        int[] newArr = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(arr2, 0, newArr, arr.length, arr2.length);
        System.out.println(Arrays.toString(newArr));
    }
}
