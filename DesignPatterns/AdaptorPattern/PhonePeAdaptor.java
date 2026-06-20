package AdaptorPattern;

public class PhonePeAdaptor implements PaymentProcessor{

    private PhonePeGateway phonepe;
    public PhonePeAdaptor(PhonePeGateway phonepe){
        this.phonepe=phonepe;
    }
    
    public void  PayAmount(double amt){
        phonepe.DoPayment(amt);
    }
}
