package com.company;

class Shape{
    private String color = "green";
    private boolean filled = true;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean getFilled(){
        return filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of "+ getColor() +" and " +(getFilled()?"filled":"not filled");
    }
}
class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius = "+getRadius()+", which is a subclass of "+super.toString();
    }
}

class Rectangle extends Shape{
    private double width = 1;
    private double length = 1;
    public Rectangle(){}
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return (width+length)*2;
    }
    public double getPerimeter(){
        return width*length;
    }
    @Override
    public String toString(){
        return "A Rectangle with width = "+getWidth()+" and length = "+getLength()+" ,which is subclass of "+super.toString();
    }
}
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"indigor",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8,"orange",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(2.3,"yellow",true);
        System.out.println(square);


    }

}
