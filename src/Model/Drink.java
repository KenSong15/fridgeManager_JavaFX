package Model;

import java.util.Date;

public class Drink {
    private String name;
    private Date inDate;
    private Date bestBefore;

    private Person owner;

    public Drink(String name, Date inDate, Date bestBefore, Person owner) {
        this.name = name;
        this.inDate = inDate;
        this.bestBefore = bestBefore;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Date getInDate() {
        return inDate;
    }

    public Date getBestBefore() {
        return bestBefore;
    }

    public Person getOwner() {
        return owner;
    }
}
