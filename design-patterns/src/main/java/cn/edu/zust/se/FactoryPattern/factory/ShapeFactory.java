package cn.edu.zust.se.FactoryPattern.factory;

import cn.edu.zust.se.FactoryPattern.inf.Shape;
import cn.edu.zust.se.FactoryPattern.object.Circle;
import cn.edu.zust.se.FactoryPattern.object.Rectangle;
import cn.edu.zust.se.FactoryPattern.object.Square;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-10:43
 * @Description:
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
