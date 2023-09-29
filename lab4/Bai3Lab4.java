package lab4;

import java.util.Scanner;

public class Bai3Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Có giảm giá
        Product objProduct1 = new Product("Sản phẩm 1", 100.0, 10.0);
        // Không giảm giá
        Product objProduct2 = new Product("Sản phẩm 2", 200.0);
        System.out.println("Thông tin sản phẩm 1:");
        objProduct1.ExportProduct();
        System.out.println("Thông tin sản phẩm 2:");
        objProduct2.ExportProduct();
        scanner.close();
    }

    public static class Product {
        private String productName;
        private double productPrice;
        private double productDiscount;

        // Có giảm giá
        public Product(String productName, double productPrice, double productDiscount) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productDiscount = productDiscount;
        }

        // Không giảm giá
        public Product(String productName, double productPrice) {
            this(productName, productPrice, 0); // Call Constructor 3 args
        }

        public void ExportProduct() {
            System.out.println("Tên sản phẩm: " + productName);
            System.out.println("Đơn giá: " + productPrice);
            System.out.println("Giảm giá: " + productDiscount);
            System.out.println("Thuế nhập khẩu: " + getImportTax());
            System.out.println("-----------------");
        }

        private double getImportTax() {
            return 0.1 * productPrice;
        }
    }
}
