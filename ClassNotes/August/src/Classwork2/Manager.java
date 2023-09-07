package Classwork2;

public class Manager extends Employee{
    private double bonus;

    public Manager(){}
    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double newBonus) {
        bonus = newBonus;
    }
    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Manager other) {
            return getName().equals(other.getName()) && getSalary() == other.getSalary();
        } else return false;
    }

    public String toString(){
        return "Name: " + getName() + " | Total Salary: " + getSalary() + " (Base Salary: " + super.getSalary() + ", Bonus: " + getBonus() + ")";
    }
}
