package lab2;

import java.util.Scanner;

/**
 * BaiTapThem
 */
public class BaiTapThem {
    private static Scanner scanner = new Scanner(System.in);
    // Cộng, trừ, nhân, chia 2 số nhập từ bàn phím
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.print("Mời chọn chức năng: ");
            choice = scanner.nextInt();
            System.out.print("Nhập số thứ nhất: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int b = scanner.nextInt();
            switch (choice) {
                case 1:
                    int cong = a + b;
                    System.out.println("Kết quả: " + cong);
                    break;
                case 2:
                    int tru = a - b;
                    System.out.println("Kết quả: " + tru);
                    break;
                case 3:
                    int nhan = a * b;
                    System.out.println("Kết quả: " + nhan);
                    break;
                case 4:
                    String result = (b != 0) ? "Kết quả: " + ((double) a / b) : "Không thể chia cho số 0";
                    System.out.println(result);
                case 5:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void menu() {
        System.out.println("Chọn phép tính");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.println("5. Thoát");
    }
}