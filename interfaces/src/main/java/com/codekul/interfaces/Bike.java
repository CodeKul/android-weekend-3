package com.codekul.interfaces;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Bike implements GpsListener {
    @Override
    public String locate() {

        return "On Road";
    }

    public void increaseSpeed(){

    }
}
