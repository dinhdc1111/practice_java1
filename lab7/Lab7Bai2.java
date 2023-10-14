package lab7;

abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}

public class Lab7Bai2 {
    public static void main(String[] args) {
        SinhVienPoly sv = new SinhVienPoly("Dong Cong Dinh", "IT") {
            @Override
            public double getDiem() {
                double diemJava = 8.5;
                double diemHTML = 7.0;
                double diemCSS = 9.0;
                return (diemJava + diemHTML + diemCSS) / 3;
            }
        };
        sv.xuat();
    }
}
