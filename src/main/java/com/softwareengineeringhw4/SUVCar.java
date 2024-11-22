package com.softwareengineeringhw4;

class SUVCar implements ShareableCar {
    @Override
    public void getFeatures() {
        System.out.println("SUV car features");
    }

    @Override
    public double calculateFee() {
        return 20.0;
    }
}

