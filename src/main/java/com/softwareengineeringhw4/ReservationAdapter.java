package com.softwareengineeringhw4;

public class ReservationAdapter implements ReservationSystem {
    private LegacyReservation legacyReservation;

    public ReservationAdapter(LegacyReservation legacyReservation) {
        this.legacyReservation = legacyReservation;
    }

    @Override
    public void reserve() {
        legacyReservation.oldReserveMethod();
    }
}