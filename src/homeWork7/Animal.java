package homeWork7;

public class Animal {

    private String name;
    private static int animalsCount;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        run(runDistance);
        swim(swimDistance);
        animalsCount++;
    }

    public static void animalCounter() {
        System.out.println("Count of animals: " + animalsCount);
    }

    public void run(int distance) {
        System.out.println(name + " has run " + distance + 'm');
    }

    public void swim(int distance) {
        System.out.println(name + " has swum " + distance + 'm');
    }
}
