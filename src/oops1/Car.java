package oops1;

public class Car extends Vehicle{

    void start(){
        super.start();  // this is basically to access the parent class
        System.out.println(this.model + " has started");
        System.out.println("Car has "+ this.noofWheels+ " wheels");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.noofWheels = 4;
        obj.model = "Volkswagen Virtus";
        obj.start();
    }
}
