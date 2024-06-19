package cn.edu.zust.se.MementoPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-17:34
 * @Description:
 */
public class Originator {
    private String state;
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
