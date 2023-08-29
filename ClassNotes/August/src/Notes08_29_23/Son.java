package Notes08_29_23;

public class Son extends Dad{
    private String sport;
    //private String name; DO NOT DO THIS -- these are inherited from Person class
    //private int age; DO NOT DO THIS -- these are inherited from Person class
    //private int numberOfKids; DO NOT DO THIS -- these are inherited from Dad class
    public Son(){
    }
    public Son(String name, int age, int numberOfKids, String sport){
        super(name, age, numberOfKids); //Super constructor must be first statement in constructor! This calls the constructor in the Dad class
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String toString(){
        return "Son: " + getName() + "   " + getAge() + "   " + getNumberOfKids() + "   " + sport; //overriding the toString method in Dad and Person Classes
    }
}
