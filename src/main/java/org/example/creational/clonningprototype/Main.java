package org.example.creational.clonningprototype;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //primitive copied as values
        //Wrapper class copied as reference wrapper class is immutable, string is also immutable so it is not given any issue
        //always if change in wrapper class it will always create new object

        //If the object is immutable, you won’t face side-effects.
        //If the object is mutable, you can face issues (both clones share the same object).
//        Immutable objects (Integer, String, LocalDate, BigDecimal, etc.) → safe with shallow copy, no shared mutation problem.
//        Mutable objects (ArrayList, HashMap, custom objects, arrays, etc.) → unsafe with shallow copy, shared state issues.

//        List<String> friends = new ArrayList<>();
//        friends.add("S");
//        friends.add("A");
//        Person person = new Person("John Doe", 30, friends);
//        Person person2 = (Person) person.clone();
//
//        System.out.println(person2);
//        System.out.println(person);
//
//        System.out.println(person.getAge() == person2.getAge());  true
//
//        person2.setAge(25);
//        System.out.println(person.getAge() == person2.getAge());     false
//        person2.getFriends().add("Ram");
//        System.out.println(person2);
//        System.out.println(person);

        //******************************** Copy Constructor ********************************
//        List<String> friends = new ArrayList<>();
//        friends.add("S");
//        friends.add("A");
//        Person person = new Person("John Doe", 30, friends);
//        Person person2 = new Person(person);
//
//        System.out.println(person2);
//        System.out.println(person);
//
//        person2.getFriends().add("Ram");
//        System.out.println(person2);
//        System.out.println(person);

       // ******************************** Prototype design pattern ********************************

//        Yes ✅ → With Prototype, the client doesn’t pass parameters directly.
//        But that’s intentional:
//
//        Prototype is designed for situations where you already have a “sample object” (prototype) and want to copy it.
//
//        If you need to create objects with different parameters, then use Factory/Builder patterns, not Prototype.

        List<String> friends = new ArrayList<>();
        friends.add("S");
        friends.add("A");

        Human human = new Human(friends, "Aman");

        Prototype prototype = human.clone();
        System.out.println(prototype);

        human.getFriends().add("Ram");
        System.out.println(prototype);
        System.out.println(human);
    }
}