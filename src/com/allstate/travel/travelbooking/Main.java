package com.allstate.travel.travelbooking;

import com.allstate.travel.travelbooking.domain.PlaneTicket;
import com.allstate.travel.travelbooking.domain.TrainTicket;

import java.math.BigDecimal;


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

    }
}
