package oops2;

public class learnAbstract {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.jaiho(); //here we can access the non-abstract methods of parent abstract class
        c1.accelerate();
        c1.breaks();
        c1.info(); //overrride done that's why child one is implemented
    }
}

abstract class Vehicle {
    int a =9;
    abstract void accelerate();
    abstract void breaks();
    void info(){
        System.out.println("India");
    }
    void jaiho(){
        System.out.println("Simple Vehicle");
    }
}

class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Accelerate");
    }

    @Override
    void breaks() {
        System.out.println("Breaking");
    }

    void info(){
        System.out.println("Car it is");
    }
}




