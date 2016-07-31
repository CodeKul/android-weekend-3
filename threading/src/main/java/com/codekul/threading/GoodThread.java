package com.codekul.threading;

/**
 * Created by aniruddha on 31/7/16.
 */
public class GoodThread extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 100 ; i++) {
            System.out.println( " Good Thread "+i);
        }
    }
}
