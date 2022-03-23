class Person {
    private String name;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name of Person: " + name);
    }
}

class Employee extends Person {
    // private String name;
    private double salary;
    private int start_year;
    private String UAN;

    Employee() {
        super();
        this.salary = 0;
        this.start_year = -1;
        this.UAN = "";
    }

    Employee(String name, double salary, int start_year, String UAN) {
        super(name);
        this.salary = salary;
        this.start_year = start_year;
        this.UAN = UAN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStart_Year() {
        return start_year;
    }

    public void setYearOfJoining(int start_year) {
        this.start_year = start_year;
    }

    public String getUAN() {
        return UAN;
    }

    public void setUAN(String UAN) {
        this.UAN = UAN;
    }

    @Override
    public String toString() {
        return "Employee [UAN=" + UAN + ", salary=" + salary + ", start_year=" + start_year + "]";
    }

}

class InheritanceTask {

    public static void main(String args[]) {
        Employee e1 = new Employee("Sruthi", 12000000, 2021, "a2022");
        Employee e2 = new Employee("Indu", 700000, 2020, "a2021");
        Person p = new Person("Sruthi");
        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));
        System.out.println(
                p.getName().equals(e1.getName()) ? "Person and Employee1 are same"
                        : "Person and Employee1 are not same");
        System.out.println(
                (p.getName().equals(e2.getName())) ? "Person and Employee2 are same"
                        : "Person and Employee2 are not same");
        if (e1.getName() == e2.getName() && e1.getSalary() == e2.getSalary() && e1.getUAN() == e2.getUAN()) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
    }
}