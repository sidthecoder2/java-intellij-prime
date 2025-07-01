package learnList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class learningLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(20);
        list.add(40);
        list.add(40);
        Integer a = sc.nextInt();
        list.add(a);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(1);//it will take as a index if you giving directly integer
        System.out.println(list);
        list.remove(Integer.valueOf(38)); // this will remove the value if present cause
        // it is directly comparing the value
        System.out.println(list);
    }
}
