package homeWork9.figures;

public class Triangle implements Squareable {

    private static final double SIDE1 = 16.4;
    private static final double SIDE2 = 20.3;

    @Override
    public double square() {
        return (SIDE1 * SIDE2) / 2;
    }
}
