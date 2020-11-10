package main.java;

public class Embroidery {
    //SER316 TASK 2 SPOT- BUGS FIX
    final static double pricePerLetter = 1.00;
    double price;
  //SER316 TASK 2 SPOT- BUGS FIX
   // String embroidText;

    public Embroidery (String embroidery) {
        
        //SER316 TASK 2 SPOT- BUGS FIX
        //this.embroidText = embroidery;
        this.price = embroidery.length() * pricePerLetter;
    }
}
