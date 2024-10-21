package com.ecaterinabordian.classesandobjects.autoservicetask;

public class ServiceInvoice {

    int invoiceNumber;

    int cost;

    String serviceDetails;

   public ServiceInvoice(int invoiceNumber, int cost, String serviceDetails) {

       this.invoiceNumber = 38043;
       this.cost = 250;
       this.serviceDetails = "AutoBMW1";
       System.out.println("A new invoice" + " " + invoiceNumber + " " + "with the cost:" + " " + "has ben issued at the service:" + " " + serviceDetails);
    }
}
