package main.java.map.search;

import java.util.HashMap;
import java.util.Map;

public class StorageProduct {
    private final Map<Long, Product> storageProductMap;

    public StorageProduct () {
        this.storageProductMap = new HashMap<> ();
    }

    public void addProduct (long cod, String name, int quantity, double price) {
        storageProductMap.put (cod, new Product (name, price, quantity));
    }

    public void displayProduct () {
        System.out.println (storageProductMap);
    }

    public double calcTotalStorageValue () {
        double totalStorageValue = 0d;
        if (!storageProductMap.isEmpty ()) {
            for (Product p : storageProductMap.values ()) {
                totalStorageValue += p.getQuantity () + p.getPrice ();
            }
        }

        return totalStorageValue;
    }

    public Product getMoreExpensiveProduct () {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;
        for (Product p : storageProductMap.values ()) {
            if (p.getPrice () > highestPrice) {
                mostExpensiveProduct = p;
            }
        }

        return mostExpensiveProduct;
    }

    public static void main (String[] args) {
        StorageProduct storageProduct = new StorageProduct ();

        storageProduct.addProduct (1L, "Product 01", 50, 10.0);
        storageProduct.addProduct (2L, "Product 02", 100, 5.0);
        storageProduct.addProduct (3L, "Product 03", 15, 45.0);
        storageProduct.addProduct (4L, "Product 04", 75, 25.0);

        storageProduct.getMoreExpensiveProduct ();

        System.out.println ("Valor total em estoque: R$" + storageProduct.calcTotalStorageValue ());
        System.out.println ("Produto mais caro em estoque: " + storageProduct.getMoreExpensiveProduct ());
    }
}
