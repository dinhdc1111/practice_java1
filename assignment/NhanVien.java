package assignment;

import java.util.Scanner;

public abstract class NhanVien {
    private String manv;
    private String hoten;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void NhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        manv = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        hoten = scanner.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        luong = scanner.nextDouble();
    }

    public void XuatThongTin() {
        System.out.printf("\nMã: " + manv + "- Họ tên: " + hoten + "- Lương: " + luong);
    }

    public abstract double getThuNhap();

    public double getThueTN() {
        double thue = 0;
        if (getThuNhap() < 9000000) {
            thue = 0;
        } else if (getThuNhap() >= 9000000 && getThuNhap() <= 15000000) {
            thue = getThuNhap() * 0.1;
        } else {
            thue = getThuNhap() * 0.12;
        }
        return thue;
    }
}
