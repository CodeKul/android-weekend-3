package com.codekul.inheritance;

/**
 * Created by aniruddha on 24/7/16.
 */

// bird is having legs and country
// Eagle is a bird

public class Bird {

    private int legs;
    public String country;
    protected float weight;

    public float calculateWeight(){

        return weight * 9.8f;
    }

}
