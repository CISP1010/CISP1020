package Notes08_29_23;
public class Person {
    private String name;
    private int age;
    public Person(){
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + "   " + name + "   " + age; //Overrides the toString method in the cosmic Object class. Is overridden in Dad and Son classes
    }
}