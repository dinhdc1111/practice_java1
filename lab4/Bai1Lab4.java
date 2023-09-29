package lab4;

/**
 * Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá.
 * Lớp gồm 2 phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin.
 */
public class Bai1Lab4 {
    public static void main(String[] args) {
        Product objProduct = new Product("Iphone 14 Pro Max 256GB", 29999000, 25990000);
        objProduct.ExportProduct();
    }

    public static class Product {
        private String productName;
        private double productPrice;
        private double productDiscount;

        // Constructor
        public Product(String productName, double productPrice, double productDiscount) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productDiscount = productDiscount;
        }

        // tính Thuế nhập khẩu 10% giá sản phẩm
        public double getImportTax() {
            return 0.1 * productPrice;
        }

        public void ExportProduct() {
            System.out.println("Tên sản phẩm: " + productName);
            System.out.println("Đơn giá: " + productPrice);
            System.out.println("Giảm giá: " + productDiscount);
            System.out.println("Thuế nhập khẩu: " + getImportTax());
            System.out.println("-----------------");
        }
    }
}
