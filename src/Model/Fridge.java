package Model;

import java.util.ArrayList;

public class Fridge {
    private ArrayList<Food> foodArrayList;
    private ArrayList<Drink> drinkArrayList;

    public Fridge() {
        foodArrayList = new ArrayList<Food>();
        drinkArrayList = new ArrayList<Drink>();
    }

    //put in food or drink
    public void putin(Food afood){
        foodArrayList.add(afood);
    }

    public void putin(Drink adrink){
        drinkArrayList.add(adrink);
    }

    //take out food or drink
    public void takeout(String namestr) {
        int foodLen = foodArrayList.size();
        int drinkLen = drinkArrayList.size();

        for(int i = 0; i < foodLen; i++){
            if(this.foodArrayList.get(i).getName().equals(namestr)) {
                this.foodArrayList.remove(i);
                return;
            }
        }
        for(int i = 0; i < drinkLen; i++){
            if(this.drinkArrayList.get(i).getName().equals(namestr)) {
                this.drinkArrayList.remove(i);
                return;
            }
        }
        System.out.println("Given name not found in inventory, plz check");
        return;
    }
    //todo: check all food status


    //this function show all the inventory
    public void show(){
        int foodLen = foodArrayList.size();
        int drinkLen = drinkArrayList.size();

        System.out.println("Inventory following-------------");

        System.out.println("  food:-------------------------");
        if(foodLen == 0) {
            System.out.println("    no food here****************");
        } else {
            for (int i = 0; i < foodLen; i++) {
                Food curFood = foodArrayList.get(i);
                System.out.println("    " + curFood.getName() + "  " + curFood.getOwner().getName() + " " +
                        curFood.getInDate() + " " + curFood.getBestBefore());
            }
        }

        System.out.println("  drink:------------------------");
        if(drinkLen == 0){
            System.out.println("    no drink here***************");
        } else {
            for (int i = 0; i < drinkLen; i++) {
                Drink curDrink = drinkArrayList.get(i);
                System.out.println("    " + curDrink.getName() + "  " + curDrink.getOwner().getName() + " " +
                        curDrink.getInDate() + " " + curDrink.getBestBefore());
            }
        }
        System.out.println("Inventory done------------------");
    }
}
