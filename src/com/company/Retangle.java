package com.company;

public class Retangle extends Square {
    private double b;

    public Retangle(){
//       x=0;
//       y=0;
//       a=1;
        super();
        b = 1;
    }

    public Retangle(double x, double y, double a, double b) {
        super(x, y, a);
        if (b >= 0)
        this.b = b;
        else this.b = -b;
    }

    @Override
    public String toString() {
        return super.toString() + "\nb=" + b;
    }

    public double square(){
        return getA() * b;
    }

    @Override
    public double lengthDiag() {
        return Math.sqrt(getA()*getA() + b*b);
    }
}
