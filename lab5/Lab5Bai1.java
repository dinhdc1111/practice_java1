package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Nhập danh sách số thực với số lượng (tùy ý)
 * Xuất danh sách vừa nhập và tổng của nó
 */
public class Lab5Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayNumbers = new ArrayList<>();

        inputDoubleList(scanner, arrayNumbers);
        resultDoubleList(arrayNumbers);
    }

    public static void inputDoubleList(Scanner scanner, ArrayList<Double> arrayNumbers) {
        while (true) {
            System.out.print("Nhập số thực: ");
            Double x = scanner.nextDouble();
            arrayNumbers.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine();
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    // Danh sách và tổng
    public static void resultDoubleList(ArrayList<Double> arrayNumbers) {
        System.out.println("Danh sách số thực là:");
        for (Double number : arrayNumbers) {
            System.out.println(number);
        }
        double sum = 0;
        for (Double number : arrayNumbers) {
            sum += number;
        }
        System.out.println("Tổng của danh sách là: " + sum);
    }
}
