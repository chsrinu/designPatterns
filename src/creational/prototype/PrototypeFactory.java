package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public enum ShapeType{
        RECTANGLE,
        SQUARE,
        CIRCLE;
    }
    static Map<ShapeType, Shape> shapeMap = new HashMap<>();

    static{
        shapeMap.put(ShapeType.RECTANGLE, new Rectangle());
        shapeMap.put(ShapeType.CIRCLE, new Circle());
        shapeMap.put(ShapeType.SQUARE, new Square());
    }

    public Shape getInstance(ShapeType type) throws CloneNotSupportedException {
        System.out.println("Cloning "+type.toString());
        return shapeMap.get(type).clone();
    }

}
