package oops2;

class streams{

    protected int a=9;

    streams(){
        System.out.println("This is parent - river constructor");
    }

    void go(){
        System.out.println("Simple go-parent river method");
    }
}

class subStreams extends streams{

    void getA(){
        System.out.println(super.a);
    }

    subStreams(){
        System.out.println("substreams constructor printed here ");
    }

    @Override
    void go() {
        System.out.println("Go-method in child river class");
    }
}

public class parentChild {
    public static void main(String[] args) {
        subStreams s1 = new subStreams();
        subStreams s2 = new subStreams();
        streams w1 = new streams();
        s1.go();
    }
}
