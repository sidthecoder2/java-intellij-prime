package learnList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class learnDeque {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.offer(10);
        deque1.offerLast(20);
        deque1.offerFirst(30);

        System.out.println(deque1);
    }
}
