package person.example.transport;
import person.example.TransportAction;
import person.example.Passenger;
import person.example.City;

public class Plane implements TransportAction {
    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Plane from " + cityFrom + " to " + cityTo);
    }
}
