package cn.edu.zust.se;

import cn.edu.zust.se.VisitorPattern.element.Circle;
import cn.edu.zust.se.VisitorPattern.element.Dot;
import cn.edu.zust.se.VisitorPattern.object.Picture;
import cn.edu.zust.se.VisitorPattern.visitor.AreaVisitor;
import cn.edu.zust.se.VisitorPattern.visitor.DrawVisitor;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-18-13:23
 * @Description:
 */

public class VisitorPatternDemo {
    @Test
    public void test() {
        Picture picture = new Picture();
        picture.add(new Dot(1, 2));
        picture.add(new Circle(3, 4, 5));
        AreaVisitor areaVisitor = new AreaVisitor();
        DrawVisitor drawVisitor = new DrawVisitor();
        System.out.println("Calculate area:");
        picture.accept(areaVisitor);
        System.out.println("\nDraw:");
        picture.accept(drawVisitor);

    }
}
