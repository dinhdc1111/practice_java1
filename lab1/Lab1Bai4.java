package lab1;

import java.util.Scanner;

public class Lab1Bai4 {
    // Delta và căn bậc 2 của Delta
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double coefficientA = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double coefficientB = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double coefficientC = sc.nextDouble();
        sc.close();
        double Delta = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        double deltaSqrt = Math.sqrt(Delta);
        System.out.printf("Phương trình bậc 2 có delta bằng %.1f và căn bậc hai delta bằng: %.1f", Delta, deltaSqrt);
    }
}
