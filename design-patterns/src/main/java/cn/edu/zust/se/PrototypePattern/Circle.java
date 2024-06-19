package cn.edu.zust.se.PrototypePattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-0:09
 * @Description:
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
