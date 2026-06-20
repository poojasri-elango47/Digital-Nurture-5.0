package DSA.Exercise7;

public class FutureValuePredict {
    public static void main(String[] args) {
        Forecast fc=new Forecast();
        double Cv=1000;
        int r=3;
        int yrs=5;
        double val=fc.predict(Cv,r,yrs);
        System.out.println("Current Value: "+Cv)  ;
        System.out.println("Rate: "+r);
        System.out.println("Years: "+yrs);
        System.out.println("Future Predicted is "+val);
    }
}
