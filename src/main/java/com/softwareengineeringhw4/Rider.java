package com.softwareengineeringhw4;

import java.util.ArrayList;
import java.util.List;

public class Rider {
    private Mediator mediator;

    public Rider(Mediator mediator) {
        this.mediator = mediator;
    }

    public void postMessage(String message) {
        System.out.println("Rider posting message: " + message);
        mediator.sendMessage(message, this);
    }
}