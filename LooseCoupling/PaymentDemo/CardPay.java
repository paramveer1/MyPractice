package LooseCoupling.PaymentDemo;

public class CardPay implements  Payment{
    public void doPayment(int amt){
        System.out.println(amt + " : paid via Card");
    }

    
}
