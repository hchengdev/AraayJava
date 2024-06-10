public class SearchMin {
    public static void main(String[] args) {
        int []array = {4, 12, 7, 8, 1, 6, 9};
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        System.out.println(array[index]);
    }
}
