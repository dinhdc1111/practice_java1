package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String ten;
    private double diem;
    private String hocLuc;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
        setHocLuc();
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    private void setHocLuc() {
        if (diem >= 9) {
            hocLuc = "Xuất sắc";
        } else if (diem >= 7.5) {
            hocLuc = "Giỏi";
        } else if (diem >= 6.5) {
            hocLuc = "Khá";
        } else if (diem >= 5) {
            hocLuc = "Trung bình";
        } else {
            hocLuc = "Yếu";
        }
    }
}

public class Lab7Bai4 {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
                        String ten = scanner.nextLine();
                        System.out.print("Nhập điểm của sinh viên " + (i + 1) + ": ");
                        double diem = scanner.nextDouble();
                        scanner.nextLine();
                        danhSachSinhVien.add(new SinhVien(ten, diem));
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên:");
                    for (SinhVien sv : danhSachSinhVien) {
                        System.out.println(
                                "Tên: " + sv.getTen() + ", Điểm: " + sv.getDiem() + ", Học lực: " + sv.getHocLuc());
                    }
                    break;
                case 3:
                    System.out.println("Danh sách sinh viên có học lực giỏi:");
                    for (SinhVien sv : danhSachSinhVien) {
                        if (sv.getHocLuc().equals("Giỏi")) {
                            System.out.println(
                                    "Tên: " + sv.getTen() + ", Điểm: " + sv.getDiem() + ", Học lực: " + sv.getHocLuc());
                        }
                    }
                    break;
                case 4:
                    Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
                        @Override
                        public int compare(SinhVien sv1, SinhVien sv2) {
                            return Double.compare(sv2.getDiem(), sv1.getDiem());
                        }
                    });
                    System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
                    for (SinhVien sv : danhSachSinhVien) {
                        System.out.println(
                                "Tên: " + sv.getTen() + ", Điểm: " + sv.getDiem() + ", Học lực: " + sv.getHocLuc());
                    }
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }
}
