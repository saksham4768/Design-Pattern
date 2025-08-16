package org.example.creational.clonningprototype;

import java.util.ArrayList;
import java.util.List;

public class Human implements  Prototype{
    String name;
    List<String> friends = new ArrayList<>();


    public List<String> getFriends() {
        return friends;
    }

    public Human(List<String> friends, String name) {
        this.friends = friends;
        this.name = name;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Human{" +
                "friends=" + friends +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Human(new ArrayList<>(this.friends), this.name);
    }
}
