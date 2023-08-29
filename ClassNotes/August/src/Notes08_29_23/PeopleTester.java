package Notes08_29_23;

public class PeopleTester {
    public static void main(String[] args) {
        //------------------------- Default Constructors -------------------------
        Person p1 = new Person(); //Must define default constructor in Person class
        p1.setName("Mark");
        p1.setAge(55);
        System.out.println(p1); //toString method is overridden in Person class

        Dad d1 = new Dad(); //Must define default constructor in Dad class
        d1.setName("Jerry");
        d1.setAge(37);
        d1.setNumberOfKids(2);
        System.out.println(d1); //toString method is overridden in Dad class

        Son s1 = new Son(); //Must define default constructor in Son class
        s1.setName("Adam");
        s1.setAge(22);
        s1.setSport("Football");
        System.out.println(s1); //toString method is overridden in Son class

        //------------------------- Overloaded Constructors -------------------------
        Person p2 = new Person("John", 66); //Must define overloaded constructor in Person class for name and age

        Dad d2 = new Dad("Randy", 44, 3);  //Must define overloaded constructor in Dad class for numberOfKids

        Son s2 = new Son("Billy Bob", 22, 0, "Soccer"); //Must define overloaded constructor in Son class for sport

        System.out.println(p2); //toString method is overridden in Person class
        System.out.println(d2); //toString method is overridden in Dad class
        System.out.println(s2); //toString method is overridden in Son class
    }
}
