package lab3;

import java.util.Scanner;

public class Lab3Bai1 {
    // Kiểm tra số nguyên tố: ĐK Ước thuộc [2, sqrt(N)]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int N = sc.nextInt();
        sc.close();
        if (N <= 1) {
            System.out.println(N + " không phải là số nguyên tố");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(N + (isPrime ? " là số nguyên tố." : " không phải là số nguyên tố"));
    }
}
