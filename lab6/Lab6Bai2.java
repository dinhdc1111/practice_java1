package lab6;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Nhập vào mảng 5 sản phẩm (mỗi sản phẩm gồm tên, giá và hãng).
 * Xuất thông tin các sản phẩm có hãng là Nokia
 */
public class Lab6Bai2 {
    static class SanPham {
        private String tenSp;
        private double donGia;
        private String hang;

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sản phẩm: ");
            tenSp = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            donGia = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhập hãng sản phẩm: ");
            hang = scanner.nextLine();
        }

        public void xuat() {
            System.out.println("Tên sản phẩm: " + tenSp);
            System.out.println("Giá sản phẩm: " + donGia);
            System.out.println("Hãng sản phẩm: " + hang);
        }

        public String getHang() {
            return hang;
        }
    }

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }
        scanner.close();

        System.out.println("Danh sách sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
