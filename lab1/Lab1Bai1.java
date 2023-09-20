package lab1;

import java.util.Scanner;

/**
 * Lab1Bai1
 */
public class Lab1Bai1 {
    // Thông tin sinh viên
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        float Avg = sc.nextFloat();
        sc.nextLine();
        sc.close();
        System.out.printf("Sinh viên: %s%nĐiểm trung bình: %.1f điểm", fullName, Avg);
    }
}