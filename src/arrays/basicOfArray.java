package arrays;

public class basicOfArray {
    public static void main(String[] args) {
//        int age[]; //declaration
//        age = new int[5]; //allocation
        /* or do it togehther as
         int age[] = new int[5];
         */
//        age[0] = 5;
//        age[1] = 2;
//        for(int i=0;i<5;i++) {
//            System.out.println(age[i]);
//        }
        String names[] = {"Ram", "Shaym", "Hari", "Ravi"};

        for(int i =0; i<names.length; i++){
            System.out.println("Name is : "+names[i]);
        }

        //or you can use
        for(String name: names){
            System.out.println("Name is : "+ name);
        }
    }
}
