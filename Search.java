import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        for (int i = 0; i < students.length; i++) {
            boolean isExist = false;
            if (students[i].equals(name)) {
                System.out.println(i + "là vị trí bạn cần tìm");
                boolean isExist = true;
                break;
            }
            if (!isExist) {
                System.out.println("Not found" +name + " in the list.");
            }
        }
    }
}
