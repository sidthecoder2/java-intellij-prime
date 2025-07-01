package genericsAndWrapper;

public class genericMethods {
    public static void main(String[] args) {
        printData(123);
        printData("Doctor");

        genericMethods m1 = new genericMethods();
        //m1.<Integer>doubleData(45);   //before we used to write like this now it refers automatically
        m1.doubleData(34);
        //m1.doubleData("JaiHo"); // this we can't write as now the data type we have extended

        CustomClass customClass = new CustomClass();
        //m1.doubleData(customClass);    //as we have not bounded after bounding it will give error
    }

    <E extends Number> void doubleData(E data){   //this is boundi ng of generics
        System.out.println(data);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }
}

class CustomClass{

}

