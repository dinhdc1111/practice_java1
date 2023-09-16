package lab2;

import java.util.Scanner;

/**
 * Lab2Bai2
 */
public class Lab2Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            String result = (b == 0) ? ((c == 0)
                    ? "Phương trình vô số nghiệm!"
                    : "Phương trình vô nghiệm!")
                    : String.format("Phương trình có nghiệm x = %.1f", -c / b);
            System.out.print(result);
        } else {
            double Delta = Math.pow(b, 2) - 4 * a * c;
            if (Delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (Delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép: %.1f", x);
            } else {
                double deltaSqrt = Math.sqrt(Delta);
                double x1 = (-b + deltaSqrt) / (2 * a);
                double x2 = (-b - deltaSqrt) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.1f và x2 = %.1f", x1, x2);
            }
        }
        sc.close();
    }
}