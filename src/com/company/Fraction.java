package com.company;

public class Fraction {
    private int num;
    private int denom;

    public static int count = 7;
    static { //статический блок
        count = 3;
    }
    //конструктор по умолчанию
    public Fraction(){
        num = 1;
        denom = 1;
        count++;
    }
    //конструктор с параметрами
    public Fraction(int num, int denom) {
        this.num = num;
        if (denom != 0)
            this.denom = denom;
        else
            this.denom = 1;//не самый лучший способ
        count++;
    }
    //конструктор с параметрами 2
    public Fraction(int num){
        this.num = num;
        denom = 1;
        count++;
    }
    //конструктор копирования
    public Fraction (Fraction original){
        this.num = original.num;
        this.denom = original.denom;
        count++;
    }
    //первый способ вывода объекта на экран ++
    @Override
    public String toString() {
        return num + "/" + denom;
    }
    //второй способ вывода объекта на экран
    public void printFraction(){

        System.out.println(num + "/" + denom);
    }

    public void multyOnKoeff(int koeff){
        num *= koeff;
        if (koeff != 0)
            denom *= koeff;
    }

    public Fraction multyFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num * secondFactor.num;
        result.denom = denom * secondFactor.denom;
        return result;
    }

    //геттеры и сеттеры

//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public int getDenom() {
//        return denom;
//    }
//
//    public void setDenom(int denom) {
//        if (denom != 0)
//            this.denom = denom;
//    }
}
