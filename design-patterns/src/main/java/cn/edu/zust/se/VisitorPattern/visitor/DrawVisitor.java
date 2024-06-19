package cn.edu.zust.se.VisitorPattern.visitor;

import cn.edu.zust.se.VisitorPattern.element.Circle;
import cn.edu.zust.se.VisitorPattern.element.Dot;
import cn.edu.zust.se.VisitorPattern.inf.Visitor;

/**
 * @Author: ShenYi
 * @Date: 2024-06-18-13:15
 * @Description:
 */
public class DrawVisitor implements Visitor {
    @Override
    public void visit(Dot dot) {
        System.out.println("Draw a dot at (" + dot.getX() + ", " + dot.getY() + ")");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Draw a circle at (" + circle.getX() + ", " + circle.getY() + ") with radius " + circle.getRadius());
    }
}
