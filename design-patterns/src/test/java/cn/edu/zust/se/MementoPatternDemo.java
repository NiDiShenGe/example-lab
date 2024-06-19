package cn.edu.zust.se;

import cn.edu.zust.se.MementoPattern.CareTaker;
import cn.edu.zust.se.MementoPattern.Originator;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-17:38
 * @Description:
 */
public class MementoPatternDemo {
    @Test
    public void test() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
