package com.allstate.travel.travelbooking.domain;

public class PlaneTicket extends TravelTicket {

    private String travelClass;
    private int seatNumber;
    private int numberOfStopovers;

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getNumberOfStopovers() {
        return numberOfStopovers;
    }

    public void setNumberOfStopovers(int numberOfStopovers) {
        this.numberOfStopovers = numberOfStopovers;
    }

    @Override
    public void reschedule() {
        System.out.println("I'm rescheduling the plane ticket");
    }
}
