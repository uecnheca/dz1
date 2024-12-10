package person.example.model;

public class MagicianDamage extends Magician {
    private int army;

    public MagicianDamage() {}

    public MagicianDamage(String name, String type, int hp, int power, int mana, int army) {
        super(name, type, hp, power, mana);
        this.army = army;
    }

    public int getArmy() {
        return army;
    }

    public void setArmy(int army) {
        this.army = army;
    }

    public String toString(){
        return "name: " + name + ", type: " + type + ", hp: " + hp + ", power: " + power + ", army: " + army;
    }

    public void Support(Person person) {
        person.setHp(person.getHp() + getPower());
        setMana(getMana() - getPower());
    }

    public void ApplyMagic(Person person) {
        person.setHp(person.getHp() - ((getArmy()/2) + getPower()));
        setMana(getMana() - getPower());
    }


}
