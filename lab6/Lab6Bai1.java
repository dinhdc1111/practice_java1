package lab6;

import java.util.Scanner;
/**
 * Nhập họ và tên từ bàn phím.
 * Xuất tên, họ và tên đệm ra màn hình trong đó tên và họ xuất IN HOA.
 */
public class Lab6Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên của bạn: ");
        String fullName = scanner.nextLine();

        int firstSpaceIndex = fullName.indexOf(' ');
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        if (firstSpaceIndex == -1 || firstSpaceIndex == lastSpaceIndex) {
            System.out.println("Vui lòng nhập họ và tên hợp lệ.");
        } else {
            String ho = fullName.substring(0, firstSpaceIndex).toUpperCase();
            String tenDem = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
            String ten = fullName.substring(lastSpaceIndex + 1);

            System.out.println("Họ: " + ho);
            System.out.println("Tên đệm: " + tenDem);
            System.out.println("Tên: " + ten.toUpperCase());
        }
        scanner.close();
    }
}
