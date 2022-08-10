package com.allstate.travel.travelbooking.utilities;

import com.allstate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public void requestPayment() {
        System.out.println("Taking card payment");
    }

    @Override
    public void addTicket(TravelTicket ticket) {

    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        return BigDecimal.ZERO;
    }
}
