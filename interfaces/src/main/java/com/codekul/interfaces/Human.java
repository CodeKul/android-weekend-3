package com.codekul.interfaces;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Human implements GpsListener {

    public void walk(){

    }

    @Override
    public String locate() {
        return "In Home";
    }
}
