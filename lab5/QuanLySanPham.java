package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    String tenSanPham;
    double donGia;

    public SanPham(String tenSanPham, double donGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + tenSanPham + ", Đơn giá: " + donGia;
    }
}

public class QuanLySanPham {
    private static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    public static int menu() {
        System.out.println("Chọn tùy chọn:");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.print("Nhập lựa chọn: ");
        return scanner.nextInt();
    }

    public static void nhap() {
        scanner.nextLine(); // Đọc ký tự Enter còn lại từ lần nhập trước
        while (true) {
            System.out.print("Nhập tên sản phẩm (hoặc ấn Enter để kết thúc): ");
            String tenSanPham = scanner.nextLine();
            if (tenSanPham.isEmpty()) {
                break;
            }
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine();
            SanPham sanPham = new SanPham(tenSanPham, donGia);
            danhSachSanPham.add(sanPham);
        }
    }
    

    public static void xuat() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.donGia, o1.donGia);
            }
        };
        Collections.sort(danhSachSanPham, comp);

        System.out.println("Danh sách sản phẩm sắp xếp theo giá giảm dần:");
        xuat();
    }

    public static void xoa() {
        scanner.nextLine(); // Đọc ký tự Enter
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSanPhamXoa = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).tenSanPham.equals(tenSanPhamXoa)) {
                danhSachSanPham.remove(i);
                found = true;
                System.out.println("Đã xóa sản phẩm: " + tenSanPhamXoa);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm: " + tenSanPhamXoa);
        }
    }

    public static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }

        double tongGia = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongGia += sanPham.donGia;
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}