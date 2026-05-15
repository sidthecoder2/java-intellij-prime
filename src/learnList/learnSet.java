package learnList;

import java.util.*;

public class learnSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); //in this hash codes are used so it'll
        // be stored in anonymous manner and finding will also happen anonymously
        Set<Integer> set2 = new LinkedHashSet<>(); //it will behave like a linked
        // so it will be stored in continuous manner
        Set<Integer> set3 = new TreeSet<>(); //it uses BST so stores in acending order and
        //dictionary for strings so arranges accordingly

        set1.add(10);
//        set1.add(10);
//        set1.add(10);
//        set1.add(10); //dupllicate elements khud se hi remove kar dega
        set1.add(20);

        System.out.println(set1 );
    }
}
