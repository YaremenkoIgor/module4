package Conversion;

public class Celsius extends Conversion {
    private double tempC;

    @Override
    public double getTemperature() {
        this.temp = tempC * (9/5) + 32;
        return temp;
    }
}
