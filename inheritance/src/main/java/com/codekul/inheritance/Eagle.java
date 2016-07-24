package com.codekul.inheritance;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Eagle /*is a bird*/ extends Bird  {

    public Eagle() {

        //legs = 2;
        country = "India";
        weight = 5;
    }

    public void flyHigh(){

        calculateWeight();
    }

    @Override
    public float calculateWeight() {
        //return weight * 9.8f * 12;
        return super.calculateWeight() * 12;
    }
}
