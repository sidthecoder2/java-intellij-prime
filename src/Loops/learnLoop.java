package Loops;

import java.util.Scanner;

public class learnLoop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=number; i++){
            if(i%2==0)
                sum += 2*i;
        }
        System.out.println("The sum of even numbers in given range" + number + " is: " + sum );
    }
}
