package com.allstate.travel.travelbooking.utilities;

import com.allstate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public interface PaymentService {

    public void requestPayment();
    public void addTicket(TravelTicket ticket);
    public BigDecimal getTotalIncludingTaxesAndFees();

    //default = backwards compatability only - REMOVE AS SOON AS WE CAN
    default public void processRefund() {
        System.out.println("This feature has not yet been implemented");
    }

    //GET THE DEFAULT IMPLEMENTATION
    static PaymentService getInstance() {
        return new PaypalPaymentService();
    }
}
