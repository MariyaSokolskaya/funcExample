package com.company;

public class Square {
    double a;
    public Square(){
        a = 1;
    }
    public Square(double a){
        if(a >= 0){
            this.a = a;
        }
    }

    @Override
    public String toString() {
        return "Длина стороны: " + a;
    }

    public double diagonalLength(){
        return a * Math.sqrt(2);
    }
}
