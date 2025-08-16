package org.example.creational.singleton;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

            //check SingletonDoubleLocking
            SingletonDoubleLocking singletonDoubleLocking1 = SingletonDoubleLocking.getInstance();
            SingletonDoubleLocking singletonDoubleLocking2 = SingletonDoubleLocking.getInstance();
            System.out.println(singletonDoubleLocking1 == singletonDoubleLocking2); //true

            //check SingletonLazy
            SingletonLazy singletonLazy = SingletonLazy.getInstance();
            SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
            System.out.println(singletonLazy == singletonLazy1); //true

            //check SingletonEager
            SingletonEager singletonEager = SingletonEager.getInstance();
            SingletonEager singletonEager1 = SingletonEager.getInstance();
            System.out.println(singletonEager == singletonEager1); //true

            //check SingletonSynchronized
            SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
            SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
            System.out.println(singletonSynchronized == singletonSynchronized1);   //true
    }
}