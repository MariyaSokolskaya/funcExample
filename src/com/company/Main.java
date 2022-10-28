package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Fraction fraction1 = new Fraction();
//        int d = in.nextInt();
//        Fraction fraction2 = new Fraction(in.nextInt(), d);
//        System.out.println(fraction1);//+++
//        fraction2.printFraction();
//        Fraction fraction3 = new Fraction(3, 7);
//        fraction2.multyOnKoeff(2);
//        System.out.println(fraction2);
//        fraction1 = fraction2.multyFraction(fraction3);
//        System.out.println(fraction1);
//
//        System.out.println(Fraction.count);
//
//        Square square = new Square(3);
//        Rectangle rectangle = new Rectangle();
//        System.out.println(square);
//        System.out.println(rectangle);
//        System.out.println(square.diagonalLength());
//        System.out.println(rectangle.diagonalLength());

        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();

    }
}

