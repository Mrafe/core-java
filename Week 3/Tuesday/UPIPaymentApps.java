class Location {
    String street;
    String city;

    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\t\tcity : " + city + ", street : " + street;
    }
}

class Address implements Cloneable {
    Location location;
    String state;
    String country;

    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "country : " + country + ", state : " + state + "\n" + location;
    }

}

public class UPIPaymentApps implements Cloneable {
    String appName;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfficeLocation;

    public UPIPaymentApps() {
    }

    public UPIPaymentApps(String appName, int dailyLimit, double maxDailyAmount, Address headOfficeLocation) {
        this.appName = appName;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfficeLocation = headOfficeLocation;
    }

    @Override
    public String toString() {
        return "UPIPaymentApps [appName=" + appName + ", dailyLimit=" + dailyLimit + ", maxDailyAmount="
                + maxDailyAmount + "\n\t\theadOfficeLocation="
                + headOfficeLocation + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Location clone1 = new Location(headOfficeLocation.location.street, headOfficeLocation.location.city);
        Address newObj = new Address(clone1, headOfficeLocation.state, headOfficeLocation.country);
        return new UPIPaymentApps(this.appName, this.dailyLimit, this.maxDailyAmount, newObj);
    }

}

class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {

        Location location = new Location("Bandra(East)", "Mumbai");
        Address address = new Address(location, "Maharashtra", "India");
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", 10, 100000, address);
        UPIPaymentApps paytm = (UPIPaymentApps) bhim.clone();
        paytm.appName = "Paytm";
        paytm.headOfficeLocation.location.city = "Noida";
        paytm.headOfficeLocation.location.street = "Sector 5";
        paytm.headOfficeLocation.state = "Uttar Pradesh";
        System.out.println(
                "\n\n" + bhim + "\n\n\n");
        System.out.println(paytm);

        // UPIPaymentApps bhim = new UPIPaymentApps();
        // UPIPaymentApps phonePe = (UPIPaymentApps) bhim.clone();
        // phonePe.appName = "PhonePe";
        // UPIPaymentApps gpay = (UPIPaymentApps) bhim.clone();
        // gpay.appName = "Gpay";

        // System.out.println(bhim);
        // System.out.println(phonePe);
        // System.out.println(gpay);

    }
}