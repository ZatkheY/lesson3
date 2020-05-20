package HomeWork5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = createAnimal();
        for (Animal animal : animals) {
            animal.bark();
        }
    }

    public static Animal[] createAnimal() {
        Dog dog = new Dog("Dog", 5, 8, "black", "Tuzik", true);
        Cat cat = new Cat("Cat", 3, 2, "grey", "Alex", true);
        Wolf wolf = new Wolf("Wolf", 3, 10, "grey", true);
        Lion lion = new Lion("Lion", 6, 15, "yellow", true);
        Giraffe giraffe = new Giraffe("Giraffe", 8, 150, "yellow", false);
        Alligator alligator = new Alligator("Alligator", 12, 120, "green", true);
        Hamster hamster = new Hamster("Hamster", 1, 0.2, "white", "Bonya", false);
        GuideDog guideDog = new GuideDog("GuideDog", 7, 9, "black", "Jack", true, true);
        Fish fish = new Fish("Fish", 2, 0.1, "blue", "Nemo", false);
        return new Animal[]{dog, cat, wolf, lion, giraffe, alligator, hamster, guideDog, fish};
    }
}

