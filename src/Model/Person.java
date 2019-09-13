package Model;

public class Person {
    private String name;
    private String email;
    private String phoneNum;
    private String level;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email, String phoneNum, String level) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.level = level;
    }

    //todo: send notification


    //getter and setter below

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
