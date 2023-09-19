package Classwork2;

/**
 * Manager class that extends the Employee class.
 * This class introduces a bonus field and alters the getSalary method to include this bonus.
 */
public class Manager extends Employee {
    /**
     * Bonus given to the manager.
     */
    private double bonus;

    /**
     * Default constructor for the Manager class.
     */
    public Manager() {
    }

    /**
     * Parameterized constructor for initializing name, salary, and bonus.
     *
     * @param name       Name of the manager.
     * @param baseSalary Base salary of the manager.
     * @param bonus      Bonus given to the manager.
     */
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    /**
     * Sets the bonus for the manager.
     *
     * @param newBonus New bonus to be set.
     */
    public void setBonus(double newBonus) {
        this.bonus = newBonus;
    }

    /**
     * Retrieves the bonus of the manager.
     *
     * @return Bonus of the manager.
     */
    public double getBonus() {
        return this.bonus;
    }

    /**
     * Overrides the getSalary method from Employee to include the bonus.
     *
     * @return Total salary including the bonus.
     */
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    /**
     * Overrides the equals method to compare Manager objects based on name and total salary.
     *
     * @param otherObject The object to compare against.
     * @return True if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Manager other) {
            return getName().equals(other.getName()) && getSalary() == other.getSalary();
        } else return false;
    }

    /**
     * Returns a string representation of the Manager object, including bonus details.
     *
     * @return String representation of the Manager object.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + " | Total Salary: " + getSalary() + " (Base Salary: " + super.getSalary() + ", Bonus: " + getBonus() + ")";
    }
}
