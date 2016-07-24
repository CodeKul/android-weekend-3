package com.codekul.interfaces;

/**
 * Created by aniruddha on 24/7/16.
 */
public /*abstract*/ interface GpsListener extends SensorListener,MageticFiledListener{

    /*public static final*/ int GPS_VERSION = 1;

    /*public abstract*/ String locate();

    /*public*/ default void okayItsAwsome(){

    }
}

interface SensorListener {

}

interface MageticFiledListener {

}
