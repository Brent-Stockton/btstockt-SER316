package main.java;

public class Clothing implements Comparable<Clothing> {
    public double price;   
    public String Description;

    public Clothing() {
        this(4.00, "Generic Offtrack Separate");

    }

    public Clothing(double price, String descr) {
        this.price = price;
        this.Description = descr;
    }
    /**Method:  CompareTo(Clothing clothes)
     * Inputs:  Clothing clothes
     * Returns:  int (1,-1,0)
     * Description: Method compares clothing prices and 
     * returns a integer.
     * */
    public int compareTo(Clothing clothes) {
        if (clothes.price > this.price) {
            return 1;
        } else if (clothes.price < this.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
