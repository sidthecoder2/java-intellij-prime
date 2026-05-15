package collectionFramework;

import java.util.*;

class MyCustomAnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.weight - o2.weight;
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class LearnComparableandComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "Tommy", 67);
        Animal a2 = new Animal(3, "Harry", 46);
        Animal a3 = new Animal(5, "Jumbo", 65);
        Animal a4 = new Animal(3, "Dora", 56);
        Animal a5 = new Animal(2, "Moana", 45);
        Animal a6 = new Animal(1, "Jelly", 13);

        List<Animal> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);
        list1.add(a4);
        list1.add(a5);
        list1.add(a6);

        Collections.sort(list1, new MyCustomAnimalComparator());

        Collections.sort(list1, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });  // this is for anytime anywhere to use comparator

        //now we can write comparator using lambda
        Collections.sort(list1, (o1, o2) -> Integer.compare(o1.age, o2.age));

        //ye bhi same hi behave karega as lambda wala
        Collections.sort(list1, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));

        System.out.println(list1);

        //now this will sort the 2D array using elements on basis of first column elemets if same then second column elements
        int a[][] = {{9,5,4},
                    {6,9,0},
                    {9,0,5}};

        Arrays.sort(a, (arr1, arr2) -> {
            if(arr1[0] == arr2[0]){ return arr1[1] - arr2[1];}
            else{
                return arr1[0] - arr2[0];}
        });

        //to print this we use
        for(int e[]: a){
            for(int element : e){
                System.out.println(element+", ");
            }

        }


    }
}
