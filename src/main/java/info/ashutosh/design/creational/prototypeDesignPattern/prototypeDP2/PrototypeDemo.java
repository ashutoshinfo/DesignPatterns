package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP2;
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("Circle 1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("Rectangle 1");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("Circle 2");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
