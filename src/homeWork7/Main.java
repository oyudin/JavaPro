package homeWork7;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        cat1.run(200);

        Cat cat2 = new Cat("Garfield");
        cat2.run(201);
        cat2.swim(1);

        Dog dog1 = new Dog("Bobik");
        dog1.run(500);
        dog1.swim(10);

        Dog dog2 = new Dog("Archie");
        dog2.run(501);
        dog2.swim(11);

        Animal cat3 = new Cat("Murchyk");

        Animal.animalCounter();
        Cat.catsCounter();
        Dog.godsCounter();

    }
}
