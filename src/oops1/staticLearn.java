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
        staticLearn s1 = new staticLearn();
        s1.printHi();
    }
}
