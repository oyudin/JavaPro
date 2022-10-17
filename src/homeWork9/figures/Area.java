package homeWork9.figures;

public class Area implements Squareable {
    private static final double SIDE1 = 15.1;
    private static final double SIDE2 = 15.1;

    @Override
    public double square() {
        return SIDE1*SIDE2;
    }
}
