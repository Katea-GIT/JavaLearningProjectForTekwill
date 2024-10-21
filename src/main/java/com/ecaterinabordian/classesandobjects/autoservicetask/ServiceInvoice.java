package com.ecaterinabordian.classesandobjects.autoservicetask;

public class ServiceInvoice {

    int invoiceNumber;

    int cost;

    String customerName;

    String serviceDetails;

   public ServiceInvoice() {

       this.invoiceNumber = 38043;
       this.cost = 250;
       this.customerName = "Stefan Strong";
       this.serviceDetails = "AutoBMW1";
       System.out.println("A new invoice - " + " " + invoiceNumber + " " + "for customer" + " " + customerName +  " " + "with the cost of" + " " + cost + " " + "euro" + " " + "has ben issued at the service:" + " " + serviceDetails);
    }
}
