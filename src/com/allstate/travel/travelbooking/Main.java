package com.allstate.travel.travelbooking;

import com.allstate.travel.travelbooking.domain.PlaneTicket;
import com.allstate.travel.travelbooking.domain.TrainTicket;
import com.allstate.travel.travelbooking.domain.TravelTicket;
import com.allstate.travel.travelbooking.exceptions.InvalidTravelDurationException;
import com.allstate.travel.travelbooking.utilities.BookingManager;
import com.allstate.travel.travelbooking.utilities.CreditCardPaymentService;
import com.allstate.travel.travelbooking.utilities.PaymentService;
import com.allstate.travel.travelbooking.utilities.PaypalPaymentService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        TrainTicket t = new TrainTicket();
        PlaneTicket p = new PlaneTicket();

        p.setSeatNumber(17);
        p.setNumberOfStopovers(0);
        p.setDestination("LAX");

        PlaneTicket p2 = new PlaneTicket();
        p2.setSeatNumber(17);
        p2.setNumberOfStopovers(0);
        p2.setDestination("LAX");

        System.out.println(p == p2);
        System.out.println(p.equals(p2));

        int a = 7;
        int b = 7;
        System.out.println(a == b);

        BigDecimal lowPrice = new BigDecimal(10);
        BigDecimal highPrice = new BigDecimal("10");

        System.out.println(lowPrice == highPrice);
        System.out.println( lowPrice.equals(highPrice));

        System.out.println(p.getClass());
        System.out.println(t.getClass());

        System.out.println(p.toString());
        System.out.println(p);
        p.reschedule();

        try {
            TrainTicket trainFromChicagoToBoston = new TrainTicket(123,"Chicago", "Boston", new BigDecimal("125.22"),
                    LocalDateTime.of(2022,8,9,16,25),
                    LocalDateTime.of(2022,8,8,4,25), 1, 6, 22);
            System.out.println("The train ticket was created");
        } catch (InvalidTravelDurationException e) {
            System.out.println("You cannot arrive before you depart");
        }

        System.out.println("That is the end");

        List<TravelTicket> travelTickets = new ArrayList<>();
        travelTickets.add(p);
        travelTickets.add(p2);
        travelTickets.add(t);

        for(TravelTicket travelTicket : travelTickets) {
            System.out.println(travelTicket);
            if(travelTicket instanceof PlaneTicket) {
                System.out.println("this is a plane ticket");
                PlaneTicket pt = (PlaneTicket)travelTicket;

            }
            if(travelTicket instanceof TrainTicket) {
                System.out.println("This is a train ticket");
            }
        }

        p2.setPrice(new BigDecimal("65.99"));

        PaymentService paymentService = new PaypalPaymentService();
        PaymentService paymentService1 = new CreditCardPaymentService();
        PaymentService paymentService2 = PaymentService.getInstance(); //THE DEFAULT PAYMENT SERVICE
        BookingManager bookingManager = new BookingManager(paymentService1);
        bookingManager.start();
        bookingManager.addTicket(p2);


    }
}
