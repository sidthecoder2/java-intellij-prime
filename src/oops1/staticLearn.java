package oops1;

public class staticLearn {

    int abc;
    public static void printHello() {
        System.out.println("Hello");
    }

    public void printHi(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        printHello();
        //printHi(); // this will give error because printHi is not static method and we are trying to access it in static method main
        staticLearn s1 = new staticLearn();
        s1.printHi();
    }
}
