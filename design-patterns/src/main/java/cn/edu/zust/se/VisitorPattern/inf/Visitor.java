package cn.edu.zust.se.VisitorPattern.inf;

import cn.edu.zust.se.VisitorPattern.element.Circle;
import cn.edu.zust.se.VisitorPattern.element.Dot;

/**
 * @Author: ShenYi
 * @Date: 2024-06-13-10:53
 * @Description:
 */
public interface Visitor {
    void visit(Dot dot);
    void visit(Circle circle);
}
