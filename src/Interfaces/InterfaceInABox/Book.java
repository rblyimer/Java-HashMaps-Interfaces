package Interfaces.InterfaceInABox;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String Author, String Name, double Weight) {
        this.author = Author;
        this.name = Name;
        this.weight = Weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
}