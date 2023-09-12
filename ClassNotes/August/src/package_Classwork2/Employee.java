package package_Classwork2;

/**
 * Employee class representing employee details.
 * This class contains fields for name and salary, along with appropriate getters and setters.
 * It also includes a default constructor and a parameterized constructor for easy instantiation.
 */
public class Employee {
    /**
     * Name of the employee.
     */
    private String name;

    /**
     * Salary of the employee.
     */
    private double salary;

    /**
     * Default constructor for the Employee class.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor for initializing name and salary.
     *
     * @param name       Name of the employee.
     * @param baseSalary Salary of the employee.
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.salary = baseSalary;
    }

    /**
     * Sets the name of the employee.
     *
     * @param newName New name to be set.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param newSalary New salary to be set.
     */
    public void setBaseSalary(double newSalary) {
        this.salary = newSalary;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return Name of the employee.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Retrieves the salary of the employee.
     *
     * @return Salary of the employee.
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return String representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Name: " + name + " | Salary: " + salary;
    }

    /**
     * Overrides the equals method to compare Employee objects based on name and salary.
     *
     * @param otherObject The object to compare against.
     * @return True if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Employee other) {
            return getName().equals(other.getName()) && getSalary() == other.getSalary();
        } else return false;
    }
}
