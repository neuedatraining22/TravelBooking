package com.allstate.travel.travelbooking.domain;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "travelClass='" + travelClass + '\'' +
                ", seatNumber=" + seatNumber +
                ", numberOfStopovers=" + numberOfStopovers +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaneTicket that = (PlaneTicket) o;
        return seatNumber == that.seatNumber && numberOfStopovers == that.numberOfStopovers && Objects.equals(travelClass, that.travelClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, seatNumber, numberOfStopovers);
    }
}
