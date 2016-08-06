package com.codekul.brushup.generics;

/**
 * Created by aniruddha on 6/8/16.
 */
public class AnyOther<T extends Any, U, V> {
}

class Other extends Any<Double>{

    @Override
    public Double getAnything() {
        return super.getAnything();
    }

    @Override
    public void setAnything(Double anything) {
        super.setAnything(anything);
    }
}
