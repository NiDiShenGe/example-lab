package cn.edu.zust.se.FactoryPattern.object;

import cn.edu.zust.se.FactoryPattern.inf.Shape;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-10:41
 * @Description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
