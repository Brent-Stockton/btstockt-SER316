package main.java;

import main.java.Stuffing.BearStuffing;
import java.util.LinkedList;
import java.util.Objects;

public class Bear implements Comparable<Bear>{
    public Casing casing;
    public Stuffing stuff;
    public Embroidery ink; 
    public LinkedList<NoiseMaker> noisemakers; // accessory
    public LinkedList<Clothing> clothing; // accessory
    double price;
    // bear has a shell (requ)
    // bear has stuffing (req)
    // bear has a tattoo/emroider or not (opt)
    // bear has a noisemaker (opt)


    public Bear() {
        this.casing = new Casing();
        this.stuff = new Stuffing(BearStuffing.BASE);
        noisemakers = new LinkedList<>();
        clothing = new LinkedList<>();
        ink = new Embroidery("");
        price = 0;
    }

    public Bear(BearStuffing stuff) {
        this.casing = new Casing();
        this.stuff = new Stuffing(stuff);
        noisemakers = new LinkedList<>();
        clothing = new LinkedList<>();
        ink = new Embroidery("");
        price = 0;
    }

    public void setPrice(double incomingPrice) {
        this.price = incomingPrice;
    }

    public boolean addNoise(NoiseMaker noise) {
        if (this.noisemakers.size() >= 5) {
            return false;
        } else {
            for (NoiseMaker noisemaker: noisemakers) {
                if (noise.spot == noisemaker.spot) {
                    return false;
                }
            }
            noisemakers.add(noise);
            return true;
        }
    }

    @Override
    public int compareTo(Bear bear) {
        return new Double(this.price).compareTo(bear.price);
    }
  
    //SER316 TASK 2 SPOT- BUGS FIX
    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public boolean equals(Object o) {
       if (this == o)
           return true;
       if(o == null || getClass() != o.getClass()) 
           return false;
       Bear bear = (Bear) o;
       return Double.compare(bear.price, price) == 0;
       
    }
}