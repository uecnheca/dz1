package person.example.model;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private int finishFieldWeight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Player[] players;

    public Game() {

    }

    public Game(int fieldWidth, int fieldHeigth, int finishFieldHeight, int finishFieldWeight, int finishX, int finishY, Player[] players) {
        this.fieldHeigth = fieldHeigth;
        this.fieldWidth = fieldWidth;
        this.players = players;
        this.finishFieldHeight = finishFieldHeight;
        this.finishFieldWeight = finishFieldWeight;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    public Player Start() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].Move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].getX() >= finishX
                        && players[i].getX() <= finishX + finishFieldWeight
                        && players[i].getY() >= finishY
                        && players[i].getY() <= finishY + finishFieldHeight) {
                    return players[i];

                }
            }
        }
    }

}
