package lab7;

abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

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

class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String hoTen, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

public class Lab7Bai3 {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT("Dong Cong Dinh", 8.5, 7.0, 9.0);
        SinhVienBiz svBiz = new SinhVienBiz("Pham Phuong Anh", 8.0, 7.5);
        System.out.println("Sinh viên IT:");
        svIT.xuat();
        System.out.println("\nSinh viên Biz:");
        svBiz.xuat();
    }
}
