import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}

public class EmployeeStatistics {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Vishal Singhal", 34, "male", "HR", 2013, 300000);
        Employee emp2 = new Employee(4, "Amitabh Singh", 35, "male", "Admin", 2014, 500000);
        Employee emp3 = new Employee(5, "Vivek Bhati", 28, "male", "Admin", 2017, 500000);
        Employee emp4 = new Employee(6, "Vipul Diwan", 34, "male", "Account", 2014, 200000);
        Employee emp5 = new Employee(7, "Satish Kumar", 29, "male", "Account", 2017, 75000);
        Employee emp6 = new Employee(8, "Geetika Chauhan", 30, "female", "Admin", 2016, 90000);
        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6));
        HashMap<String, Integer> h1 = new HashMap<>();
        HashMap<String, Float> age = new HashMap<>();
        HashMap<String, Integer> ethnicity = new HashMap<>();
        for (Employee e : employeeList) {
            if (h1.containsKey(e.department)) {
                h1.put(e.department, h1.get(e.department) + 1);
                int x = h1.get(e.department);
                age.put(e.department, (float) (age.get(e.department) + e.age));
            } else {
                h1.put(e.department, 1);
                age.put(e.department, (float) (e.age));
            }
            if (ethnicity.containsKey(e.gender)) {
                ethnicity.put(e.gender, ethnicity.get(e.gender) + 1);
            } else {
                ethnicity.put(e.gender, 1);
            }
        }
        System.out.println(h1);
        System.out.print("[");
        for (Map.Entry<String, Integer> m : h1.entrySet()) {
            System.out.print(m.getKey() + ":" + age.get(m.getKey()) / m.getValue());
            System.out.print(",");
        }
        System.out.println("]");
        double female_sum = 0;
        double male_sum = 0;
        int female_count = 0, male_count = 0;
        int highest_experienced = Integer.MAX_VALUE;
        Employee highestExperiencedEmployee = null;
        Employee highestPaidEmployee = null;
        double highestSalary = 0;
        int youngestEmployee = Integer.MAX_VALUE;
        Employee youngestEmployeeInOffice = null;
        for (Employee e : employeeList) {
            if (e.gender.equals("female")) {
                female_sum += e.salary;
                female_count += 1;
            } else {
                male_sum += e.salary;
                male_count += 1;
            }
            if (e.salary > highestSalary) {
                highestSalary = e.salary;
                highestPaidEmployee = e;
            }
            if (e.yearOfJoining < highest_experienced) {
                highest_experienced = e.yearOfJoining;
                highestExperiencedEmployee = e;
            }
            if (e.age < youngestEmployee) {
                youngestEmployee = e.age;
                youngestEmployeeInOffice = e;
            }
        }
        System.out.println("{female=" + (female_sum / female_count) + " male=" + (male_sum / male_count) + "]");
        System.out.println("Highest salary paid:[" + highestPaidEmployee + "]");
        System.out.println("Highest experienced employee:[" + highestExperiencedEmployee + "]");
        System.out.println("Youngest employee:[" + youngestEmployeeInOffice + "]");
        System.out.println(ethnicity);
    }
}