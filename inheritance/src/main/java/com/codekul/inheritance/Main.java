package com.codekul.inheritance;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.calculateWeight();

        Eagle eagle = new Eagle();
        eagle.calculateWeight();

        Bird birdComman = new Eagle();

        //Eagle eagleComman = new Bird();
    }
}
