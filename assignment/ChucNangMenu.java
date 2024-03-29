package assignment;

import java.util.ArrayList;
import java.util.Collections;
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
    public void ChucNang2() {
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nhanVien).XuatThongTin();
            } else if (nhanVien instanceof TruongPhong) {
                ((TruongPhong) nhanVien).XuatThongTin();
            } else if (nhanVien instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nhanVien).XuatThongTin();
            }
        }
    }

    // Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
    public void ChucNang3() {
        System.out.println("\nNhập mã nhân viên cần tìm kiếm: ");
        String manv = scanner.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getManv().equalsIgnoreCase(manv)) {
                found = true;
                if (nhanVien instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nhanVien).XuatThongTin();
                } else if (nhanVien instanceof TruongPhong) {
                    ((TruongPhong) nhanVien).XuatThongTin();
                } else if (nhanVien instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nhanVien).XuatThongTin();
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên này!");
        }
    }

    // Y4. Xóa nhân viên theo mã nhập từ bàn phím.
    public void ChucNang4() {
        System.out.println("\nNhập mã nhân viên cần xóa: ");
        String manv = scanner.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getManv().equalsIgnoreCase(manv)) {
                danhSachNhanVien.remove(nhanVien);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên này!");
        }
    }

    // Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.
    public void ChucNang5() {
        System.out.println("\nNhập mã nhân viên cần cập nhật: ");
        String manv = scanner.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getManv().equalsIgnoreCase(manv)) {
                found = true;
                if (nhanVien instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nhanVien).NhapThongTin();
                } else if (nhanVien instanceof TruongPhong) {
                    ((TruongPhong) nhanVien).NhapThongTin();
                } else if (nhanVien instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nhanVien).NhapThongTin();
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên này!");
        }
    }

    // Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
    public void ChucNang6() {
        double luongBatDau = 0;
        double luongKetThuc = 0;
        do {
            System.out.println("\nKhoảng lương bắt đầu: ");
            luongBatDau = scanner.nextDouble();
            System.out.println("\nKhoảng lương kết thúc: ");
            luongKetThuc = scanner.nextDouble();

            if (luongBatDau > luongKetThuc) {
                System.out.println("Không hợp lệ. Vui lòng nhập lại");
            } else {
                break;
            }
        } while (true);

        boolean found = false;
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getThuNhap() >= luongBatDau && nhanVien.getThuNhap() <= luongKetThuc) {
                found = true;
                if (nhanVien instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) nhanVien).XuatThongTin();
                } else if (nhanVien instanceof TruongPhong) {
                    ((TruongPhong) nhanVien).XuatThongTin();
                } else if (nhanVien instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) nhanVien).XuatThongTin();
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên này!");
        }
    }

    // Y7. Sắp xếp nhân viên theo họ và tên.
    public void ChucNang7() {
        // lambda expression
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> (int) (nv1.getHoten().compareTo(nv2.getHoten())));
    }

    // Y8. Sắp xếp nhân viên theo thu nhập.
    public void ChucNang8() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> (int) (nv2.getThuNhap() - nv1.getThuNhap()));
    }

    // Y9. Xuất 5 nhân viên có thu nhập cao nhất.
    public void ChucNang9() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> (int) (nv2.getThuNhap() - nv1.getThuNhap()));
        for (int i = 0; i < 5; i++) {
            if (danhSachNhanVien.get(i) instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) danhSachNhanVien.get(i)).XuatThongTin();
            } else if (danhSachNhanVien.get(i) instanceof TruongPhong) {
                ((TruongPhong) danhSachNhanVien.get(i)).XuatThongTin();
            } else if (danhSachNhanVien.get(i) instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) danhSachNhanVien.get(i)).XuatThongTin();
            }
        }
    }
}