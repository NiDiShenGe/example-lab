package cn.edu.zust.se.VisitorPattern.object;

import cn.edu.zust.se.VisitorPattern.inf.Shape;
import cn.edu.zust.se.VisitorPattern.inf.Visitor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYi
 * @Date: 2024-06-18-13:20
 * @Description:
 */
@Data
public class Picture {
    private List<Shape> shapes=new ArrayList<Shape>();
    public void add(Shape shape) {
        shapes.add(shape);
    }
    public void accept(Visitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
