package person.example.model;
import java.util.*;
import java.util.Random;


public class Turtle extends Player {

    public Turtle() {

    }

    public Turtle(int x, int y) {
        super("Черепаха", x, y);
    }

    @Override
    public void Move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 1) {
                    y -= 2;
                    this.count += 1;
                }
                break;
            case 1:
                if (x < fieldWidth) {
                    ++x;
                    this.count += 1;
                }
                break;
            case 2:
                if (y < fieldHeigth) {
                    ++y;
                    this.count += 1;
                }
                break;
            case 3:
                if (x > 0) {
                    x -= 2;
                    this.count += 1;
                }
                break;
        }
    }
}
