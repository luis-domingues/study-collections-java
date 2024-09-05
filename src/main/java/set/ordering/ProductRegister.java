package main.java.set.ordering;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister {
    private Set<Product> productSet;

    public ProductRegister () {
        this.productSet = new HashSet<> ();
    }

    public void addProduct (long code, String name, double price, int quantity) {
        productSet.add (new Product (name, quantity, price, code));
    }

    public Set<Product> displayProductsByName () {
        Set<Product> productsByName = new TreeSet<> (productSet);
        return productsByName;
    }

    public Set<Product> displayProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice ());
        productSet.addAll (productSet);
        return productsByPrice;
    }

    public static void main (String[] args) {
        ProductRegister productRegister = new ProductRegister ();

        productRegister.addProduct (1L,"Produto 01", 15d, 2);
        productRegister.addProduct (2L,"Produto 02", 25d, 10);
        productRegister.addProduct (1L,"Produto 03", 10d, 5);
        productRegister.addProduct (9L,"Produto 04", 2d, 2);

        System.out.println (productRegister.productSet);

        productRegister.displayProductsByName ();
        productRegister.displayProductsByPrice ();
    }
}