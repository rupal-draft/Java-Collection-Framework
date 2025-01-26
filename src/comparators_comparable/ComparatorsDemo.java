package comparators_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsDemo {

    public static void main(String[] args) {

        Employees e1 = new Employees("Alice", 50000, 1, 25);
        Employees e2 = new Employees("Bob", 60000, 2, 30);
        Employees e3 = new Employees("Carol", 70000, 3, 35);
        Employees e4 = new Employees("David", 80000, 4, 40);
        Employees e5 = new Employees("Eve", 90000, 5, 45);

        List<Employees> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println(employees); // Print the employees in unsorted order

        // Sort the employees by name using a custom comparator
        Collections.sort(employees, new CustomComparator());

        System.out.println(employees); // Print the employees in sorted order of their name

        // Sort the employees by age
        // using an inline comparator
        Collections.sort(employees, new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return Integer.compare(o1.age, o2.age); // Sort in ascending order
            }
        });

        System.out.println(employees); // Print the employees in sorted order of their age

        // Sort the employees by roll
        // using a lambda expression
        Collections.sort(employees, (o1, o2) -> Integer.compare(o1.roll, o2.roll)); // Sort in ascending order

        System.out.println(employees); // Print the employees in sorted order of their roll

        // Sort the employees by salary
        // using Comparator.comparing() which returns a comparator
        Collections.sort(employees, Comparator.comparing(Employees::getSalary)
                .thenComparing(Employees::getAge)
                .thenComparing(Employees::getRoll));

        System.out.println(employees); // Print the employees in sorted order of their salary

    }
}

class Employees {

    int age;
    int roll;
    double salary;
    String name;

    public Employees(String name, double salary, int roll, int age) {
        this.name = name;
        this.salary = salary;
        this.roll = roll;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "age=" + age +
                ", roll=" + roll +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}

// Define a custom comparator
// to sort employees by name
class CustomComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.name.compareTo(o2.name); // Sort in ascending order
    }
}