import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

interface Client {
    double getCharges();

    double calculatePayment(GregorianCalendar dateOfAgreement);

    void sendEmail(double payment);
}

abstract class CustomerBusiness implements Client, Comparable<CustomerBusiness> {
    String id;
    String name;
    String email;
    double charges;
    GregorianCalendar dateOfAgreement;

    public CustomerBusiness(String id, String name, String email, double charges, GregorianCalendar dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }

    public double getCharges() {
        return charges;
    }

    public double calculatePayment(GregorianCalendar invoiceDate) {
        int date = invoiceDate.get(Calendar.DATE);
        int agreementDate = dateOfAgreement.get(Calendar.DATE);
        return (date - agreementDate) * getCharges();
    }

    public void sendEmail(double payment) {
        System.out.println("Email is sent successfully to " + this.email + "with payment amount " + payment);
    }
}

class Customer extends CustomerBusiness {
    String id;
    String name;
    String email;
    int charges;
    GregorianCalendar dateOfAgreement;

    Customer(String id, String name, String email, int charges, GregorianCalendar dateOfAgreement) {
        super(id, name, email, charges, dateOfAgreement);
    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(CustomerBusiness o) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Business extends CustomerBusiness {
    String id;
    String name;
    String email;
    int charges;
    double gstRate;
    GregorianCalendar dateOfAgreement;

    Business(String id, String name, String email, int charges, double gstRate, GregorianCalendar dateOfAgreement) {
        super(id, name, email, charges, dateOfAgreement);
        this.gstRate = gstRate;
    }

    double getGST() {
        return gstRate;
    }

    @Override
    public String toString() {
        return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(CustomerBusiness o) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class MyCompany {
    public static void main(String args[]) {
        CustomerBusiness c1 = new Customer("123", "Sruthi", "sruthi@gmail.com", 980,
                new GregorianCalendar(2022, 2, 28));
        CustomerBusiness c2 = new Customer("456", "Shravani", "shravani@gmail.com", 1500,
                new GregorianCalendar(2021, 10, 25));
        CustomerBusiness b1 = new Business("A12", "HSBC", "HSBC@gmail.com", 440, 4, new GregorianCalendar(2020, 12, 1));
        CustomerBusiness b2 = new Business("C31", "OpenText", "OpenText@gmail.com", 1200, 7,
                new GregorianCalendar(2021, 5, 17));
        List<CustomerBusiness> arr = new ArrayList<>(Arrays.asList(c1, c2, b1, b2));
        double[] pendingPayments = new double[arr.size()];
        for (int i = 0; i < 4; i++) {
            pendingPayments[i] = arr.get(i).calculatePayment(new GregorianCalendar(2022, 03, 31));
            arr.get(i).sendEmail(pendingPayments[i]);
        }
        Collections.sort(arr);

        arr.forEach(System.out::println);
        Collections.sort(arr, (a, b) -> (int) (a.getCharges() - b.getCharges()));
        arr.forEach(System.out::println);
        Collections.sort(arr,
                (a, b) -> (int) (((Calendar) a.dateOfAgreement).get(Calendar.DATE)
                        - ((Calendar) b.dateOfAgreement).get(Calendar.DATE)));
        arr.forEach(System.out::println);
    }
}