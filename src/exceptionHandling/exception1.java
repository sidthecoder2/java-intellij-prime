package exceptionHandling;

public class exception1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello Guys");

        try {
            System.out.println(a[8]); //already invoked the try block here so it will come directly out of here,
            // in catch if it there ok otherwise it will throw exception
            int num = 5/0;
        } catch (Exception e) {
            System.out.println("Not allowed!");
        } //if you want to handle exceptions seperately ArrayOutofBoundException | NullPointer etc
        

        System.out.println("Jai Ho");
    }
}
