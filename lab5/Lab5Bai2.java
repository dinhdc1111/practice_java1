package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Viết chương trình thực hiện các chức năng sau:
 * 1. Nhập danh sách họ và tên
 * 2. Xuất danh sách vừa nhập
 * 3. Xuất danh sách ngẫu nhiên
 * 4. Sắp xếp giảm dần và xuất danh sách
 * 5. Tìm và xóa họ tên nhập từ bàn phím
 * 6. Kết thúc
 * 
 */
public class Lab5Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        int choice;
        do {
            choice = menu(scanner);
            switch (choice) {
                case 1:
                    nhap(scanner, nameList);
                    break;
                case 2:
                    xuat(nameList);
                    break;
                case 3:
                    ngaunhien(nameList);
                    break;
                case 4:
                    sapxep(nameList);
                    break;
                case 5:
                    xoa(scanner, nameList);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    public static int menu(Scanner scanner) {
        System.out.println("Chọn tùy chọn:");
        System.out.println("1. Nhập danh sách họ và tên");
        System.out.println("2. Xuất danh sách vừa nhập");
        System.out.println("3. Xuất danh sách ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
        System.out.println("5. Tìm và xóa họ tên");
        System.out.println("6. Kết thúc");
        System.out.print("Nhập lựa chọn: ");
        return scanner.nextInt();
    }

    public static void nhap(Scanner scanner, ArrayList<String> nameList) {
        scanner.nextLine();
        while (true) {
            System.out.print("Nhập họ và tên (hoặc ấn Enter để kết thúc): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            nameList.add(name);
        }
    }

    public static void xuat(ArrayList<String> nameList) {
        System.out.println("Danh sách họ và tên:");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public static void ngaunhien(ArrayList<String> nameList) {
        Collections.shuffle(nameList);
        System.out.println("Danh sách ngẫu nhiên:");
        xuat(nameList);
    }

    public static void sapxep(ArrayList<String> nameList) {
        Collections.sort(nameList);
        Collections.reverse(nameList);
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        xuat(nameList);
    }

    public static void xoa(Scanner scanner, ArrayList<String> nameList) {
        scanner.nextLine();
        System.out.print("Nhập họ và tên cần xóa: ");
        String nameToDelete = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).equals(nameToDelete)) {
                nameList.remove(i);
                found = true;
                System.out.println("Đã xóa họ và tên: " + nameToDelete);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy họ và tên: " + nameToDelete);
        }
    }
}
