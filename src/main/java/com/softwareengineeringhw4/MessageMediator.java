package com.softwareengineeringhw4;

import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void sendMessage(String message, Rider rider) {
        System.out.println("Mediator handling message: " + message);

        for (Observer observer : observers) {
            if (!observer.equals(rider)) { // Avoid self-notifications
                observer.update(message);
            }
        }
    }
}