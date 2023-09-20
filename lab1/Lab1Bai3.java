package lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    // Thể tích khối lập phương
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double Edge = sc.nextDouble();
        sc.close();
        double Volume = Math.pow(Edge, 3);
        System.out.printf("Thể tích của hình lập phương: %.1f", Volume);
    }
}
