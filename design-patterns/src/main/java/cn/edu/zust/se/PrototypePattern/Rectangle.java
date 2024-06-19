package cn.edu.zust.se.PrototypePattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-11:25
 * @Description:
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
