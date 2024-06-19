package cn.edu.zust.se.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-17:36
 * @Description:
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<Memento>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
