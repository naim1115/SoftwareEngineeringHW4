package com.softwareengineeringhw4;

import com.softwareengineeringhw4.Observer;


public class RiderObserver implements Observer {
    private String name;

    public RiderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}