package person.example.model;
import java.util.*;
import java.util.Random;


public class Something extends Player {

    public Something() {

    }

    public Something(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void Move() {
        Random r = new Random();
        int direction = r.nextInt(3);
        int step;
        switch (direction) {
            case 0:
                step = r.nextInt();
                if (y - step > 0) {
                    y -= step;
                    this.count += step;
                }
                break;
            case 1:
                step = r.nextInt();
                if (x + step < fieldWidth) {
                    x += step;
                    this.count = step;
                }
                break;
            case 2:
                step = r.nextInt();
                if (y < fieldHeigth) {
                    y += step;
                    this.count = step;
                }
                break;
            case 3:
                step = r.nextInt();
                if (x  - step > 0) {
                    x -= step;
                    this.count += step;
                }
                break;
        }
    }
}
