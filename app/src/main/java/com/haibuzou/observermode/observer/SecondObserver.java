package com.haibuzou.observermode.observer;


import android.util.Log;

public class SecondObserver implements Observer<String>{

    @Override
    public void onChange(String data) {
        Log.d("AAA","接收到了推送的消息: "+data);
    }
}
