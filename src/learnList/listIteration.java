package learnList;

import java.util.*;

public class listIteration {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        Stack<Integer> list3 = new Stack<>();

        list1.add("Kiwi");
        list1.add("Papaya");
        list1.add("Apple");
        list1.add("Mango");

        //these are all the methods for iteration in list

        for(int i=0; i<list1.size(); i++){
            System.out.println("Fruits is " + list1.get(i));
        }

        for(String l : list1){
            System.out.println("New Fruit : "  + l);
        }

        Iterator<String> fe = list1.iterator();
        while(fe.hasNext()){
            System.out.println(fe.next());
        }

        Iterator<String> fruits = list1.listIterator();

        list3.push(10);
        list3.push(90);
        list3.push(890);
        System.out.println(list3);
        list3.pop();
        System.out.println(list3);
        System.out.println(list3.peek());   // this is to check which element is top
    }
}
