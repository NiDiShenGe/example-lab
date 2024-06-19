package cn.edu.zust.se.SingletonPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-11:07
 * @Description:
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject() {}
    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
