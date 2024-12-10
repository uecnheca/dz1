package person.example.model;

import java.util.function.Predicate;

public class Thrower extends Person {
    private int numberOfCores;

    public Thrower() {}

    public Thrower(String name, String type, int hp, int power, int numberOfCores) {
        super(name, type, hp, power);
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String toString(){
        return "name: " + name + ", type: " + type + ", hp: " + hp + ", power: " + power + ", numberOfCores: " + numberOfCores;
    }

    public void Throw(Person person, Person pers, Person per) {
        person.setHp(person.getHp() - getPower());
        pers.setHp(pers.getHp() - getPower());
        per.setHp(per.getHp() - getPower());
        setNumberOfCores(getNumberOfCores() - 1);
        if (getNumberOfCores() == 0)
            System.out.println("Снарядов больше нет");

    }
}
