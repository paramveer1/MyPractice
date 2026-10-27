package LooseCoupling.PaymentDemo;

public class Launch {
    public static void main(String[] args) {
       
        PaymentLogic paymentLogic = new PaymentLogic();
     paymentLogic.doPayment(new Upi(), 1000);
        
    }
    
}
