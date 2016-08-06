package com.codekul.brushup.generics;

/**
 * Created by aniruddha on 6/8/16.
 */
public class Main {

    public static void main(String[] args) {

        Any<String> any = new Any<>();
        String s = any.getAnything();
        any.setAnything("Hello");

        Any<Integer> anyInt = new Any<>();
        Integer i = anyInt.getAnything();
        anyInt.setAnything(10);

        AnyOther<Any<Integer>,String,Double> other = new AnyOther<>();
    }
}
