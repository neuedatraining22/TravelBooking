package com.allstate.travel.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class TravelTicket {

    private long bookingRef;
    private String origin;
    private String destination;
    private BigDecimal price;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public TravelTicket() {
    }

    public TravelTicket(long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.bookingRef = bookingRef;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public long getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(long bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void reschedule() {
        System.out.println("I am rescheduling the ticket");
    }

    public void cancel() {
        System.out.println("I am cancelling the ticket");
    }

}
