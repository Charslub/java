package com.xhu;

public class pillar {
    private double High;
    private Circle round;

    public pillar(double high, Circle round) {
        High = high;
        this.round = round;
    }

    public double getHigh() {
        return High;
    }

    public void setHigh(double high) {
        High = high;
    }

    public Circle getRound() {
        return round;
    }

    public void setRound(Circle round) {
        this.round = round;
    }
    protected double Volume(){
        return round.CircleArea()*High;
    }

    @Override
    public String toString() {
        return "The volume of this is:"+Volume()+".";
    }
}
