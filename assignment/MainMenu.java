package assignment;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ChucNangMenu chucNangMenu = new ChucNangMenu();
        do {
            System.out.println("\n==== MENU ASSIGNMENT JAVA 1 ====");
            System.out.println("Y1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("Y2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("Y7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("Y8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("Y9. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    chucNangMenu.ChucNang1();
                    break;
                case 2:
                    chucNangMenu.ChucNang2();
                    break;
                case 3:
                    chucNangMenu.ChucNang3();
                    break;
                case 4:
                    chucNangMenu.ChucNang4();
                    break;
                case 5:
                    chucNangMenu.ChucNang5();
                    break;
                // case 6:
                // chucNangMenu.ChucNang6();
                // break;
                // case 7:
                // chucNangMenu.ChucNang7();
                // break;
                // case 8:
                // chucNangMenu.ChucNang8();
                // break;
                // case 9:
                // chucNangMenu.ChucNang9();
                // break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }
}