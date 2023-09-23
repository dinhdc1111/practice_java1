package lab3;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int size = scanner.nextInt();

        String[] hoTen = new String[size];
        double[] diem = new double[size];
        // Nhập thông tin của từng sinh viên
        for (int i = 0; i < size; i++) {
            scanner.nextLine();
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }
        // Xuất thông tin sinh viên và học lực
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < size; i++) {
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            String hocLuc = xetHocLuc(diem[i]);
            System.out.println("Học lực: " + hocLuc);
            System.out.println();
        }
        // Sắp xếp danh sách sinh viên theo điểm
        sapXepTheoDiem(hoTen, diem);
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < size; i++) {
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            String hocLuc = xetHocLuc(diem[i]);
            System.out.println("Học lực: " + hocLuc);
            System.out.println();
        }
        scanner.close();
    }

    // Phương thức xét học lực dựa trên điểm
    public static String xetHocLuc(double diem) {
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

    // Phương thức sắp xếp danh sách sinh viên theo điểm
    public static void sapXepTheoDiem(String[] hoTen, double[] diem) {
        int n = hoTen.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Hoán đổi điểm
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    // Hoán đổi họ tên
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }
    }
}
