package Figure;

public class Circle extends Figure  {
    private double r;


    @Override
    public double getArea() {
        this.area = Math.pow(r, 2) * Math.PI;
        return area;
    }
}
