package lab2;

import java.util.Scanner;

/**
 * Lab2Bai1
 */
public class Lab2Bai1 {
    // Giải phương trình bậc nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        String result = (a == 0) ? ((b == 0) 
        ? "Phương trình vô số nghiệm!" 
        : "Phương trình vô nghiệm!")
        : String.format("Phương trình có nghiệm x = %.1f", -b / a);
        System.out.print(result);
        sc.close();
    }
}