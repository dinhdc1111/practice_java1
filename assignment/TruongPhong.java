package assignment;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong() {

    }

    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lương trách nhiệm: ");
        trachNhiem = scanner.nextDouble();
        scanner.nextLine();
    }

    public void XuatThongTin() {
        super.XuatThongTin();
        System.out.printf(" - Trách nhiệm: " + trachNhiem);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + trachNhiem;
    }

}
