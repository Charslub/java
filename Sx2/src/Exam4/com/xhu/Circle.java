package com.xhu;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    protected void setR(double r) {
        this.r = r;
    }
    protected double CircleLong(){
        double Long;
        Long=this.r*Math.PI*2;
        return Long;
    }
    public double CircleArea(){
        double Area;
        Area=r*r*Math.PI;
        return Area;
    }
}
