package com.company;

public class Rectangle extends Square {
    double b;
    public Rectangle(){
        super();
        b = 2;
    }
    public Rectangle(double a, double b){
        super(a);
        if(b >= 0)
            this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + " и " + b;
    }

    @Override
    public double diagonalLength() {
        return Math.sqrt(a * a + b * b);
    }
}
