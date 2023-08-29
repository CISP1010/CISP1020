package Notes08_29_23;

public class Dad extends Person {
    private int numberOfKids;
    //private String name; DO NOT DO THIS -- these are inherited from Person
    //private int age; DO NOT DO THIS -- these are inherited from Person

    public Dad(){

    }
    public Dad(String name, int age, int numberOfKids) {
        super(name, age); //Super constructor must be first statement in constructor! This calls the constructor in the Person class
        this.numberOfKids = numberOfKids;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public String toString(){
        return "Dad: " + getName() + "   " + getAge() + "   " + numberOfKids; //overriding the toString method in Person, is overridden in Son class
    }
}
