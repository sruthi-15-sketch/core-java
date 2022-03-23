import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student> {
    private String name;
    private int id;
    private String subject;

    double percentage;

    Student() {
    }

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    @Override
    public int compareTo(Student o) {

        return (int) (o.percentage - this.percentage);
    }

}

public class StudentStatistics {
    public static void main(String[] args) {
        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        HashMap<Boolean, ArrayList<Student>> h = new HashMap<>();
        ArrayList<Student> l1 = new ArrayList<>();
        ArrayList<Student> l2 = new ArrayList<>();
        System.out.println("Students with less than and greater than 60%:");
        for (Student i : studentList) {
            if (i.percentage >= 60) {
                l1.add(i);
                h.put(true, l1);
            } else {
                l2.add(i);
                h.put(false, new ArrayList<Student>(l2));
            }
        }
        System.out.println(h);
        System.out.println("Top 3 performing students:");
        List<Student> sortedList = studentList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < 3; i++)
            System.out.println(sortedList.get(i));

        System.out.println("Student names and percentage:");
        for (Student i : studentList) {
            System.out.println(i.getName() + "=" + i.percentage);
        }
        HashSet<String> set = new HashSet<>();
        for (Student i : studentList) {
            set.add(i.getSubject());
        }
        System.out.println("Subjects " + set);
        System.out.println("Highest Percentage: " + sortedList.get(0).getPercentage());
        System.out.println("Lowest Percentage: " + sortedList.get(sortedList.size() - 1).getPercentage());
        float sum = 0;
        for (int i = 0; i < sortedList.size(); i++) {
            sum += sortedList.get(i).getPercentage();
        }
        System.out.println("Average Percentage: " + (sum / sortedList.size()));

        System.out.println(studentList.size());
        HashMap<String, ArrayList<Student>> hmap = new HashMap<>();
        ArrayList<Student> l = new ArrayList<>();
        for (Student i : studentList) {
            if (i.getSubject().equals("Databases")) {
                l.add(i);
                hmap.put("Databases", new ArrayList<Student>(l));
                l.removeAll(l);
            } else if (i.getSubject().equals("Algorithms")) {
                l.add(i);
                hmap.put("Algorithms", new ArrayList<Student>(l));
                l.removeAll(l);
            } else if (i.getSubject().equals("Networking")) {
                l.add(i);
                hmap.put("Networking", new ArrayList<Student>(l));
                l.removeAll(l);
            } else {
                l.add(i);
                hmap.put("Automata", new ArrayList<Student>(l));
                l.removeAll(l);
            }
        }
        System.out.println(hmap);
    }
}