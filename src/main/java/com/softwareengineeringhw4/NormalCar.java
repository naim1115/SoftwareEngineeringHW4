package com.softwareengineeringhw4;

public class NormalCar implements ShareableCar {
    @Override
    public void getFeatures() {
        System.out.println("Standard car features");
    }
    @Override
    public double calculateFee() {
        return 10.0;
    }
}
