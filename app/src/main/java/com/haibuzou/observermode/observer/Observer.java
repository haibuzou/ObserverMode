package com.haibuzou.observermode.observer;



public interface Observer<T> {
        void onChange(T data);
}
