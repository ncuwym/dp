package d3.test6;

import java.util.ArrayList;
//抽象目标类，
public abstract class Subject {
    ArrayList<Observer> observerList  = new ArrayList<Observer>();
    //添加所属对象
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    //通知所属对象状态属性改变的方法
    public void notifyObserver() {
        for (Observer obs: observerList) {
            obs.update(this);
        }
    }
}
