package encapsulation;

public class Encapsulation3 {
    public static void main(String args[]) {

        Product p1 = new Product();

        p1.setProductName("Laptop");
        p1.setPrice(55000);
        p1.setStock(10);

        p1.Purchase(3);
        p1.restock(5);
        p1.Purchase(4);

        System.out.println("Product name: " + p1.getProductName());
        System.out.println("Price is: " + p1.getPrice());
        System.out.println("Available stock: " + p1.getStock());
    }
}

class Product {

    private String productName;
    private double price;
    private int stock;

    // Setter and Getter for productName
    void setProductName(String productName) {
        this.productName = productName;
    }

    String getProductName() {
        return productName;
    }

    // Setter and Getter for price
    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    double getPrice() {
        return price;
    }

    // Setter and Getter for stock
    void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock");
        }
    }

    int getStock() {
        return stock;
    }

    // Purchase product
    void Purchase(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock = stock - quantity;
        } else {
            System.out.println("Purchase failed");
        }
    }

    // Restock product
    void restock(int quantity) {
        if (quantity > 0) {
            stock = stock + quantity;
        } else {
            System.out.println("Invalid restock");
        }
    }
}