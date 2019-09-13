package Model;

import java.util.Calendar;

public class Food {
    private String name;
    private Calendar inDate;
    private Calendar bestBefore;

    private Person owner;

    public Food() {
    }

    public Food(String name, Calendar inDate, Calendar bestBefore, Person owner) {
        this.name = name;
        this.inDate = inDate;
        this.bestBefore = bestBefore;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Calendar getInDate() {
        return inDate;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public Person getOwner() {
        return owner;
    }
}
