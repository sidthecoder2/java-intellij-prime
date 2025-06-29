package oops2;

public class anonymousClass {

    SuperInterface obj1 = new SuperInterface() {    //here this is anonymous class using interface
        @Override
        public void interfaceMethod() {

        }
    };

    Outerclass obj2 = new Outerclass(){   //here this is anonymous class using classes
        @Override
        public void outerMethod() {
            super.outerMethod();
        }
    };

    SuperInterface obj3 = () -> {
    };


    public static void main(String[] args) {
       Walkable walkable = (step) -> {
           System.out.println("Walks "+ step + " steps");
           return step;
       };

       walkable.walks(5);

    }
}

@FunctionalInterface
interface Walkable{
    int walks(int steps);
}

class Outerclass{
    public void outerMethod(){

    }
}

@FunctionalInterface
interface SuperInterface{
    void interfaceMethod();
}