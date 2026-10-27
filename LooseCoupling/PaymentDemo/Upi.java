package LooseCoupling.PaymentDemo;

public class Upi implements Payment {

    public void doPayment(int amt){
        System.out.println(amt + " rs , paid via UPI");
    }
    
}
