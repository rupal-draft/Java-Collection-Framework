# Collections Framework

This repository contains implementations and examples of Java's Collections Framework, covering various core interfaces and their implementations. Each section includes code demonstrations and explanations of key methods.

---

## Contents

1. [Generics](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/generics)
2. [List and Its Implementations](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/lists)
3. [Queue and Its Implementations](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/queue)
4. [Set and Its Implementations](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/set)
5. [Map and Its Implementations](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/map)
6. [Comparable and Comparator](https://github.com/rupal-draft/Java-Collection-Framework/tree/main/src/comparators_comparable)

---

## Generics
- **Description**: Generics enable type safety and reduce the risk of `ClassCastException` by specifying the type of objects stored in a collection.
- **Example**:
  ```java
  List<String> stringList = new ArrayList<>();
  stringList.add("Hello");
  stringList.add("World");
  for (String str : stringList) {
      System.out.println(str);
  }
  ```

---

## List and Its Implementations
- **Description**: A `List` is an ordered collection that allows duplicate elements.
- **Implementations**:
    - **ArrayList**: Resizable-array implementation.
    - **LinkedList**: Doubly-linked list implementation.
    - **Vector**: Synchronized resizable-array.
    - **Stack**: LIFO stack implementation.

- **Example**:
  ```java
  List<Integer> arrayList = new ArrayList<>();
  arrayList.add(1);
  arrayList.add(2);
  System.out.println(arrayList);

  Stack<Integer> stack = new Stack<>();
  stack.push(10);
  stack.push(20);
  System.out.println(stack.pop());
  ```

---

## Queue and Its Implementations
- **Description**: A `Queue` is a collection used to hold elements prior to processing.
- **Implementations**:
    - **Deque**: Double-ended queue supporting element insertion and removal at both ends.
    - **PriorityQueue**: Queue where elements are ordered according to their natural ordering or a custom comparator.

- **Example**:
  ```java
  Queue<Integer> priorityQueue = new PriorityQueue<>();
  priorityQueue.add(5);
  priorityQueue.add(1);
  priorityQueue.add(3);
  System.out.println(priorityQueue.poll()); // Outputs: 1

  Deque<String> deque = new ArrayDeque<>();
  deque.addFirst("Start");
  deque.addLast("End");
  System.out.println(deque);
  ```

---

## Set and Its Implementations
- **Description**: A `Set` is a collection that does not allow duplicate elements.
- **Implementations**:
    - **HashSet**: Unordered, hash table-based implementation.
    - **LinkedHashSet**: Ordered by insertion order.
    - **TreeSet**: Sorted set implementation.
    - **EnumSet**: Specialized set for enums.

- **Example**:
  ```java
  Set<String> hashSet = new HashSet<>();
  hashSet.add("A");
  hashSet.add("B");
  System.out.println(hashSet);

  TreeSet<Integer> treeSet = new TreeSet<>();
  treeSet.add(10);
  treeSet.add(5);
  System.out.println(treeSet);
  ```

---

## Map and Its Implementations
- **Description**: A `Map` is a collection of key-value pairs.
- **Implementations**:
    - **HashMap**: Hash table-based implementation.
    - **TreeMap**: Sorted map implementation.
    - **EnumMap**: Specialized map for enums.

- **Example**:
  ```java
  Map<Integer, String> hashMap = new HashMap<>();
  hashMap.put(1, "One");
  hashMap.put(2, "Two");
  System.out.println(hashMap);

  TreeMap<String, Integer> treeMap = new TreeMap<>();
  treeMap.put("B", 2);
  treeMap.put("A", 1);
  System.out.println(treeMap);
  ```

---

## Comparable and Comparator
- **Description**:
    - **Comparable**: Defines natural ordering for objects.
    - **Comparator**: Provides custom ordering for objects.

- **Example**:
  ```java
  class Person implements Comparable<Person> {
      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      @Override
      public int compareTo(Person other) {
          return Integer.compare(this.age, other.age);
      }
  }

  List<Person> people = new ArrayList<>();
  people.add(new Person("Alice", 30));
  people.add(new Person("Bob", 25));
  Collections.sort(people);

  people.forEach(p -> System.out.println(p.name + ": " + p.age));
  ```

---

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/collections-framework.git
   ```
2. Import the project into your favorite IDE.
3. Explore the examples in the respective package directories.

---

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

