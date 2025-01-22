package generics;

public class Generics {

    public static void main(String[] args) {

        Example<String> example = new Example<String>("Hello");

        example.print();

        MultiParamExample<String, Integer> multiParamExample = new MultiParamExample<String, Integer>("Multiple", 2);

        multiParamExample.print();

        printMethod("Hello");
        printMethod(2);
        printMethod(3.14);

        Generics generics = new Generics();
        generics.printMethod2(3.14);
        generics.printMethod2(3);
    }

    static <E> void printMethod(E element){
        System.out.println(element);
    }

    <V extends Number> void printMethod2(V element){ // Bounded Generics
        System.out.println(element);
    } // <V extends Number>
}

class Example<E> {

    E element;

    public Example(E element){
        this.element = element;
    }

    void print(){
        System.out.println(element);
    }
}

class MultiParamExample<T, V> {

    T first;
    V second;

    public MultiParamExample(T first, V second){
        this.first = first;
        this.second = second;
    }

    void print(){
        System.out.println(first);
        System.out.println(second);
    }
}