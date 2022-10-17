package homeWork9.figures;

public class Circle implements Squareable {

    private static final double PI = 3.14159265;
    private static final double RADIUS = 15.1;

    @Override
    public double square() {
        return PI*(RADIUS * RADIUS);
    }
}
