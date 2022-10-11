package homeWork7;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 200, 1);
        Dog dog1 = new Dog("Bobik", 600, 10);

        Animal.animalCounter();
        Cat.catsCounter();
        Dog.godsCounter();
    }
}
