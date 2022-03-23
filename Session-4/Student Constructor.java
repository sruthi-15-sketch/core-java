class Student {
    private int rollNo;
    private String name;

    Student() {
        rollNo = 597;
        name = "Indu";
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("RollNo: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(567, "Sruthi");
        Student s3 = new Student(67);
        Student s4 = new Student("Siva Sruthi");
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        s2.setName("Sohan");
        s3.setRollNo(77);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}