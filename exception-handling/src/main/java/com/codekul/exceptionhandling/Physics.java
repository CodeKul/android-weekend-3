package com.codekul.exceptionhandling;

import java.io.File;
import java.io.IOException;

/**
 * Created by aniruddha on 31/7/16.
 */
public class Physics {

    private double result;

    public void acceleration(int force,
                             int mass){
        //f = ma
        result = force / mass; // throw new AirthmaticException();
        System.out.println("Acceleration - "
                +result);
    }

    public void relativity() throws IOException{

        File file =
                new File("/home/aniruddha/my.txt");
        file.createNewFile();
    }

    public void energy(int m, int c){
        if(c != 3) throw new MyException();

        result = m * c *c;
        System.out.println("Energy is "+result);
    }
}
