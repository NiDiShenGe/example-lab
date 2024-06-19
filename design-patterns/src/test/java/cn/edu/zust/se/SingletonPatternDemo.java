package cn.edu.zust.se;

import cn.edu.zust.se.SingletonPattern.SingleObject;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-11:08
 * @Description:
 */
public class SingletonPatternDemo {
    @Test
    public void test() {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
