package person.example.model;

public class Warrior extends Person {
    private int armor;

    public Warrior() {}

    public Warrior(String name, String type, int hp, int power, int armor) {
        super(name, type, hp, power);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setWeapon() {
        this.armor = armor;
    }

    public String toString(){
        return "name: " + name + ", type: " + type + ", hp: " + hp + ", power: " + power + ", armor: " + armor;
    }

    public void Attack(Person person) {
        person.setHp(person.getHp() - getPower());

    }
}
