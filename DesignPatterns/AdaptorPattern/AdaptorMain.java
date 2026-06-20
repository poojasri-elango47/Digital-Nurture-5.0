package AdaptorPattern;

public class AdaptorMain {
    public static void main (String [] args ){
        PaymentProcessor gpay=new GpayAdaptor(new GpayGateway());
        gpay.PayAmount(5000);

        PaymentProcessor phonepe=new PhonePeAdaptor(new PhonePeGateway());
        phonepe.PayAmount(4500);
    }
}
