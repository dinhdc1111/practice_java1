package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucNangMenu {
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Y1. Nhập danh sách nhân viên từ bàn phím
    public void ChucNang1() {
        do {
            System.out.println("Mời chọn loại nhân viên");
            System.out.println("1) Nhân viên Hành chính");
            System.out.println("2) Nhân viên Trưởng phòng");
            System.out.println("3) Nhân viên Tiếp thị");
            System.out.println("0) Kết thúc lựa chọn");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.NhapThongTin();
                    danhSachNhanVien.add(nvhc);
                    break;
                case 2:
                    TruongPhong nvtp = new TruongPhong();
                    nvtp.NhapThongTin();
                    danhSachNhanVien.add(nvtp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.NhapThongTin();
                    danhSachNhanVien.add(nvtt);
                    break;
            }
            if (choice == 0) {
                break;
            }
        } while (true);
    }
    // Y2. Xuất danh sách nhân viên ra màn hình.
    public void ChucNang2(){
        for (NhanVien nhanVien : danhSachNhanVien) {
            
        }
    }
}
