package com.company;

public class player <T> implements Runnable {
    private T runnerId;

    public player(T runnerId) {
        this.runnerId = runnerId;
    }


    @Override
    public Object starRanning() {
        System.out.println(runnerId+" ranner"+" nachal bejat");
        return null;
    }
}



