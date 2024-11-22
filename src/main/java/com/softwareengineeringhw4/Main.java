package com.softwareengineeringhw4;

import com.softwareengineeringhw4.*;

public class Main {
    public static void main(String[] args) {

        //#7 Main Code

        // Create mediator
        MessageMediator mediator = new MessageMediator();

        // Create observers
        RiderObserver rider1 = new RiderObserver("Rider 1");
        RiderObserver rider2 = new RiderObserver("Rider 2");
        RiderObserver rider3 = new RiderObserver("Rider 3");

        // Add observers to mediator
        mediator.addObserver(rider1);
        mediator.addObserver(rider2);
        mediator.addObserver(rider3);

        // Create a rider and send a message
        Rider broadcaster = new Rider(mediator);
        broadcaster.postMessage("New ride available!");

        //#8 Main Code

        CarFactory factory = new CarFactory();
        // Create and test each type of car
        ShareableCar normalCar = factory.createCar("normal");
        normalCar.getFeatures();
        System.out.println("Fee: $" + normalCar.calculateFee());
        ShareableCar luxuryCar = factory.createCar("luxury");
        luxuryCar.getFeatures();
        System.out.println("Fee: $" + luxuryCar.calculateFee());
        ShareableCar suvCar = factory.createCar("suv");
        suvCar.getFeatures();
        System.out.println("Fee: $" + suvCar.calculateFee());
        ShareableCar wheelchairCar = factory.createCar("wheelchair");
        wheelchairCar.getFeatures();
        System.out.println("Fee: $" + wheelchairCar.calculateFee());

        //#9 Main Code

        // Legacy code that we want to reuse
        LegacyReservation legacyReservation = new LegacyReservation();
        // Adapter to use legacy code with the new interface
        ReservationSystem reservationSystem = new ReservationAdapter(legacyReservation);
        // Client uses the new interface
        reservationSystem.reserve();


    }
}