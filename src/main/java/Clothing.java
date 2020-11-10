package main.java;

public class Clothing implements Comparable<Clothing> {
    public double price;
   

    public Clothing() {
        this(4.00);

    }

    public Clothing(double price) {
        this.price = price;
      //SER316 TASK 2 SPOT- BUGS FIX
       // this.Description = descr;
    }
    


    public int compareTo(Clothing clothes) {
        //SER316 TASK 2 SPOTBUGS FIX
        return Double.compare(clothes.price, this.price);
    }
}
