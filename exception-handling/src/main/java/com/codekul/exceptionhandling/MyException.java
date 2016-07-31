package com.codekul.exceptionhandling;

/**
 * Created by aniruddha on 31/7/16.
 */
public class MyException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid physics data";
    }

    @Override
    public String toString() {
        return "Occured due to bad data";
    }
}
