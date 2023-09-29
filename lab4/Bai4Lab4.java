package lab4;

import java.util.Scanner;

public class Bai4Lab4 {
    public static void main(String[] args) {
        // Hardcode
        Product objProduct = new Product("Sản phẩm thử", 400, 200);
        objProduct.ExportProduct();
        // Import
        // Scanner scanner = new Scanner(System.in);
        // Product objProduct = new Product();
        // objProduct.ImportProduct(scanner);
        // objProduct.ExportProduct();
        // scanner.close();
    }

    public static class Product {
        private String productName;
        private double productPrice;
        private double productDiscount;

        // public Product() {
        //     productName = "";
        //     productPrice = 0.0;
        //     productDiscount = 0.0;
        // }

        public Product(String productName, double productPrice, double productDiscount) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productDiscount = productDiscount;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(double productPrice) {
            this.productPrice = productPrice;
        }

        public double getProductDiscount() {
            return productDiscount;
        }

        public void setProductDiscount(double productDiscount) {
            this.productDiscount = productDiscount;
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

        private double getImportTax() {
            return 0.1 * productPrice;
        }
    }
}
