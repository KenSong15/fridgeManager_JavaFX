package Util;

import Model.Fridge;

public class Viewer {
    //this class will make a view on a fridge
    private Fridge vfridge;

    public Viewer() {
    }

    public Viewer(Fridge vfridge) {
        this.vfridge = vfridge;
    }

    public void makeview(){
        System.out.println("viewer making good view...");
    }
}
