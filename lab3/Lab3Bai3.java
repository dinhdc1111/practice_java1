package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Sắp xếp mảng và xuất ra màn hình
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        // Tìm và xuất phần tử có giá trị nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
        }
        sc.close();
    }
}
