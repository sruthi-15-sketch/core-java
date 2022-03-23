class Student1 {
    private int rollNo;
    private String name;
    private String hometown;
    static final String university = "MLRIT";

    static int count;

    Student1() {
        rollNo = count;
        count++;
        name = "Indu";
        hometown = "Hyderabad";
    }

    Student1(String name) {
        this();
        this.name = name;
    }

    Student1(String name, String hometown) {
        this();
        this.name = name;
        this.hometown = hometown;
    }

    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getHomeTown() {
        return hometown;
    }

    String getUniversity() {
        return university;
    }

    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setHomeTown(String hometown) {
        this.hometown = hometown;
    }

    void display() {
        System.out.println("RollNo: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Hometown: " + this.hometown);
        System.out.println("University: " + this.university);
    }
}

class Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Sruthi");
        Student1 s3 = new Student1("Siva Sruthi", "Vizag");
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        s2.setName("Sohan");
        s1.display();
        s2.display();
        s3.display();
    }
}