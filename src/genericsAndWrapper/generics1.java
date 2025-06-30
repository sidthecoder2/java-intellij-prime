package genericsAndWrapper;

public class generics1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("123");
        Animal<String> a1 = new Animal<>("herbivores");
        System.out.println(a1.species);
    }
}

class Dog{
    String id;

    public Dog(String id){
        this.id = id;
    }
}

class Animal<V>{
    V species;

    public Animal(V species){
        this.species = species;
    }
}