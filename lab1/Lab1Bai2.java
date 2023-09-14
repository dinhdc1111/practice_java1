package lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double Height = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double Width = sc.nextDouble();
        double Perimeter = (Height + Width) * 2;
        double Superficies = (Height * Width);
        double smallestEdge = Math.min(Height, Width);
        sc.close();
        System.out.printf("Chu vi hình chữ nhật: %.1f%n", Perimeter);
        System.out.printf("Diện tích hình chữ nhật: %.1f%n", Superficies);
        System.out.printf("Cạnh nhỏ nhất hình chữ nhật: %.1f%n", smallestEdge);
    }
}
