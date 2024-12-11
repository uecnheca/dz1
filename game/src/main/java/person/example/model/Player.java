package person.example.model;

public class Player {
    protected String name;
    protected int x;
    protected int y;
    protected static int fieldWidth;
    protected static int fieldHeigth;

    public static void setFieldSize(int width, int heigth) {
        fieldWidth = width;
        fieldHeigth = heigth;
    }
    public Player() {

    }

    public Player (String name) {
        this.name = name;
    }

    public Player (String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString () {
        return "name: " + name + ", положение: (" + x + " , " + y + ")";
    }

    public void Move() {

    }
}
