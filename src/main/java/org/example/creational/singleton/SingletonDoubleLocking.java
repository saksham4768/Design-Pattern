package org.example.creational.singleton;

public class SingletonDoubleLocking {
    private static volatile SingletonDoubleLocking instance;
    private SingletonDoubleLocking() {}

    public static SingletonDoubleLocking getInstance() {
        if (instance == null) {

//            🔹 What Singleton.class means
//
//In Java, every class has a corresponding Class object that represents its metadata.
//
//            Singleton.class literally refers to the Class object for the Singleton class.
//
//            This object exists once per class, loaded by the JVM.
//
//            You can think of it as a singleton object that represents the class itself, separate from any instances of the class.

//            synchronized always requires a lock object in the form synchronized(object) { ... } or synchronized method { ... }.
            synchronized (SingletonDoubleLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleLocking();
                }
            }
        }
        return instance;
    }
}
