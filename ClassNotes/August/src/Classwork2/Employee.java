package Classwork2;

import Notes09_05_23.Choice.Question;

public class Employee
{
    private String name;
    private double salary;

    public Employee(){

    }
    public Employee(String name, double baseSalary){
        this.name = name;
        salary = baseSalary;
    }

    public void setName(String newName)
    {
        name = newName;
    }
    public void setBaseSalary(double newSalary) {
        salary = newSalary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String toString(){
        return "Name: " + name + " | Salary: " + salary;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Employee other) {
            return getName().equals(other.getName()) && getSalary() == other.getSalary();
        } else return false;
    }
}
