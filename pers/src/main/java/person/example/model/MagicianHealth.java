package person.example.model;

public class MagicianHealth extends Magician {
    private String magic;

    public MagicianHealth() {
    }

    public MagicianHealth(String name, String type, int hp, int power, int mana, String magic) {
        super(name, type, hp, power, mana);
        this.magic = magic;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String toString() {
        return "name: " + name + ", type: " + type + ", hp: " + hp + ", power: " + power + ", magic: " + magic;
    }

    public void Support(Person person) {
        person.setHp(person.getHp() + getPower()*3);
        setMana(getMana() - getPower());
    }

    public void ApplyMagic(Person person) {
        person.setHp(person.getHp() - getPower());
        setMana(getMana() - getPower());
    }

}