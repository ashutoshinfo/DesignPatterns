package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP2;
public class Circle extends Shape {
    public Circle() {
        setType("Circle");
    }

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

