
public class Rectangle extends Figure {
    private int height;
    private int width;

    @Override
    public double getArea(){
        this.area = height * width;
        return this.area;
    }
}
