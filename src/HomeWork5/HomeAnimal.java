package HomeWork5;

public class HomeAnimal extends Animal {
    private String name;
    private boolean isVaccinated;

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public HomeAnimal(String id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
}
