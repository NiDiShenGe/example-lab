package cn.edu.zust.se.VisitorPattern.element;

import cn.edu.zust.se.VisitorPattern.inf.Shape;
import cn.edu.zust.se.VisitorPattern.inf.Visitor;
import lombok.Data;

/**
 * @Author: ShenYi
 * @Date: 2024-06-13-10:55
 * @Description:
 */
@Data
public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
