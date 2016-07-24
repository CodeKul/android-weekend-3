package com.codekul.abstractclass;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal(); not possible

        Animal animal = new Elephant();
        animal.walk();

        Elephant elephant = new Elephant();
        elephant.walk();
    }
}
