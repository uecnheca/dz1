package person.example.model;

public class Person {
    protected String type;
    protected String name;
    protected int hp;
    protected int power;

    public Person() {}

    public Person(String name, String type, int hp, int power) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return "name: " + name + ", " + "type: " + type + ", " + "hp: " + hp + ", " + "power: " + power;
    }

}
