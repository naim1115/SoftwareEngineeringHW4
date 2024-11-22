package com.softwareengineeringhw4;

// Factory Class
public class CarFactory {
    public ShareableCar createCar(String carType) {
        switch (carType.toLowerCase()) {
            case "normal":
                return new NormalCar();
            case "luxury":
                return new LuxuryCar();
            case "suv":
                return new SUVCar();
            case "wheelchair":
                return new WheelchairAccessibleCar();
            default:
                throw new IllegalArgumentException("Unknown car type: " + carType);
        }
    }
}