package com.company;

public class Square extends Rectangle {

    public Square(){
        super.setLength(2);
        super.setWidth(2);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return getLength();
    }
    @Override
    public String toString(){
        return "A Square with side = "+getSide()+", which is subclass of "+super.toString();
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
}
