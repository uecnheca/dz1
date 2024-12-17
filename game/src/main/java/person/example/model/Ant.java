package person.example.model;
import java.util.*;
import java.util.Random;

public class Ant extends Player {

    public Ant() {

    }

    public Ant(int x, int y) {
        super("Муравей", x, y);
    }

    @Override
    public void Move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 0) {
                    --y;
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
                    --x;
                    this.count += 1;
                }
                break;
        }
    }
}
