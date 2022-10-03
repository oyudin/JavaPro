package homeWork7;

public class Cat extends Animal {

    private static int catsCount;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    public static void catsCounter() {
        System.out.println("Count of cats: " + catsCount);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) System.out.println("Cats cannot run so long");
        else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim");
    }
}
