package com.company;

import java.util.Locale;

public class Vector2D {
    double vX, vY;

    public Vector2D(){
        vX = 1;
        vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }
    public Vector2D(Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print(){
        System.out.println(
                String.format(Locale.US,
                        "(%.2f, %.2f)", vX, vY));
    }
}
