package com.softwareengineeringhw4;

interface Mediator {
    void sendMessage(String message, Rider rider);
    void addObserver(Observer observer);
}