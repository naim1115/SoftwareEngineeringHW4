package com.softwareengineeringhw4;

// Luxury Car
class LuxuryCar implements ShareableCar {
    @Override
    public void getFeatures() {
        System.out.println("Luxury car features");
    }
    @Override
    public double calculateFee() {
        return 25.0;
    }
}