package com.codekul.interfaces;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Main {

    /*
    *  Rules about interfaces
    *
    *  1. One interface can extends one or more interfaces
    *  2. One class can extends one class at a time,
    *  3. one class can implements one or more interfaces
    *  4. One interface can never implement another interface
    * */

    public static void main(String[] args) {

        Bike bike = new Bike();
        System.out.println("Bike location - "+bike.locate());

        Human human = new Human();
        System.out.println("Human Location - "+human.locate());
        human.walk();

        GpsListener listener = bike;
        listener = human;
    }
}
