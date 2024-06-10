import java.util.Scanner;

public class SInhVien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diem cua sinh vien (toi da 30 sinh vien): ");
        String diemArr = input.nextLine();
        String[] array = diemArr.split("[ ,]+");
        int num = 0;
        for (String diem : array) {
            try {
                int diemInt = Integer.parseInt(diem.trim());

                if (diemInt >= 5) {
                    num++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ: " + diem);
            }
        }
        System.out.printf("Co " + num + " sinh vien do");
    }
}
