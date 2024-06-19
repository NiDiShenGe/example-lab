package cn.edu.zust.se.VisitorPattern.inf;

/**
 * @Author: ShenYi
 * @Date: 2024-06-13-10:53
 * @Description:
 */
public interface Shape {
    void accept(Visitor visitor);
}
