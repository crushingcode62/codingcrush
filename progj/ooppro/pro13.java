
import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getQuantity() + " " + product.getProductName() + "(s) to inventory.");
    }

    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                products.remove(product);
                System.out.println("Removed " + product.getProductName() + " from inventory.");
                return;
            }
        }
        System.out.println("Product " + productName + " not found in inventory.");
    }

    public boolean isLowInventory(String productName, int threshold) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return product.getQuantity() < threshold;
            }
        }
        return false; // Product not found
    }
}

public class InventoryTest {
    public static void main(String[] args) {
        // Create an instance of the Inventory class
        Inventory myInventory = new Inventory();

        // Add products to the inventory
        myInventory.addProduct(new Product("Laptop", 20));
        myInventory.addProduct(new Product("Phone", 15));
        myInventory.addProduct(new Product("Tablet", 10));

        // Check for low inventory
        System.out.println("Is Laptop inventory low? " + myInventory.isLowInventory("Laptop", 25));
        System.out.println("Is Phone inventory low? " + myInventory.isLowInventory("Phone", 10));

        // Remove a product from the inventory
        myInventory.removeProduct("Tablet");

        // Check for low inventory after removal
        System.out.println("Is Tablet inventory low? " + myInventory.isLowInventory("Tablet", 5));
    }
}