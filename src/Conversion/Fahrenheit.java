package Conversion;

public class Fahrenheit extends Conversion {
    private double tempF;



    @Override
    public double getTemperature() {
        this.temp = (tempF - 32) * (5/9);
        return temp;
    }
}
