package main.java.hello;

public class Triangle {

    private double height;
    private double base;

    public Triangle() {
        height = 1;
        base   = 1;
    }

    public Triangle(double base, double height) {
        this.base   = base;
        this.height = height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;

    }

    public void setBase(double newBase) {
        base = newBase;

    }

    public double area() {
        double TriangleArea;
        TriangleArea = base * height / 2;
        return (TriangleArea);
    }

    public double perimeter() {
        double TriangelPerimeter;
        TriangelPerimeter = base * 3;
        return (TriangelPerimeter);
    }

    public double getHeight() {
        return (height);
    }

    public double getBase() {
        return (base);
    }
}

