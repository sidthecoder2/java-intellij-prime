package oops2;

public class learnInterface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.rec1();
        cat.walk(); //default method as it is required to implement a basic default and classes implemting the interface can
                    // change the implementation
    }
}

interface Animal{
    void rec1();

    default void walk(){
        System.out.println("Animal is walking");
    }
}

class Cat implements Animal{

    @Override
    public void rec1() {
        System.out.println("Dekh rha hai binod!");
    }

//    @Override
//    public void walk() {
//        System.out.println("Cat is walking");
//    }
}