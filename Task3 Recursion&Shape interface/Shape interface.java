package com.example.myapplication;
import java.awt.Graphics;
import javax.swing.JFrame;


public interface Shape {

    void draw();

    double getArea();

}
class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){

        super("Circle In GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;

    }
}
class Triangle implements Shape {

    private double length;
    private double width;

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
    }

    @Override
    public double getArea() {

        return (length * width)/2;
    }
}
class Rectangle extends JFrame implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){


    }


    @Override
    public double getArea(){

        return length * width;
    }
}


    public static void main(String[]args)
    {

        CircleInGUI  obj =new CircleInGUI();
    }