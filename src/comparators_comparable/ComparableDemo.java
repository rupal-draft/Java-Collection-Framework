package comparators_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        Students s1 = new Students(4, "Alice");
        Students s2 = new Students(1, "Bob");
        Students s3 = new Students(2, "Carol");
        Students s4 = new Students(5, "David");
        Students s5 = new Students(3, "Eve");

        List<Students> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println(students); // Print the students in unsorted order

        Collections.sort(students);

        System.out.println(students); // Print the students in sorted order
    }
}

// Define a class to represent a student
// with roll number and name
// and implement the Comparable interface
// to compare students based on their roll numbers
class Students implements Comparable<Students> {

    int roll;
    String name;

    public Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    // Override the compareTo method
    // to compare students based on their roll numbers
    // and return a negative, zero, or positive value
    @Override
    public int compareTo(Students that) {
        return this.roll - that.roll;
    }
}