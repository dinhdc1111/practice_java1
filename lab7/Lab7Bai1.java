package lab7;

/**
 * Lab7Bai1
 * Viết chương trình nhập 2 hình chữ nhật và một hình vuông sau đó xuất ra.
 */
class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (rong + dai);
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chiều dài: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

public class Lab7Bai1 {

    public static void main(String[] args) {
        double daiCN, rongCN, canhVuong;

        daiCN = 9.0;
        rongCN = 7.0;
        canhVuong = 5.0;

        ChuNhat cn = new ChuNhat(daiCN, rongCN);
        Vuong vu = new Vuong(canhVuong);

        System.out.println("Hình chữ nhật:");
        cn.xuat();
        System.out.println("\nHình vuông:");
        vu.xuat();
    }
}