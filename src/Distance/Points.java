package Distance;

public class Points extends Math {
    private Points p1 = new Points();
    double p1X;
    double p1Y;
    private Points p2 = new Points();
    double p2X;
    double p2Y;


    @Override
    public double getDist() {
        this.dist = java.lang.Math.sqrt(java.lang.Math.pow((p2X - p1X),2) + java.lang.Math.pow((p2Y - p1Y),2));
        return dist;
    }
}
