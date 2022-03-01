package week4.Wednesday;

class AirTicket {
    String passenger;
    String source;
    String destination;

    public AirTicket(String passenger, String source, String destination) {
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

    @Override
    public String toString() {
        return "destination: " + destination + ", passenger: " + passenger + ", source: " + source;
    }

}

public class PassengerOnboarding {
    public static void main(String[] args) {
        AirTicket obj = new AirTicket("Nezuko", "Tokyo", "Kyoto");
        System.out.println("The details of your ticket are: ");
        System.out.println(obj);
        String dateofJourney = args[0] + "-" + args[1] + "-" + args[2];

        System.out.println("Date of journey: " + dateofJourney);

    }

}
