package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP2;
public class Rectangle extends Shape {
    public Rectangle() {
        setType("Rectangle");
    }

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

