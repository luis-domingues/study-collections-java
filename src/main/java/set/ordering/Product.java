package main.java.set.ordering;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private long code;
    private double price;
    private int quantity;

    public Product (String name, int quantity, double price, long code) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }

    public String getName () {
        return name;
    }

    public long getCode () {
        return code;
    }

    public double getPrice () {
        return price;
    }

    public int getQuantity () {
        return quantity;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Product product = (Product) o;
        return getCode () == product.getCode ();
    }

    @Override
    public int hashCode () {
        return Objects.hashCode (getCode ());
    }

    @Override
    public String toString () {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo (Product o) {
        return name.compareToIgnoreCase (o.getName ());
    }
}


class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare (Product o1, Product o2) {
        return Double.compare (o1.getPrice (), o2.getPrice ());
    }
}