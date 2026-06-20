package DSA.Exercise7;

public class Forecast {

    public double  predict(double CurrentValue, int Rate, int yrs ){
        if(yrs==0){
            return CurrentValue;
        }
        else 
            return predict(CurrentValue, Rate, yrs-1)*(1+Rate);
    }
    
}
