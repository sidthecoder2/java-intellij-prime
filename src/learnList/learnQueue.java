package learnList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        //we can use add also but it gives exception as we know better to use non-exception methods

        System.out.println(q1);

        System.out.println(q1.poll());  //to remove the front element
        System.out.println(q1);

        System.out.println(q1.peek());  //just prints which is the front element
        System.out.println(q1);

        //this is to traverse
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }   //this will remove all element one by one

        System.out.println(q1.poll());  //this will give null
//        System.out.println(q1.remove()); //this will give exception
    }
}
