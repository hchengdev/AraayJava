import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhap so do F ban can chuyen doi: ");
                int f = input.nextInt();
                int c = (f - 32) * 5 / 9;
                System.out.println(f + "do F bang " + c + " do C" );
                break;
            case 2:
                System.out.println("Nhap so do C ban can chuyen doi: ");
                int doC = input.nextInt();
                int doF = (9/5) * doC + 32;
                System.out.println(doC + "do C bang " + doF + " do F" );
                break;
            case 3:
                System.exit(0);
        }
    }
}
