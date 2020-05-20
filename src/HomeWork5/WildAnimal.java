package HomeWork5;

public class WildAnimal extends Animal {
    private boolean isPredator;

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public WildAnimal(String id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    private String predator() {
        if (isPredator) {
            return ", and I am angry.";
        } else {
            return ", and I'm not evil.";
        }
    }

    @Override
    public void bark() {
        System.out.printf("Hello, i am a wild animal, i am a %s, %s\n", getId(), predator());
    }
}
