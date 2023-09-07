package Classwork2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //instantiate Employee and Manager objects
        Employee e1 = new Employee("John", 67000);
        Employee e2 = new Employee("Randy", 87900);
        Employee e3 = new Employee("John", 67000);
        Manager m1 = new Manager("Jane", 100000, 11278);
        Manager m2 = new Manager("Jane", 100000, 11278);

        //Demonstrate toString() and equals() methods
        System.out.println(e1);
        System.out.println(m1);
        System.out.println("e1 = e2 : " + e1.equals(e2));
        System.out.println("e1 = e3 : " + e1.equals(e3));
        System.out.println("m1 = m2 : " + m1.equals(m2));

        //Demonstrate polymorphism by adding Employee and Manager objects to an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(m1);
        employees.add(e2);
        System.out.println(employees);

        //Demonstrate polymorphism by calling totalSalary() method to total the salaries of all employees in the ArrayList
        System.out.println("Total salaries: " + totalSalary(employees));


    }
        public static double totalSalary(ArrayList<Employee> employees) {
            double totalSalary = 0;
            for (Employee e : employees) {
                totalSalary += e.getSalary();
            }
            return totalSalary;
        }
}
