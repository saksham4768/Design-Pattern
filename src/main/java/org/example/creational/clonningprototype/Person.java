package org.example.creational.clonningprototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private Integer age;
    List<String> friends = new ArrayList<>();

    public Person(String name, Integer age, List<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public Person(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
        this.friends = new ArrayList<>(person.getFriends());
    }
    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
