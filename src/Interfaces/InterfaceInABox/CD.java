package Interfaces.InterfaceInABox;

public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String artist, String Name, int Year) {
        this.artist = artist;
        this.name = Name;
        this.year = Year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
}
