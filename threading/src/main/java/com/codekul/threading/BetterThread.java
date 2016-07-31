package com.codekul.threading;

/**
 * Created by aniruddha on 31/7/16.
 */
public class BetterThread implements Runnable{
    public void run() {

        for (int i = 0; i <1000 ; i++) {
            System.out.println(" Better Thread - "+i);
        }
    }
}
