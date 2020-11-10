package main.java;


public class Stuffing {
    
    public enum BearStuffing {
        BASE,
        DOWN,
        FOAM
    }  //SER316 TASK 2 SPOT- BUGS FIX - changed enum to capital letter

    BearStuffing polyStuffing;
    int price;

    public Stuffing (BearStuffing interiorStuffing) {

        switch (interiorStuffing) {
            case BASE:
                this.polyStuffing = BearStuffing.BASE;
                this.price = 30;
                break;
            case DOWN:
                this.polyStuffing = BearStuffing.DOWN;
                this.price = 40;
                break;
        //SER316 TASK 2 SPOT- BUGS FIX    case FOAM:
          //      this.polyStuffing = BearStuffing.FOAM;
           //     this.price = 50;
            //    break;
        }
    }
}
