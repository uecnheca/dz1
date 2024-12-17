package person.example.transport;
import person.example.TransportAction;
import person.example.Passenger;
import person.example.City;

public class Ship implements TransportAction{
    private int boardNumber;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Ship from " + cityFrom + " to " + cityTo);
    }

    public int getBortNumber() {
        return boardNumber;
    }

    public void setBortNumber(int bortNumber) {
        this.boardNumber = bortNumber;
    }

}
