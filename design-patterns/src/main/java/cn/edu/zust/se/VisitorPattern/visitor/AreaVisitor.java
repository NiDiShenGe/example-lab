package cn.edu.zust.se.VisitorPattern.visitor;

import cn.edu.zust.se.VisitorPattern.element.Circle;
import cn.edu.zust.se.VisitorPattern.element.Dot;
import cn.edu.zust.se.VisitorPattern.inf.Visitor;

/**
 * @Author: ShenYi
 * @Date: 2024-06-13-10:58
 * @Description:
 */
public class AreaVisitor implements Visitor {
    @Override
    public void visit(Dot dot) {
        // 点没有面积
        System.out.println("Dot has no area.");
    }
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle area: " + area);
    }
}
