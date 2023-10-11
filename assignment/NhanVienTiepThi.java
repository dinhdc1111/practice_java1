package assignment;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public NhanVienTiepThi() {

    }

    public NhanVienTiepThi(String manv, String hoten, double luong, double doanhSo, double hoaHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    // Override method
    @Override
    public void NhapThongTin(Scanner scanner) {
        super.NhapThongTin(scanner);
        System.out.print("Nhập doanh số: ");
        doanhSo = scanner.nextDouble();
        System.out.print("Nhập hoa hồng: ");
        hoaHong = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public void XuatThongTin() {
        super.XuatThongTin();
        System.out.printf("- Doanh số: " + doanhSo + "- Hoa hồng: " + hoaHong);
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + doanhSo + hoaHong;
    }

}
