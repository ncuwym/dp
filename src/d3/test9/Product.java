package d3.test9;

import java.util.ArrayList;
//抽象商品类
public abstract class Product {
    ArrayList<Observer> observerList = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    public void notifyObserver() {
        for (Observer obs : observerList) {
            obs.update(this);
        }
    }
}
