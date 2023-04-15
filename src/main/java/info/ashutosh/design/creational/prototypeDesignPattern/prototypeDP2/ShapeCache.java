package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP2;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> shapeMap = new HashMap<>();

	public static Shape getShape(String shapeId) throws CloneNotSupportedException {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// For each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setType("Circle 1");
		shapeMap.put(circle.getType(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setType("Rectangle 1");
		shapeMap.put(rectangle.getType(), rectangle);

		Circle anotherCircle = new Circle();
		anotherCircle.setType("Circle 2");
		shapeMap.put(anotherCircle.getType(), anotherCircle);
	}
}
