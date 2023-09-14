package lab1;

import java.util.Scanner;

public class BaiTapThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên của bạn: ");
        String myName = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int myOld = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập lớp của bạn: ");
        String myClass = sc.nextLine();
        sc.close();
        System.out.printf("Sinh viên: %s%nTuổi: %d tuổi%nLớp: %s", myName, myOld, myClass);
    }
}
