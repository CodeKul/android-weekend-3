package com.codekul.exceptionhandling;

import java.io.IOException;

/**
 * Created by aniruddha on 31/7/16.
 */
public class Main {

    public static void main(String[] args){

        Physics physics = new Physics();
        physics.acceleration(20,60);

        try {
            physics.acceleration(500,0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally executes all the time");
        }

        physics.acceleration(10,30);

        try {
            physics.relativity();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){

        }
        catch (Throwable t){

        }

        physics.energy(100,3);

        physics.energy(100,1);

    }
}
