package com.softwareengineeringhw4;

// Wheelchair Accessible Car
class WheelchairAccessibleCar implements ShareableCar {
    @Override
    public void getFeatures() {
        System.out.println("Wheelchair accessible car features");
    }
    @Override
    public double calculateFee() {
        return 15.0;
    }
}

