package AdaptorPattern;

public class GpayAdaptor implements PaymentProcessor {

    private GpayGateway gpay;
    public GpayAdaptor (GpayGateway gpay){
        this.gpay=gpay;
    } 
    public void PayAmount(double amt){
        gpay.MakePayment(amt);
    }
    
}
