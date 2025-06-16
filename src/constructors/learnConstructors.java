package constructors;

public class learnConstructors {
    public static void main(String[] args) {
         Complex num1 = new Complex(3);
         Complex num2 = new Complex(4,9);
         num1.print();
         num2.print();

         Complex res = num1.add(num2);
         res.print();
        System.out.println(num1);
    }
}

class Complex{
    int a,b;

    //once a default constructor is overridden it can not be called again
    public Complex(int real){
        a = real;
        b = 12;
    }

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        System.out.println(this); //here actually it will print of reference jo call karega method ko
        this.print();
        return new Complex(a+ num2.a, b+ num2.b);
    }
}
