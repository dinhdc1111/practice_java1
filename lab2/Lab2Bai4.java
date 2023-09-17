package lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void menu() {
        System.out.println("+--------------MENU--------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Thoát");
        System.out.println("+--------------------------------+");
    }

    public static void giaiPTB1() {
        System.out.println("Bạn đã chọn giải phương trình bậc nhất ❤");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        String result = (a == 0) ? ((b == 0)
                ? "Phương trình vô số nghiệm!"
                : "Phương trình vô nghiệm!")
                : String.format("Phương trình có nghiệm x = %.1f%n", -b / a);
        System.out.println(result);
    }

    public static void giaiPTB2() {
        System.out.println("Bạn đã chọn giải phương trình bậc 2 ❤");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            String result = (b == 0) ? ((c == 0)
                    ? "Phương trình vô số nghiệm!"
                    : "Phương trình vô nghiệm!")
                    : String.format("Phương trình có nghiệm x = %.1f%n", -c / b);
            System.out.println(result);
        } else {
            double Delta = Math.pow(b, 2) - 4 * a * c;
            if (Delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (Delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép: %.1f%n", x);
            } else {
                double deltaSqrt = Math.sqrt(Delta);
                double x1 = (-b + deltaSqrt) / (2 * a);
                double x2 = (-b - deltaSqrt) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.1f và x2 = %.1f%n", x1, x2);
            }
        }
    }

    public static void tinhTienDien() {
        System.out.println("Bạn đã chọn tính tiền điện ❤");
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        double giaTien = (soDien <= 50) ? soDien * 1000 : 50 * 1000 + (soDien - 50) * 1200;
        System.out.printf("Tiền điện phải trả: %.0f VNĐ%n", giaTien);
    }
}
