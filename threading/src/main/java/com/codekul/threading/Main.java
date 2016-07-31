package com.codekul.threading;

/**
 * Created by aniruddha on 31/7/16.
 */
public class Main {

    public static void main(String[] args) {

        GoodThread thread =
                new GoodThread();
        thread.start();

        BetterThread betterThread =
                new BetterThread();
        Thread threadBetter = new Thread(betterThread);
        threadBetter.start();

        new Thread(new Runnable() {
            public void run() {

            }
        }).start();
    }
}
