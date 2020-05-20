package HomeWork5;

public class GuideDog extends HomeAnimal {
    private boolean isTrained;

    public GuideDog(String id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    private String trained() {
        if (isTrained) {
            return "and i can take you home.";
        } else {
            return "i'm sorry , i can't take you home.";
        }
    }

    @Override
    public void bark() {
        System.out.printf("Hello, my name is %s, i am a %s, %s\n", getName(), getId(), trained());
    }
}
