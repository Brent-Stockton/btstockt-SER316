package main.java;

public class Embroidery {
    final double PRICE_PER_LETTER = 1.00;
    double price;
    String embroidText;

    public Embroidery (String embroidery) {
        this.embroidText = embroidery;
        this.price = embroidery.length() * PRICE_PER_LETTER;
    }
}
