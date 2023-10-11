package assignment;

public class NhanVienHanhChinh extends NhanVien {
    public NhanVienHanhChinh() {

    }

    public NhanVienHanhChinh(String manv, String hoten, double luong) {
        super(manv, hoten, luong);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong();
    }

}
