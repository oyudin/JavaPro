package homeWork7;

public class Dog extends Animal {

    private static int dogsCount;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        dogsCount++;
    }

    public static void godsCounter() {
        System.out.println("Count of dogs: " + dogsCount);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) System.out.println("Dogs cannot run so long");
        else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) System.out.println("Dogs cannot swim so long");
        else super.swim(distance);
    }
}
