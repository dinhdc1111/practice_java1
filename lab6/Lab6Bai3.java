package lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6Bai3 {
    static class SinhVien {
        private String hoTen;
        private String email;
        private String soDienThoai;
        private String cmnd;

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập họ tên: ");
            hoTen = scanner.nextLine();

            do {
                System.out.print("Nhập email: ");
                email = scanner.nextLine();
            } while (!kiemTraEmail(email));

            do {
                System.out.print("Nhập số điện thoại: ");
                soDienThoai = scanner.nextLine();
            } while (!kiemTraSoDienThoai(soDienThoai));

            do {
                System.out.print("Nhập CMND: ");
                cmnd = scanner.nextLine();
            } while (!kiemTraCMND(cmnd));
        }

        public void xuat() {
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Email: " + email);
            System.out.println("Số điện thoại: " + soDienThoai);
            System.out.println("CMND: " + cmnd);
        }

        private boolean kiemTraEmail(String email) {
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        private boolean kiemTraSoDienThoai(String soDienThoai) {
            String regex = "^(\\d{10}|\\d{11})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(soDienThoai);
            return matcher.matches();
        }

        private boolean kiemTraCMND(String cmnd) {
            String regex = "^(\\d{9}|\\d{12})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(cmnd);
            return matcher.matches();
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSinhVien.add(sv);
        }
        scanner.close();
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
        }
    }
}