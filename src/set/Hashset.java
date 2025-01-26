package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hashset {

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>(); // Stores elements in a random order

        // 1. Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate elements will not be added

        // 2. Checking for element existence
        System.out.println("Does the set contain 20? " + set.contains(20));

        // 3. Removing elements
        set.remove(20);

        // 4. Checking for emptiness
        System.out.println("Is the set empty? " + set.isEmpty());

        // 5. Getting set size
        System.out.println("Size of the set: " + set.size());

        // 6. Iterating through the set (using for-each loop)
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Adding all elements from another collection
        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(40);
        anotherSet.add(50);
        set.addAll(anotherSet);

        // 8. Removing all elements that are also in another collection
        set.removeAll(anotherSet);

        // 9. Retaining only elements that are also in another collection
        Set<Integer> keepSet = new HashSet<>();
        keepSet.add(10);
        keepSet.add(30);
        set.retainAll(keepSet);

        System.out.println("Set after modifications: " + set);

        Set<CustomClass> customSet = new HashSet<>();

        customSet.add(new CustomClass(1L, "John"));
        customSet.add(new CustomClass(2L, "Jane"));
        customSet.add(new CustomClass(3L, "Jack"));
        customSet.add(new CustomClass(1L, "John"));

        System.out.println(customSet);

        // 10. Clearing the set
        set.clear();
        keepSet.clear();
        customSet.clear();
    }
}

// We can also add custom classes as elements in a HashSet

class CustomClass {
    Long id;
    String name;

    public CustomClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals and hashCode methods
    // to compare CustomClass objects
    // based on their id
    // If two objects have the same id, they are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomClass that = (CustomClass) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}