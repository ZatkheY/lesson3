package HomeWork5;

public class Fish extends HomeAnimal {
    public Fish(String id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void bark() {
        System.out.println("Hello, i am a " + getId() + ", my name is " + getName() + ", Bul - Bul :-)!");
    }
}
