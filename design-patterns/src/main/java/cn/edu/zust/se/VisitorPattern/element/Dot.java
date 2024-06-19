package cn.edu.zust.se.VisitorPattern.element;

import cn.edu.zust.se.VisitorPattern.inf.Shape;
import cn.edu.zust.se.VisitorPattern.inf.Visitor;
import lombok.Data;

/**
 * @Author: ShenYi
 * @Date: 2024-06-13-10:53
 * @Description:
 */
@Data
public class Dot implements Shape {
    private int x;
    private int y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
