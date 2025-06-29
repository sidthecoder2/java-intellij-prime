package oops2;

class Parent{
    int num;

    public int getFactor(){
        return num*num*num;
    }
}

class Child extends Parent{
    int newNumber;

    public int sum(){
        return newNumber+100;
    }

    @Override
    public int getFactor() {
        return newNumber*newNumber;
    }
}


public class learnPolymorphism {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.num = 8;
        System.out.println(p1.getFactor());

    }
}
