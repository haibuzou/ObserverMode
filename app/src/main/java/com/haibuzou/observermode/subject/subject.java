package com.haibuzou.observermode.subject;


import com.haibuzou.observermode.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class subject {

    List<Observer> observers = new ArrayList<>();

    public subject() {

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyChange(){
        for(Observer observer : observers){
            observer.onChange("更新了");
        }
    }
}
