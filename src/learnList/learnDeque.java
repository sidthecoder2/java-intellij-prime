package learnList;

import java.util.*;

public class learnDeque {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.offer(10);
        deque1.offerLast(20);
        deque1.offerFirst(30);

        System.out.println(deque1);

        ArrayDeque<String> work1 = new ArrayDeque<>();

        work1.offer("Computer");
        work1.offerFirst("Laptop");
        System.out.println(work1);

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        nums.push(90);
        nums.push(45);
        nums.push(80);
        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
        
    }
}
