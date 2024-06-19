package cn.edu.zust.se;

import cn.edu.zust.se.PrototypePattern.Shape;
import cn.edu.zust.se.PrototypePattern.ShapeCache;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-1:01
 * @Description:
 */
public class PrototypePatternDemo {
    @Test
    public void test() {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        clonedShape.draw();
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}
