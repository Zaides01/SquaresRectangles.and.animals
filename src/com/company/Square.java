package com.company;

public class Square {
    private double x, y;
    private double a;

    //служебные методы
    public Square(){
        x=0;
        y=0;
        a=1;
    }

    public Square(double x, double y, double a) {
        this.x = x;
        this.y = y;
        if (a>=0)
        this.a = a;
        else this.a = -a;
    }

    public double getA() {
        return a;
    }

    //вычислительные методы
    public double lengthDiag(){
        return Math.sqrt(2)*a;
    }

    //методы поддержки

    @Override
    public String toString() {
        return "(" + x + "," + y + ")\na=" + a;
    }
}
