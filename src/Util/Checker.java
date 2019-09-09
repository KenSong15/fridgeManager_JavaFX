package Util;

import Model.Fridge;

public class Checker {
    //this class will handle check on an item and send the message
    private Fridge cfridge;

    public Checker() {
    }

    public Checker(Fridge cfridge) {
        this.cfridge = cfridge;
    }

    public void fullcheck(){
        System.out.println("checker full check activating...");
    }
}
