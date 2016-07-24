package com.codekul.langfunda;

/**
 * Created by aniruddha on 23/7/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to java fundamentals");

        Car car = new Car(); // default
        car.calculateSpeed();

        Car carBmw = new Car(300,2,500); //paramatrized

        Car carAudi = new Car(carBmw); // copy
        car.calculateSpeed();
        car.calculateSpeed(10);

    }
}
