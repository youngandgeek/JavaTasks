package com.example.myapplication;

abstract class GeoShape {
    double dim1;

    public GeoShape() {
        this.dim1 = dim1;
    }
 public  GeoShape(double dim1){
       this.dim1=dim1;
 }


    public double getDim() {
        return dim1;
    }

    public void setDim(double dim1) {
        this.dim1 = dim1;
    }
    abstract double area();
}


class Rectangle extends GeoShape{
     double dim2;

    public Rectangle(double dim2) {
        this.dim2 = dim2;
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1);
        this.dim2 = dim2;
        this.dim2 = dim2;
    }

     public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public double getDim2() {
        return dim2;
    }

    double area() {
        return dim1*dim2;
    }
}
//Create Circle class inherited from GeoShape
class Circle extends GeoShape{

    public Circle() {
    }

    public Circle(double dim1) {
    this.dim1=dim1;
    }


    @Override
    double area() {
        return Math.PI * dim1 * dim1;
    }
}


//Create Triangle inherited from GeoShape
class Triangle extends GeoShape{
private double dim2;

    public Triangle(double dim2) {
        this.dim2 = dim2;
    }

    public Triangle(double dim1, double dim2) {
        super(dim1);
        this.dim2 = dim2;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    @Override
    double area() {
        return (dim1*dim2)/2;
    }
}


class Main {
    public static void main(String[] args) {

       Rectangle a=new Rectangle(2.4,3.1);
       System.out.println("area of Rectangle="+a.area());
       Circle c=new Circle(7);
       System.out.println("area of Circle="+c.area());
       Triangle  t=new Triangle(3,5);
        System.out.println("area of Triangle="+t.area());

    }
    }
