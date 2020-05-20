package HomeWork5;

public class Dog extends HomeAnimal {


    public Dog(String id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void bark() {
        System.out.println("Hello, my name is " + getName() + ", i am a " + getId() + " \"Woof - Woof\"!");
    }
}
