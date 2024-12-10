package person.example.model;

public class Magician extends Person {
    private int mana;


    public Magician(String name, String type, int hp, int power, int mana) {
        super(name, type, hp, power);
        this.mana = mana;
    }

    public Magician() {
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String toString(){
        return "name: " + name + ", type: " + type + ", hp: " + hp + ", power: " + power + ", mana: " + mana;
    }

    public void Support(Person person) {
        person.setHp(person.getHp() + getPower());
        setMana(getMana() - getPower());
    }

    public void ApplyMagic(Person person) {
        person.setHp(person.getHp() - getPower());
        setMana(getMana() - getPower());
    }
}
