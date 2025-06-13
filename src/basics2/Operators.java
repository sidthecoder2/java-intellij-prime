package basics2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        /*if(age>=18){
            System.out.println("Ready for war");
        } else if (age>10 && age<18) {
            System.out.println("Read for war!");
        }else{
            System.out.println("Not ready for war!");
        }*/

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thrus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }
    }
}
