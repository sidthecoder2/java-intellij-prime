package strings;

public class StringBasics {
    public static void main(String[] args) {
        String name1 = "Sid";
        String name2 = "Sid";
        //now here s1 and s2 will be stored in stack memory cause variables are stored in stack memory, but the value of String are stored in Heap memory

        //so when we compare let's say
        if (name1 == name2) {
            System.out.println("Hooray! Both are same");
        }

        //but if we make from new keywork it will create as new String object in Heap memory

        String name3 = new String("Sid");
        if (name3 == name1) {
            System.out.println("Hooray! Both are same");
        } else {
            System.out.println("Oops! Both are different");
        }

        //but still you just want to compare the values of the String then you can use equals method
        if (name3.equals(name1)) {
            System.out.println("Hooray! Both are same");
        } else {
            System.out.println("Oops! Both are different");
        }
    }
}
