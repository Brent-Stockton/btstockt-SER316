package main.java;

import main.java.NoiseMaker.Location;

public class NoiseMaker {
    public double price;
    
   

    Location spot;

    public NoiseMaker() {
        this(Location.CENTERBODY);
    }

 // SER316 TASK 2 SPOT- BUGS FIX    
    public NoiseMaker(Location location) {  
        this.spot = location;
        switch (location) {
            case CENTERBODY:
                this.price = 10;
                break;
            default:
                this.price = 5;
                break;
        }
    }


    public enum Location {
        RIGHT_HAND, LEFT_HAND, RIGHT_FOOT, LEFT_FOOT, CENTERBODY
    }
}




