package lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = sc.nextInt();
        sc.close();
        double giaTien = (soDien <= 50) ? soDien * 1000 : 50 * 1000 + (soDien - 50) * 1200;
        System.out.printf("Tiền điện phải trả: %.0f VNĐ", giaTien);
    }
}
