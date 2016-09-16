package ejercicioOOP;

import java.util.Arrays;

/**
 * Created by WIZERWOLF on 16/09/2016.
 */
public class Book {
    private String name;
    private Author[] autors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] autors, double price) {
        this.name = name;
        this.autors = autors;
        this.price = price;
    }

    public Book(String name, Author[] autors, double price, int qty) {
        this.name = name;
        this.autors = autors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAutors() {
        return autors;
    }

    public void setAutors(Author[] autors) {
        this.autors = autors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", autors={" + Arrays.toString(autors) +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }
    public String getAuthorName(){
        String str="";
        for (Author aut:autors ) {
            str=str+aut.getName()+",";
        }
        return str;
    }
}
