package cn.edu.zust.se.PrototypePattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-0:08
 * @Description:
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
