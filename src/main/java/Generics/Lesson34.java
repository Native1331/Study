package Generics;

import java.util.ArrayList;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Animal>  listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfAnimal);
        test(listOfDogs);
        /* Object
            Animal
            Dog
         */


    }
private static void test(List<? extends   Animal>list){
        for (Animal animal : list){
            animal.eat();

        }
}
}
