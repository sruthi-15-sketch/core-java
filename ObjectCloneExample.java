class Address {
    Location location;
    String state;
    String country;

    public Address() {
    }

    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }
}

class Location {
    String street;
    String city;

    public Location() {
    }

    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class UPIPaymentApps implements Cloneable {
    String name;
    String country;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfficeLocation;

    public UPIPaymentApps(String name, String country, int dailyLimit, double maxDailyAmount,
            Address headOfficeLocation) {
        this.name = name;
        this.country = country;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfficeLocation = headOfficeLocation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Location locat = new Location(this.headOfficeLocation.location.street, this.headOfficeLocation.location.city);
        Address newDependencyObj = new Address(locat, this.headOfficeLocation.state, this.headOfficeLocation.country);
        return new UPIPaymentApps(this.name, this.country, this.dailyLimit, this.maxDailyAmount, newDependencyObj);
    }

    @Override
    public String toString() {
        return "UPIPaymentApps [country=" + country + ", dailyLimit=" + dailyLimit + ", headOfficeLocation="
                + headOfficeLocation + ", maxDailyAmount=" + maxDailyAmount + ", name=" + name + "]";
    }
}

public class ObjectCloneExample {
    public static void main(String[] args) throws Exception {
        Location location = new Location("Madhura Nagar", "Nizampet");
        Address address = new Address(location, "Telangana", "India");
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", "India", 10, 300000, address);
        System.out.println(bhim);

        UPIPaymentApps Paytm = (UPIPaymentApps) bhim.clone();
        System.out.println(Paytm);
        Paytm.headOfficeLocation.location.city = "Bhimavaram";
        Paytm.headOfficeLocation.state = "Andhra Pradesh";
        System.out.println(bhim.headOfficeLocation.location.city);
        System.out.println(Paytm.headOfficeLocation.location.city);
        System.out.println(bhim.headOfficeLocation.state);
        System.out.println(Paytm.headOfficeLocation.state);

    }
}