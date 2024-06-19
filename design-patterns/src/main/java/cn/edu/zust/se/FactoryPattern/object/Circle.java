package cn.edu.zust.se.FactoryPattern.object;

import cn.edu.zust.se.FactoryPattern.inf.Shape;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-10:42
 * @Description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
