package cn.edu.zust.se.MementoPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-17:33
 * @Description:
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
