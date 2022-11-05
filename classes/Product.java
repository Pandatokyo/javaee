package classes;


import java.util.ArrayList;
import java.util.Arrays;


public class Product {

    private final int id;

    private final String name;

    private final String description;

    private final double price;

    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getInfo() {
        ArrayList<?> temp = new ArrayList<>(Arrays.asList(this.id, this.name, this.description, this.price));
        return temp.toString();
    }
}
