package com.allstate.travel.travelbooking.utilities;

import com.allstate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public class PaypalPaymentService implements PaymentService {

    TravelTicket ticket;

    @Override
    public void requestPayment() {
        System.out.println("Requesting payment from Paypal");
    }

    @Override
    public void addTicket(TravelTicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        return ticket.getPrice().multiply(new BigDecimal("1.2"));
    }

    public void enterPaypalAddress(String email) {

    }

    @Override
    public void processRefund() {

    }
}
