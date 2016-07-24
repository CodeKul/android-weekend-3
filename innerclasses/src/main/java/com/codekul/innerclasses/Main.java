package com.codekul.innerclasses;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello I am running");

        Outer outer =
                new Outer();

        Outer.SimpleInner simpleinner =
                outer.new SimpleInner();

        Outer.StaticInner staticInner =
                new Outer.StaticInner();
    }
}
