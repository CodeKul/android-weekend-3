package com.codekul.langfunda;

/**
 * Created by aniruddha on 24/7/16.
 */
public class Car {

    private int color;
    private int model; // state -> properties -> fileds
    private float speed;

    public Car(){ //default constructor
        color = 255;
        model = 1;
        speed = 0;
    }

    public Car(int c, int m, int s) {
        color = c;
        model = m;
        speed = s;
    }

    public Car(Car car){
        color = car.getColor();
        model = car.getModel();
        speed = car.getSpeed();
    }

    public void showCarColor(){
        System.out.println(" Car Colore is "+color);
    }

    public void calculateSpeed(){
        int rpm = 100;
        speed = rpm * 2;
    }

    public void calculateSpeed(int rpm){
        return;
    }



    public float getSpeed() {
        return speed;
    }

    public int getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }
}
