package oops2;

public class interfaceNew {

    class Mint{
        int print;   //this is called as non-static method (inner class)
    }

    static class Kutrim {
        boolean usingAI; //this is called as static-nested class
    }

    public static void main(String[] args) {
        Mint m1 = new interfaceNew() . new Mint();  //for non-static inner class we need to make object of outer then inner class
        m1.print = 8;

        Kutrim k1 = new interfaceNew.Kutrim(); //for static inner class we can directly invoke by just making object of outer class
        k1.usingAI = true;
    }

}
