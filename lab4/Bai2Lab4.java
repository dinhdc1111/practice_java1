package lab4;

import java.util.Scanner;

public class Bai2Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product objProduct1 = new Product();
        Product obProduct2 = new Product();

        System.out.println("Nhập thông tin cho sản phẩm 1:");
        objProduct1.ImportProduct(scanner);
        System.out.println("Nhập thông tin cho sản phẩm 2:");
        obProduct2.ImportProduct(scanner);
        System.out.println("Thông tin sản phẩm 1:");
        objProduct1.ExportProduct();
        System.out.println("Thông tin sản phẩm 2:");
        obProduct2.ExportProduct();
        scanner.close();
    }

    public static class Product {
        private String productName;
        private double productPrice;
        private double productDiscount;

        // Constructor default
        public Product() {
            productName = "";
            productPrice = 0.0;
            productDiscount = 0.0;
        }

        public void ImportProduct(Scanner scanner) {
            System.out.print("Nhập tên sản phẩm: ");
            productName = scanner.nextLine();
            System.out.print("Nhập đơn giá: ");
            productPrice = scanner.nextDouble();
            System.out.print("Nhập giảm giá: ");
            productDiscount = scanner.nextDouble();
            scanner.nextLine();
        }

        public void ExportProduct() {
            System.out.println("Tên sản phẩm: " + productName);
            System.out.println("Đơn giá: " + productPrice);
            System.out.println("Giảm giá: " + productDiscount);
            System.out.println("Thuế nhập khẩu: " + getImportTax());
            System.out.println("-----------------");
        }

        public double getImportTax() {
            return 0.1 * productPrice;
        }
    }
}
