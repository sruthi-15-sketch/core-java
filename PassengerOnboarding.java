/*AirTicket that contains three String data members: passenger, source, and destination. It has a parameterized constructor, getters, and setters.

In a driver class PassengerOnboarding, create an instance of AirTicket class. Also, declare a String data member dateOfJourney in the driver class which receives the date of journey in the dd-mm-yyyy format as a command-line argument.

Print the details of the journey, i.e. doj along with the details of the ticket.*/
class AirTicket {
    String passenger;
    String source;
    String destination;

    AirTicket(String passenger, String source, String destination) {
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

public class PassengerOnboarding {
    public static void main(String[] args) {
        String dateOfJourney;
        AirTicket at = new AirTicket("A018", "Hyderabad", "Pune");
        dateOfJourney = args[0];
        System.out.println(at.getSource());
        at.setDestination("Banglore");
        System.out.println(at.getDestination());
        System.out.println("Passenger: " + at.getPassenger() + "on" + dateOfJourney + "starting from " + at.getSource()
                + "to" + at.getDestination());
    }

}